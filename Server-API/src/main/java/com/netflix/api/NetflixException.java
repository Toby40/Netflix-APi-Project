package com.netflix.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)

public class NetflixException extends RuntimeException {

    public NetflixException(String message){super(message);}

    public NetflixException(String message,Throwable cause){super(message, cause);}
}
