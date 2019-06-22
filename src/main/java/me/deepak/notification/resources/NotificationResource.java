package me.deepak.notification.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import me.deepak.notification.beans.request.Request;
import me.deepak.notification.services.CommonService;

@RestController
@RequestMapping(value = "/notify", consumes = "application/json", produces = "application/json")
public class NotificationResource {

	@Autowired
	private CommonService commonService;

	@Autowired
	private Gson gson;

	@PostMapping
	public @ResponseBody String notify(@RequestBody Request request) {
		return gson.toJson(commonService.notify(request));
	}

}
