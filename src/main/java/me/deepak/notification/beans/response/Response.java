package me.deepak.notification.beans.response;

import me.deepak.notification.constants.NotificationType;

public class Response {

	private NotificationType type;
	private String statusCode;
	private String message;

	public Response(NotificationType type, String statusCode, String message) {
		this.type = type;
		this.statusCode = statusCode;
		this.message = message;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [type=" + type + ", statusCode=" + statusCode + ", message=" + message + "]";
	}

}
