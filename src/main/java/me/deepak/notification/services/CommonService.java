package me.deepak.notification.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.deepak.notification.beans.dao.UserDAO;
import me.deepak.notification.beans.request.Request;
import me.deepak.notification.beans.response.ConsolidatedResponse;
import me.deepak.notification.beans.response.Response;
import me.deepak.notification.constants.NotificationType;
import me.deepak.notification.constants.Plan;
import me.deepak.notification.helpers.MailHelper;
import me.deepak.notification.helpers.PushHelper;
import me.deepak.notification.helpers.SMSHelper;

@Service
public class CommonService {

	@Autowired
	private UserService userService;

	@Autowired
	private MailHelper mailHelper;

	@Autowired
	private SMSHelper smsHelper;

	@Autowired
	private PushHelper pushHelper;

	public ConsolidatedResponse notify(Request request) {
		String email = request.getEmail();
		UserDAO user = userService.getUser(email);
		Plan plan = user.getPlan();
		ConsolidatedResponse response = new ConsolidatedResponse();
		switch (plan) {
		case PLATINUM:
			response.setMailResponse(mailHelper.mail(request.getMailRequest(), email));
			response.setSmsResponse(smsHelper.sms(request.getSmsRequest(), email));
			response.setPushResponse(pushHelper.push(request.getPushRequest(), email));
			break;
		case GOLD:
			if (user.getNotificationsLeft() > 0) {
				response.setMailResponse(mailHelper.mail(request.getMailRequest(), email));
				user.setNotificationsLeft(user.getNotificationsLeft() - 1);
			} else {
				response.setMailResponse(quotaExhausted(NotificationType.EMAIL));
			}
			if (user.getNotificationsLeft() > 0) {
				response.setSmsResponse(smsHelper.sms(request.getSmsRequest(), email));
				user.setNotificationsLeft(user.getNotificationsLeft() - 1);
			} else {
				response.setMailResponse(quotaExhausted(NotificationType.SMS));
			}
			break;
		default:
			if (user.getNotificationsLeft() > 0) {
				response.setMailResponse(mailHelper.mail(request.getMailRequest(), email));
				user.setNotificationsLeft(user.getNotificationsLeft() - 1);
			} else {
				response.setMailResponse(quotaExhausted(NotificationType.EMAIL));
			}
			break;
		}
		return response;
	}

	private Response quotaExhausted(NotificationType notificationType) {
		return new Response(notificationType, "401", "Unauthorized Request!!! Notification quota exhausted.");
	}

}
