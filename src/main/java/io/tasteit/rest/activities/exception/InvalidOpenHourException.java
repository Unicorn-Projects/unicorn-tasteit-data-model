package io.tasteit.rest.activities.exception;

public class InvalidOpenHourException extends BadRequestException {

    private static final long serialVersionUID = -2855981964535132645L;
    private static final String ERROR_CODE = "invalid_open_hour";
    private static final String ERROR_DESCRIPTION = "open hour should has one start hour and one end hour, each of which should be within the range [0, 24):[0, 60)";
    
    public InvalidOpenHourException() {
        super(ERROR_CODE, ERROR_DESCRIPTION);
    }
}
