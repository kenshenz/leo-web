package com.ksn.leo.web.vo.user;

import java.io.Serializable;

public class UserVo implements Serializable {

	private static final long serialVersionUID = 5453461872322364080L;

	private String userId;

	private String username;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", username=" + username + "]";
	}

}
