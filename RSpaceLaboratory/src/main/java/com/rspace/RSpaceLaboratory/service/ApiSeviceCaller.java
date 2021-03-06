package com.rspace.RSpaceLaboratory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rspace.RSpaceLaboratory.Exception.BadRequest;
import com.rspace.RSpaceLaboratory.Exception.ProblemDetailsException;
import com.rspace.RSpaceLaboratory.config.AppConfigProperties;
import com.rspace.RSpaceLaboratory.config.Constant;

@Service
public class ApiSeviceCaller {

	public static final Logger logger = LoggerFactory.getLogger(ApiSeviceCaller.class);
	
	@Autowired
	RestTemplate restClient;
	
	@Autowired
	AppConfigProperties prop;


	/**
	 * Get API Call
	 * @param serviceulr
	 * @return
	 * @throws ProblemDetailsException 
	 * @throws BadRequest 
	 */
	public String getHttpService(String serviceulr) throws ProblemDetailsException, BadRequest {
		String response = null;
	
			ResponseEntity<String> apiResponse = restClient.exchange(serviceulr,HttpMethod.GET,new HttpEntity<Object>(createHeaders(prop.getRspaceApiKey())), String.class);
			logger.info("Http status code :" +apiResponse.getStatusCode());
			logger.info("Http response  :" + apiResponse.toString());
			if(HttpStatus.OK.equals(apiResponse.getStatusCode())){
				response= apiResponse.getBody();
			} else if(HttpStatus.BAD_REQUEST.equals(apiResponse.getStatusCode())) {
				throw new BadRequest(HttpStatus.BAD_REQUEST.name());
			}
		
		return response;
	}
	
	HttpHeaders createHeaders(String apiKey){
		   return new HttpHeaders() {{		      
		         set( Constant.APIKEY, apiKey );
		      }};
		}

}
