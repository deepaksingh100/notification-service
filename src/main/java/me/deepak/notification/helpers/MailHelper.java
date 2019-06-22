package me.deepak.notification.helpers;

import org.springframework.stereotype.Service;

import me.deepak.notification.beans.request.type.MailRequest;
import me.deepak.notification.beans.response.Response;
import me.deepak.notification.constants.NotificationType;

@Service
public class MailHelper {

	public Response mail(MailRequest mailRequest, String email) {

		// send mail
		return new Response(NotificationType.EMAIL, "200", "OK !!! Mail sent successfully.");

	}

}
