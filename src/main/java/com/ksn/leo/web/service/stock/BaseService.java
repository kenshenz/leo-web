package com.ksn.leo.web.service.stock;

import com.ksn.core.utils.HttpUtils;

public class BaseService {
	
	public String login() {
		
		String uri = "http://xueqiu.com";
		
		try {
			String result = HttpUtils.doGet(uri);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
