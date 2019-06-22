package me.deepak.notification.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import me.deepak.notification.beans.dao.UserDAO;
import me.deepak.notification.constants.Plan;

@Service
public class UserService {

	private static final Map<String, UserDAO> MAP = new HashMap<>();

	static {
		MAP.put("1", new UserDAO("1", Plan.PLATINUM, Long.MAX_VALUE));
		MAP.put("2", new UserDAO("2", Plan.GOLD, 10));
		MAP.put("3", new UserDAO("3", Plan.SILVER, 5));
	}

	public UserDAO getUser(String email) {
		return MAP.get(email);
	}

}
