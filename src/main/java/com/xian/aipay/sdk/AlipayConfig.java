package com.xian.aipay.sdk;

import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

@Configuration
public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101900723267";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCDl47M0HBeKc/K9zYQ1zxbDWbRDr49BUTXaHFgdM/cDpVW69GROnQzrpiwLMnEstVoasoZY+evnBrotY3gjRQavl0H/HpU3cCC/E+KX1O4NOGg3cjsuRFB4jBvrF7YoZJcYbU0H0zFKbYuWDMyioqDHXwRmmCXBItBxje3Hf1d6l++zCERtI4VfxR66PunBP6MYh0niFwgdBYwNf4/qYGgLd/mZr3ng7g1Iyfpj5qYEltE6lcy3XnbCsVEGIkxrFgwFqgVb60jU7E0Fj+5dYPIG3Kw6j84KYSx6GqLe9qFutZdz0q090Rv9B7O5mBsXkLvw5hfxPorDfuFMZ1ByvbPAgMBAAECggEAGplE7RNo0y/CZ7VGgWrwMTtpP/Kp822gN6ZN3IBgD4wHFbW++4sEN/oftOSouBCp4FxNk4pFJ5L3QXiJQA1kNe+qoFWhaIwWQKO9dCvGoWJXBQwvc+IIofeVcM03srQeAHxjgzCcdPH0eDOtzZaBXvVTwb8hrQTnHRly45m1QAk3h/HhiGvTUrWIPwaPOzCejb4WrIGiEnotEVwODGNB5L67dt5W1i4k/jLjkhqz6YoeYGmjClADHRsROhlir1jGWjpl4/iuezh04HlLH9vlPQ6e+ghfLh30ziAw3OUt7fqKELDz5+3sjMa85JRk+MkOEvvbrpA0n7cKaoIuT5/ZOQKBgQDbMv1c5E32WUDH0oikgoBR7QWcxbspyG+Re21rBOwB31oDJZaqH9Mw/UslpohWpP/NCZVfJXxw0FlfEukJ/k6A0us5kFwv5z3++Qq+KYV/EdZJuTAZshHfIknMU5zJndSyGVAQL5K1bKd3+AJoFZU/YIOPigMpTPHFwNzQY5wHpQKBgQCZr0fZLYxlyfKakNyEyx+DH9xtAbr7MBFb63ijdDoBYttRWXJMULlz+6X2EVuFzguA6A9GFo62MVIF8yPZFkX7BMz32zxfVzL4zq+GuBhFURsWrGkN4TUtUYctR9BTCIylabeC23hggMqPs3s3myM+4xCFPfXa10aMgb6gz3RaYwKBgA1hyof+RCgzALpyRvdMJEtcHgiZJbkCTJVkJKTw8vuWSCeDBvSx5rHJ9OmChjZL8nXxDNZ3MmaswZgFTobWqLJCriugfZBLHMTRLW+4lzbPvvZXQPGApoipzjmULTE92ntZAkNKtDkxPfQcBwGVt7vbx4xez5yY3vXEtXZfbmolAoGAKlw14Za8bBIN3KyxG6khNnNBvooLj9Df+AYfam5OzrMA4JtW9dIKS/3A8OI359mzMgTEsPzmuTE++oTaDKwm/dmE5Yx4R48xbYMKvodfqTuBy+4ZxsmcbrFaIRD6SujAW5eYDWmQ9IiLTLCb9ee8/0h29ULu0TMlLvVUJd8IoyECgYAW6t5xj4o8KByvby24ouXLRiqHA1xDFC26Fyn1aQJI5b6TWP2YAhQDBRLkBa9ghTz3dYEatOA8RC428S7Lio+760jBXnG3gJ9R3j5NMPlpiwv5XQdLCUw5rYn3xZyMyIrh8YD0mjF+dflrm+ovfrgc1x+2nRa4hPt8J7Ug1/0wIw==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4BVzjPvQhquasb8YTNukvVXCyh1z0PvMFQ+sQ/lyLUi4MgPQA2xfpm037UqezDHzBxPjiepEOPnNtfbxVJT9ut/VGQ4O5hI4R/BtEbiRMC7eB/T8pHz82xwypv2YVwOlWksE/JXewV/N5LsRAX1pELw3B+W1I/86vRgKIT43+XnfRXROVc5vp2gAN/+Judg1AfUF+fbJSli/oDGXakwFBsAs4xbc88JN+mx+Htq0yz6Od29ndY0ZDEJkA0evyt+8lctJuPMO6wi5NR1zg7gURfgN/qlGcQ+pW29kvMp27ftOVW5/yV1mdHbT7wwYjVr+PFZIqFO6PCvcUPlbiG+lhwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://xian.free.idcfengye.com/pay/notify";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://xian.free.idcfengye.com/pay/return";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl =
            "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path =
            "https://openapi.alipaydev.com/gateway.do";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

