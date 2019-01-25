package com.jiagouedu.common.utils;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.demo.trade.config.Configs;
import com.alipay.demo.trade.service.AlipayTradeService;
import com.alipay.demo.trade.service.impl.AlipayTradeServiceImpl;

/**
 * 配置公共参数
 * 创建者 悟空老师 245553999
 * 创建时间	2019年1月16日
 */
public final class AliPayConfig {
	
	 /**
     * 私有的默认构造子，保证外界无法直接实例化
     */
    private AliPayConfig(){};
    
	/**
     * 收款方账号
     */
    public static final String SELLER_ID = "zhifu@52itstyle.com";
	 /**
     * 参数类型
     */
    public static String PARAM_TYPE = "json";
    /**
     * 编码
     */
    public static String CHARSET = "UTF-8";
    /**
     * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
		private  static AlipayClient alipayClient = new DefaultAlipayClient(
													Configs.getOpenApiDomain(), Configs.getAppid(),
													Configs.getPrivateKey(), PARAM_TYPE, CHARSET,
													Configs.getAlipayPublicKey());
		
		private  static AlipayTradeService tradeService = new AlipayTradeServiceImpl.ClientBuilder().build();
    }
    /**
     * 支付宝APP请求客户端实例
     * @Author  悟空老师
     * @return  AlipayClient
     * @Date	2018年7月27日
     * 更新日志
     * 2018年7月27日  悟空老师 首次创建
     *
     */
    public static AlipayClient getAlipayClient(){
       AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "2019011663017812","MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDD7Q+HYpon8j4q\n" +
               "MPyjf9JsuXXytKeuqECJNduzp+YYfgVrlm5DQZe1dywYHDGg/ZW1gauUtpJqIDcR\n" +
               "uiNPFUQauH7CCUSl065RzdAUXrZYOueSlkQbBOS/Grx6L3SNXubRUbea2kScBDp1\n" +
               "eqEVlKPT80y096oooycGJ/LrwRf34ucjGYXZOH1yIUj5EYgzXrLArP+vhSZyatdT\n" +
               "XDCPm06z+4XOvrsNdPJIqaB5dGtszm952DRc0G4qUnFDmEoV1kG8RO2TZPPCiiST\n" +
               "uqhCI8gGb5W9rgQQkxDhLZssyAiRbswXwEc5++XJNmzc8g6QMRrSFJjS/wWFw7X9\n" +
               "pM4xu0PRAgMBAAECggEAHdg7mFTlxJX68DRcF4+9/v/VPq5UKJ/KjNweZmR6AVsY\n" +
               "+kWE8EvKj0Li/Z011h8qseZZu6J/9RiJKvMes8o6gJOAA5Cj21q+YAmo26F9xzzZ\n" +
               "z5OCNldtfMrW0QnviCVfpZz8CeObteRS/1g5t27X8c5K7foX+m634BEvyMe2HfU2\n" +
               "17Q4BvBpTSziB/LC4zobRAbt5QdFi3RNIOWLxR9sWlMsTdN6/LUhrFah8si2VyrN\n" +
               "5QmdvKpOCg142Zc2fAhlLTN9qD4NAhgJGRDukQKWWfvfIYMHwovPx9ywG3/tLe6y\n" +
               "2yY2Mr21Mavahad7l4wDQiqGleIyp3vJHitlq0ZpEQKBgQD1yFI0q8pgBDqPDZHQ\n" +
               "sWJeG50cCT6iiBtagINt1My0rnrQqUUBFeVgnyfeeJjAl1DDiAo5k4VpHNmYC8XK\n" +
               "JNoVKJGqlETYHzxuNPZNr0Ivsui1SpRSMuUp4j76la4jP1j26Hdg/5Znd17jibLz\n" +
               "z2rBoWVeTsXzSHwGNM/AAW53LQKBgQDMEieDW6DvNFoxrglZpwpyl9MxYFdSoqP+\n" +
               "cmjVvXgRZh1FcWLU3MKdmZmZWPppKe556v729UvfoSPx79bOU9gdJl1O2cu77qtB\n" +
               "Wxlluu69rKH0FTB8J0mTgjcfXgsU/uaNJ989Iq21HD7gCe5sZsairhzjD7Q5QF8i\n" +
               "l47FPbWltQKBgCPVf/7D6S6Uj0EaFl9Z7WCRIBfdVS93Lp3ETOUveGUDZ06Sz0e4\n" +
               "PIgYzERISuURaqoHZI4+bt4DYcokNUMimlUpZAt9sIfeDf53ZE2xNrIjoIAGDpfp\n" +
               "abXwkYQRXKEw9DSTcgxHV1NgeQotolSfsg3nDRNx4rR0pfh1rLBuxP9FAoGAUSJG\n" +
               "o2siqPffhDD1drd65+SFCvSKw0f2e4txMsmJmyFGMf3KlWbP2WjgMJ+3r2gEcGSF\n" +
               "yhnseJTQfbglZxLesXg3UMo2vhk97VYS2udfU/n2ydxC0pmsHwF+ePIi5c4SS7y2\n" +
               "fM/00DTSqrBIIsEZ6EPhKEVuGfUF3fLzyGeoeKECgYEAkYiVrV7if22DT6qvzXZ9\n" +
               "H/FG7+Qnf3Fau6ed22fR6xrpNx96FoBF1tf7w5ij8ZAbPnhFl0spG+++XFRpepxj\n" +
               "RxYCFSYZOPHYFTc6phdTCbWY4aYgO4hZdjGXO4m6X83mVX209BLuFyzowf87SKj/\n" +
               "3BJGZMDYQA/APvxTKoGm3ns=", PARAM_TYPE,CHARSET, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtY0jGpEGC9JmPb9qZp3EmgJULRktoadGKtslCiwiNNlUNWsPp3Gl4+J4qz33gC02q2OuiJgwd6meCPQetTyQb6Mk/07e7clvJLVSyygDSUgp+V/3+4GqIgBkEg4fFwfIZQAEoAy/IXauXywCl8LGfgQkcl5GTLzWwcJkmDI+9jSILXL0GSUuD9GgYp7adqasS9B6grJ5APDbJ0e8rdl7eDhO28WBGQr7E6/1mjt/aEPkUIPJLsJqz/Jt5j1UaJGoaCfrhE/q4FDK9OhfxdBGDdAjeRjA6NDaAMOppnfneQsnU7qoxwL3PPEGoqyl4apxnpYh26zg9lfdyyfCm/8eWwIDAQAB","RSA2");
       return alipayClient;
       //      return SingletonHolder.alipayClient;
   }
    /**
     * 电脑端预下单
     * @Author  悟空老师
     * @return  AlipayTradeService
     * @Date	2018年7月27日
     * 更新日志
     * 2018年7月27日  悟空老师 首次创建
     *
     */
    public static AlipayTradeService getAlipayTradeService(){
        return SingletonHolder.tradeService;
    }
}
