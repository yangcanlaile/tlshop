package com.jiagouedu.common.utils;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 初始化参数 
 * 创建者 悟空老师 245553999
 * 创建时间	2019年1月16日
 *
 */
@Component
public class InitUtil {
	@PostConstruct
	public void init() {
		// 初始化 支付宝 微信 银联 参数 涉及机密 此文件不提交 请自行配置加载
		ConfigUtil.init("zfbinfo.properties");
		ConfigUtil.init("wxinfo.properties");
		SDKConfig.getConfig().loadPropertiesFromSrc();
	}

}
