package com.rspace.RSpaceLaboratory.Util;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rspace.RSpaceLaboratory.Exception.DataNotFoundException;
import com.rspace.RSpaceLaboratory.config.Constant;
import com.rspace.RSpaceLaboratory.config.HttpStatusCodes;
import com.rspace.RSpaceLaboratory.model.ErrorDetails;
import com.rspace.RSpaceLaboratory.model.UserLabReport;

public class Utility {
	
	

	/**
	 *  Transform  ErrorDetails to ResponseEnity Model
	 * @param errorObj
	 * @return
	 */
	public static ResponseEntity<UserLabReport> mapErrorDetailsToResponseEnity(UserLabReport userLabReport) {
		 ErrorDetails errorObj =userLabReport.getErrorDetails();
		if (HttpStatusCodes.STATUS_404.getHttpCode() == userLabReport.getErrorDetails().getStatus()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userLabReport);
		} else if (HttpStatusCodes.STATUS_500.getHttpCode() == errorObj.getStatus()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(userLabReport);
		} else if (HttpStatusCodes.STATUS_401.getHttpCode() == errorObj.getStatus()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(userLabReport);
		} else if (HttpStatusCodes.STATUS_400.getHttpCode() == errorObj.getStatus()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(userLabReport);
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(userLabReport);
	}

	/**
	 *  Map  exceptions to ErrorDetails
	 * @param errorObj
	 * @return
	 */
	public static UserLabReport mapErrorDetails(UserLabReport userSamples, Exception e) {
		ErrorDetails errorDetails = new ErrorDetails();
		if (e instanceof DataNotFoundException) {
			errorDetails.setStatus(HttpStatusCodes.STATUS_404.getHttpCode());
			errorDetails.setDetail(e.getMessage());
			errorDetails.setError(e.getMessage());
			errorDetails.setTimestamp((new Timestamp(new Date().getTime()).toString()));
			 userSamples.setErrorDetails(errorDetails);
		} else {

			errorDetails.setStatus(HttpStatusCodes.STATUS_500.getHttpCode());
			errorDetails.setDetail(e.getMessage());
			errorDetails.setError(e.getMessage());
			errorDetails.setTimestamp((new Timestamp(new Date().getTime()).toString()));
			userSamples.setErrorDetails(errorDetails);;
		}
		return userSamples;

	}
	
	/**
	 *  Build the RSpace get sample backend url
	 *  	  
	 * @param pageNumber
	 * @param pageSize
	 * @param orderBy
	 * @return
	 */
	public static String getRpaceGetSampleUrl(String hostName, String sampleUrl, Integer pageNumber, Integer pageSize, String orderBy) {
		StringBuilder apiUrl = new StringBuilder();
		apiUrl.append(hostName).append(sampleUrl).append("?")
				.append(Constant.PAGE_NUMBER).append(Constant.EQUAL_TO).append(pageNumber).append(Constant.AMPERSAND)
				.append(Constant.PAGE_SIZE).append(Constant.EQUAL_TO).append(pageSize).append(Constant.AMPERSAND)
				.append(Constant.ORDER_BY).append(Constant.EQUAL_TO).append(orderBy);
		return apiUrl.toString();

	}

}
