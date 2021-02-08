package com.rspace.RSpaceLaboratory.Exception;

public class BadRequest extends Exception {		

	/**
	 * 
	 */
	private static final long serialVersionUID = -5339277921773223401L;

	public BadRequest(String errorMessage) {
		super(errorMessage);
	}

}
