package io.tasteit.rest.activities.exception;

import javax.annotation.Nonnull;

public class BadTokenRequestException extends BadRequestException {

    private static final long serialVersionUID = 204677130416245925L;
    
    public BadTokenRequestException(@Nonnull String errorCode, @Nonnull String errorDescription) {
        super(errorCode, errorDescription);
    }
}