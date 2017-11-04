package dk.topdanmark.error;

public final class ErrorInfo {
	
	private String errorCode;
	private String errorMessage;
	private String systemID;
	
	
	public ErrorInfo(String errorCode, String errorMessage, String systemID) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.systemID = systemID;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public String getSystemID() {
		return systemID;
	}
	
	
}
