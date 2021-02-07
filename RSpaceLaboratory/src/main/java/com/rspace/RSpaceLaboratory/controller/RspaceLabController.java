package com.rspace.RSpaceLaboratory.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rspace.RSpaceLaboratory.Util.Utility;
import com.rspace.RSpaceLaboratory.model.UserLabReport;
import com.rspace.RSpaceLaboratory.service.RspaceLabService;

@RestController
@RequestMapping("/api/v1/")
public class RspaceLabController {
	
	@Autowired RspaceLabService rspaceLabService;
	
	/**
	 * The Api to   fetch user laboratory samples details
	 * @param userName - User name 
	 * @param pageNumber - Starting from zero
	 * @param pageSize - Minimum pageSize 1 , Maximum pageSize 20 
	 * @param orderBy  - Order
	 * @return  - return the  user sample details
	 */	
	@GetMapping("user/{userName}/sample")
	ResponseEntity<UserLabReport> findUserSamples(@PathVariable String userName,@RequestParam("pageNumber") Integer pageNumber,@RequestParam("pageSize") Integer pageSize,@RequestParam("orderBy") String orderBy) {
		UserLabReport response = rspaceLabService.findUserSamples(userName, pageNumber, pageSize, orderBy);
		if(response.getErrorDetails()!=null) {			
			return Utility.mapErrorDetailsToResponseEnity(response);
		}
		return  ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	/**
	 * Handle validation errors.
	 * 
	 * @param ex
	 * @return
	 */
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	

}
