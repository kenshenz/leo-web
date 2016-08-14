package com.ksn.leo.web.client.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ksn.core.pojo.resp.Response;
import com.ksn.leo.web.client.ice.login.LoginIceClient;

@Component
public class LoginClient {
	@Autowired
	private LoginIceClient client;

	public Response login(String username, String password) {
		Response resp = client.login(username, password);
		return resp;
	}
}
