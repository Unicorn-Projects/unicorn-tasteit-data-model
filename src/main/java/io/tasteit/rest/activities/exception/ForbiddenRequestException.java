package io.tasteit.rest.activities.exception;

public class ForbiddenRequestException extends RuntimeException {

    private static final long serialVersionUID = 5435374431725360367L;

    public static final String FORBIDDEN_REQUEST = "Forbidden Request";
    
    private final String errorType;
    private final String errorCode;
    private final String errorDescription;
    
    public ForbiddenRequestException(String errorCode, String errorDescription) {
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
        return "ForbiddenRequest [exceptionType=" + errorType
                + ", errorCode=" + errorCode + ", errorDescription="
                + errorDescription + "]";
    }
    
    @Override
    public String getMessage() {
        return "[" + errorCode + "] " + errorDescription;
    }
}
