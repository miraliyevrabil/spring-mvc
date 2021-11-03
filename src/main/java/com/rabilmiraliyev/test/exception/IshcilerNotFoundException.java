package com.rabilmiraliyev.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class IshcilerNotFoundException extends RuntimeException {

	public IshcilerNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
