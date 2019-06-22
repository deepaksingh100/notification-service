package me.deepak.notification.helpers;

import org.springframework.stereotype.Service;

import me.deepak.notification.beans.request.type.SMSRequest;
import me.deepak.notification.beans.response.Response;
import me.deepak.notification.constants.NotificationType;

@Service
public class SMSHelper {

	public Response sms(SMSRequest smsRequest, String email) {

		// send sms
		return new Response(NotificationType.SMS, "200", "OK !!! SMS sent successfully.");

	}

}
