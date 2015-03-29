package io.tasteit.rest.activities.exception;

public class InvalidNameException extends BadRequestException {
    
    private static final long serialVersionUID = 4007298826530574636L;
    private static final String ERROR_CODE = "invalid_name";
    private static final String ERROR_DESCRIPTION = "Name should only contain lower case alphanumeric characters, dashes and underscores. The number of characters should be at least 5 and no more than 15";
    
    public InvalidNameException() {
        super(ERROR_CODE, ERROR_DESCRIPTION);
    }
}
