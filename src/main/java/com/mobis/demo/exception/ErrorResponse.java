package com.mobis.demo.exception;


public class ErrorResponse {
	
	private int statusCode;
    private String message;
    
    public ErrorResponse(String message)
    {
        super();
        this.message = message;
    }

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [statusCode=" + statusCode + ", message=" + message + "]";
	}
    
    

}
