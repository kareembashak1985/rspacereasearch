package com.rspace.RSpaceLaboratory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rspace.RSpaceLaboratory.Exception.BadRequest;
import com.rspace.RSpaceLaboratory.Exception.DataNotFoundException;
import com.rspace.RSpaceLaboratory.Exception.ProblemDetailsException;
import com.rspace.RSpaceLaboratory.Util.Utility;
import com.rspace.RSpaceLaboratory.config.AppConfigProperties;
import com.rspace.RSpaceLaboratory.config.Constant;
import com.rspace.RSpaceLaboratory.externalapi.model.RspaceSampleResponse;
import com.rspace.RSpaceLaboratory.mapper.RspaceApiResponseMapper;
import com.rspace.RSpaceLaboratory.model.UserLabReport;

@Service
public class RspaceLabServiceImpl implements RspaceLabService {
	
	
	
    private static final Logger log = LoggerFactory.getLogger(RspaceLabServiceImpl.class);

	@Autowired
	ApiSeviceCaller apiServiceCaller;
	@Autowired
	AppConfigProperties prop;
	
	
	
	/**
	 * Fetch the user samples from Rspace service and transform into user samples
	 */
	public UserLabReport findUserSamples(String userName, Integer pageNumber, Integer pageSize, String orderBy) {
		UserLabReport userSamples = new UserLabReport() ;
		try {
			String httpResponse = apiServiceCaller.getHttpService(Utility.getRpaceGetSampleUrl(prop.getRspaceHostName(),
					prop.getRspaceGetSamplesUrl(), pageNumber, pageSize, orderBy));
			RspaceSampleResponse rspaceUserSampleRes = RspaceApiResponseMapper.transformToRspaceSampleResponse(httpResponse);
			userSamples = RspaceApiResponseMapper.transformToUserSamples(rspaceUserSampleRes,userName);
			if(userSamples ==null || userSamples.getUserId()==null) {
				throw new DataNotFoundException(Constant.DATA_NOT_FOUND); 
			}			
			
		} catch (BadRequest e) {
			log.error("Bad request " +  e.getMessage());			
			return Utility.mapErrorDetails(userSamples,e);
		} catch (ProblemDetailsException e) {
			log.error("Error encounter while processing the request " +  e.getMessage());			
			return Utility.mapErrorDetails(userSamples,e);
		} catch (DataNotFoundException e) {
			log.error("User not found for the given request " + "UserName=" + userName + " : "+ e.getMessage());			
			return Utility.mapErrorDetails(userSamples,e);
		} catch (Exception e) {
			log.error("Error encounter while processing the fetching user samples " + "UserName=" + userName + " : " + e.getMessage());
			return Utility.mapErrorDetails(userSamples,e);
		}
		return userSamples;
	}

}
