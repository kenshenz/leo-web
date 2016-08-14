package com.ksn.leo.web.controller.common;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ksn.core.annonation.LoggerAnnotation;
import com.ksn.core.pojo.resp.Response;
import com.ksn.leo.web.client.login.LoginClient;
import com.ksn.leo.web.controller.BaseController;
import com.ksn.leo.web.pojo.resp.GetPicCaptchaResp;

@Controller
@RequestMapping("/common/user")
public class LoginController extends BaseController {
	
	@Autowired
	private LoginClient loginClient;

	@RequestMapping(path = "/login.htm", method = RequestMethod.GET)
	@ResponseBody
	@LoggerAnnotation(desc = "登录请求")
	public Response login(String username, String password) {
		Response resp = loginClient.login(username, password);
		return resp;
	}

	@RequestMapping(path = "/logout.htm", method = RequestMethod.POST)
	@ResponseBody
	@LoggerAnnotation(desc = "登出请求")
	public Response logout(HttpSession session) {
		session.removeAttribute("user");
		return Response.success();
	}

	@RequestMapping(path = "/regist.htm", method = RequestMethod.POST)
	@ResponseBody
	@LoggerAnnotation(desc = "注册请求")
	public Response register(String username, String password) {
		if (username.toLowerCase().trim().equals(password.toLowerCase().trim())) {
			return Response.success();
		} else {
			return Response.error();
		}
	}

	@RequestMapping(path = "/getPicCaptcha.htm", method = RequestMethod.POST)
	@ResponseBody
	@LoggerAnnotation(desc = "获取图形验证码")
	public GetPicCaptchaResp getPicCaptcha() {
		GetPicCaptchaResp resp = new GetPicCaptchaResp();
		resp.setCode("0");
		resp.setMsg("success");
		resp.setCaptcha("8888");
		return resp;
	}
}
