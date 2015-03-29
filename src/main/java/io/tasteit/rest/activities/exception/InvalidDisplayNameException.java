package io.tasteit.rest.activities.exception;

public class InvalidDisplayNameException extends BadRequestException {
    
    private static final long serialVersionUID = 4007298826530574636L;
    private static final String ERROR_CODE = "invalid_display_name";
    private static final String ERROR_DESCRIPTION = "Display name should only contain lower/upper case letters and spaces. The number of characters should be at least 3 and no more than 25";
    
    public InvalidDisplayNameException() {
        super(ERROR_CODE, ERROR_DESCRIPTION);
    }
}