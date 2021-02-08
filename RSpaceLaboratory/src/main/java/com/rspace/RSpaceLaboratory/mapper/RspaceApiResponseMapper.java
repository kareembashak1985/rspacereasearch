package com.rspace.RSpaceLaboratory.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rspace.RSpaceLaboratory.Exception.ProblemDetailsException;
import com.rspace.RSpaceLaboratory.Util.Utility;
import com.rspace.RSpaceLaboratory.config.Constant;
import com.rspace.RSpaceLaboratory.externalapi.model.Owner;
import com.rspace.RSpaceLaboratory.externalapi.model.RspaceSampleResponse;
import com.rspace.RSpaceLaboratory.model.Quantity;
import com.rspace.RSpaceLaboratory.model.Sample;
import com.rspace.RSpaceLaboratory.model.UserLabReport;

public class RspaceApiResponseMapper {

	static ObjectMapper objectMapper = new ObjectMapper();

	private static final Logger logger = LoggerFactory.getLogger(RspaceApiResponseMapper.class);

	public static RspaceSampleResponse transformToRspaceSampleResponse(String apiResponse) {
		logger.info("******* Rspace sample response  ********* ");
		RspaceSampleResponse response = null;
		try {
			if (apiResponse == null) {
				throw new ProblemDetailsException(Constant.BKND_SERVICE_ERROR);
			}
			response = objectMapper.readValue(apiResponse, RspaceSampleResponse.class);

			logger.info(response.toString());

		}  catch (ProblemDetailsException e) {
			logger.error("Error encounter while marshalling the api response : " + e.getMessage());
		} catch (Exception e) {
			logger.error("Error encounter while marshalling the api response : " + e.getMessage());
		}
		return response;
	}

	public static UserLabReport transformToUserSamples(RspaceSampleResponse response, String userName) {
		logger.info("******* Rspace sample response  ********* ");
		UserLabReport usersamples = new UserLabReport();
		try {
			if (response == null) {
				throw new ProblemDetailsException(Constant.BKND_SERVICE_ERROR);
			}
			response.getSamples().stream().filter(s->s.getOwnerObject().getUsername().equalsIgnoreCase(userName)).forEach( s -> {			
			
				Owner ownerObj=s.getOwnerObject();
				usersamples.setEmail(ownerObj.getEmail());
				usersamples.setUserId(Float.floatToIntBits(ownerObj.getId()));
				usersamples.setUserName(ownerObj.getUsername());
				usersamples.setFirstName(ownerObj.getFirstName());
				usersamples.setLastName(ownerObj.getLastName());
				
				
				Sample sample = new Sample();
				sample.setSampleId(Float.floatToIntBits(s.getId()));
				sample.setExpiryDate(s.getExpiryDate());
				sample.setTestName(s.getName());
				sample.setBarcode(s.getBarcode());
				sample.setCreated(s.getCreated());
				sample.setCreatedBy(s.getCreatedBy());
				sample.setDescription(s.getDescription());
				sample.setGlobalId(s.getGlobalId());
				sample.setSampleId(Float.floatToIntBits(s.getId()));
				sample.setSampleType(s.getType());
				sample.setTestName(s.getName());
				Quantity quantity= new Quantity();
				quantity.setNumericValue(s.getQuantity().getNumericValue());
				quantity.setUnitId(s.getQuantity().getUnitId());
				sample.setQuantityObject(quantity);				
				usersamples.setUserSamples(sample);				
			} );

			logger.info(response.toString());

		} catch (ProblemDetailsException e) {
			logger.error("Error encounter while marshalling the api response : " + e.getMessage());
			return Utility.mapErrorDetails(usersamples, e);
		}  catch (Exception e) {
			logger.error("Error encounter while tranform RspaceSampleResponse to UserSamples : " + e.getMessage());
		}
		return usersamples;
	}

}
