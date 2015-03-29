package io.tasteit.rest.activities.exception;

public class UnauthorizedRequestException extends RuntimeException {

    private static final long serialVersionUID = 2499162544352278690L;

    public static final String UNAUTHORIZED_REQUEST = "Unauthorized Request";
    
    private final String errorType;
    private final String errorCode;
    private final String errorDescription;
    
    public UnauthorizedRequestException(String errorCode, String errorDescription) {
        super();
        this.errorType = this.getClass().getSimpleName();
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }
    
    public String getErrorType() {
        return errorType;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }
    
    @Override
    public String toString() {
        return "UnauthorizedRequest [exceptionType=" + errorType
                + ", errorCode=" + errorCode + ", errorDescription="
                + errorDescription + "]";
    }
    
    @Override
    public String getMessage() {
        return "[" + errorCode + "] " + errorDescription;
    }
}
