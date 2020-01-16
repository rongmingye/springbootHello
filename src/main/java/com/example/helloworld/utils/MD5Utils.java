package com.example.helloworld.utils;

import org.springframework.util.DigestUtils;

/**
 * MD5加密工具
 * @author shawenguan
 * @date 2019/08/15
 */
public class MD5Utils {

	/**
	 * 使用md5生成加密后的密码
	 * @param password
	 * @return
	 */
	public static String encrypt(String password) {
		return  DigestUtils.md5DigestAsHex(password.getBytes());
	}
	

}
