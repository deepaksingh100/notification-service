package me.deepak.notification.beans.request;

import me.deepak.notification.beans.request.type.MailRequest;
import me.deepak.notification.beans.request.type.PushRequest;
import me.deepak.notification.beans.request.type.SMSRequest;

public class Request {

	private String email;
	private MailRequest mailRequest;
	private SMSRequest smsRequest;
	private PushRequest pushRequest;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MailRequest getMailRequest() {
		return mailRequest;
	}

	public void setMailRequest(MailRequest mailRequest) {
		this.mailRequest = mailRequest;
	}

	public SMSRequest getSmsRequest() {
		return smsRequest;
	}

	public void setSmsRequest(SMSRequest smsRequest) {
		this.smsRequest = smsRequest;
	}

	public PushRequest getPushRequest() {
		return pushRequest;
	}

	@Override
	public String toString() {
		return "Request [email=" + email + ", mailRequest=" + mailRequest + ", smsRequest=" + smsRequest
				+ ", pushRequest=" + pushRequest + "]";
	}

	public void setPushRequest(PushRequest pushRequest) {
		this.pushRequest = pushRequest;
	}

}
