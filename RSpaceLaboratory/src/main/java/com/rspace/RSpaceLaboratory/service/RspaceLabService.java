package com.rspace.RSpaceLaboratory.service;

import com.rspace.RSpaceLaboratory.model.UserLabReport;

public interface RspaceLabService {
	
	UserLabReport findUserSamples(String userName,Integer pageNumber,Integer pageSize,String orderBy);

}
