package dk.topdanmark.error;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	public int getHttpStatusCode(){
		int status = 500;
		String errorCode = getErrorCode();
		
		switch (errorCode) {
			case "ERR500":
				status = 500;
				 break;
			case "ERR429":
				status = 429;
				 break;
			case "ERR503":
				status = 503;
				 break;
			case "ERR424":
				status = 424;
				 break;
			case "ERR599":
				status = 599;
				 break;
			case "ERR400":
				status = 400;
				 break;
			default:
				status = 500;	
		}
		return status;
	}
	
}
