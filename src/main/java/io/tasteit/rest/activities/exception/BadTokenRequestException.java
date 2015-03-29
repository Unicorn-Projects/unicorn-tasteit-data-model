package io.tasteit.rest.activities.exception;

import io.tasteit.rest.activities.exception.TokenErrors.TokenErrCode;

import javax.annotation.Nonnull;

public class BadTokenRequestException extends BadRequestException {

    private static final long serialVersionUID = 204677130416245925L;
    
    public BadTokenRequestException(@Nonnull TokenErrCode errorCode, @Nonnull String errorDescription) {
        super(errorCode.toString(), errorDescription);
    }
}