package me.deepak.notification.beans.response;

public class ConsolidatedResponse {

	private Response mailResponse;
	private Response smsResponse;
	private Response pushResponse;

	public Response getMailResponse() {
		return mailResponse;
	}

	public void setMailResponse(Response mailResponse) {
		this.mailResponse = mailResponse;
	}

	public Response getSmsResponse() {
		return smsResponse;
	}

	public void setSmsResponse(Response smsResponse) {
		this.smsResponse = smsResponse;
	}

	public Response getPushResponse() {
		return pushResponse;
	}

	public void setPushResponse(Response pushResponse) {
		this.pushResponse = pushResponse;
	}

	@Override
	public String toString() {
		return "ConsolidatedResponse [mailResponse=" + mailResponse + ", smsResponse=" + smsResponse + ", pushResponse="
				+ pushResponse + "]";
	}

}
