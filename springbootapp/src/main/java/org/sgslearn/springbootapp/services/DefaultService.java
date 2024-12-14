package org.sgslearn.springbootapp.services;

import java.util.Date;

import org.sgslearn.springbootapp.dtos.DefaultResponse;
import org.springframework.stereotype.Service;

@Service
public class DefaultService {

	public DefaultResponse getDefaultResponse() {
		
		return new DefaultResponse(new Date());
	}
}
