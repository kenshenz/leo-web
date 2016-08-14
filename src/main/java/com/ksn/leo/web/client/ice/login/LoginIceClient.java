package com.ksn.leo.web.client.ice.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ksn.core.pojo.resp.Response;
import com.ksn.core.rpc.ice.CommunicatorFactory;
import com.ksn.leo.rpc.ice.login.LoginReq;
import com.ksn.leo.rpc.ice.login.LoginResp;
import com.ksn.leo.rpc.ice.login.LoginWorkerPrx;
import com.ksn.leo.rpc.ice.login.LoginWorkerPrxHelper;
import com.ksn.leo.web.client.ice.IceClient;

import Ice.Communicator;
import Ice.ObjectPrx;

@Component
public class LoginIceClient extends IceClient {
	@Autowired
	private CommunicatorFactory factory;
	
	public Response login(String username, String password) {
		Response resp = Response.success();
		Communicator ic = factory.getCommunicator();
		ObjectPrx proxy = ic.stringToProxy("LoginWorker:default -p 10000");

		LoginWorkerPrx workerProxy = LoginWorkerPrxHelper.checkedCast(proxy);

		if (workerProxy == null) {
			throw new Error("invaild proxy");
		}
		//组装参数
		LoginReq iceReq = new LoginReq(username, password);
		//执行请求
		LoginResp iceResp = workerProxy.login(iceReq);
		//组装响应
		resp.setCode(iceResp.code);
		resp.setMsg(iceResp.msg);
		return resp;
	}
}
