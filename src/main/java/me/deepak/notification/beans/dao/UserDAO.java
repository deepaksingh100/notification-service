package me.deepak.notification.beans.dao;

import me.deepak.notification.constants.Plan;

public class UserDAO {

	private String email;
	private Plan plan;
	private long notificationsLeft;

	public UserDAO(String email, Plan plan, long notificationsLeft) {
		this.email = email;
		this.plan = plan;
		this.notificationsLeft = notificationsLeft;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public long getNotificationsLeft() {
		return notificationsLeft;
	}

	public void setNotificationsLeft(long notificationsLeft) {
		this.notificationsLeft = notificationsLeft;
	}

}
