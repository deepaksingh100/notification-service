package me.deepak.notification.helpers;

import org.springframework.stereotype.Service;

import me.deepak.notification.beans.request.type.PushRequest;
import me.deepak.notification.beans.response.Response;
import me.deepak.notification.constants.NotificationType;

@Service
public class PushHelper {

	public Response push(PushRequest pushRequest, String email) {

		// send push notification
		return new Response(NotificationType.PUSH, "200", "OK !!! Push notification sent successfully.");

	}

}
