package com.ksn.leo.web.pojo.resp;

import com.ksn.core.pojo.resp.Response;

public class GetPicCaptchaResp extends Response {

	private static final long serialVersionUID = -4546710629887512330L;

	private String captcha;

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	@Override
	public String toString() {
		return "GetPicCaptchaResp [captcha=" + captcha + "]";
	}

}
