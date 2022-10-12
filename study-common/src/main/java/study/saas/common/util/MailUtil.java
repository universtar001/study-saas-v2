package study.saas.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MailUtil {

    // 1. 服务正常
    private static final String SUCCESS_MESSAGE = "1";
    // 2. 服务异常
    private static final String ERROR_MESSAGE = "2";
    // 3. 服务未正常启动
    private static final String NULL_MESSAGE = "3";

    private static final Log log = LogFactory.getLog(MailUtil.class);

    // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    public static String myEmailAccount = "jerryhou@saas.top";
    public static String myEmailPassword = "271604lX";
    //发件人  端口
    public static String myEmailPort = "465";
    //SMTP服务器地址
    public static String myEmailSMTPHost = "smtp.exmail.qq.com";


    /**
     * 发送邮件的准备工作
     * @return
     */
    public static void sendMail(String echoName,String serviceName, String serviceState) throws Exception {
        // 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", myEmailSMTPHost);   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.port", myEmailPort);       //发件人服务端口
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证

        // SSL
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", "465");

        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        session.setDebug(true);

        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session, myEmailAccount,echoName,serviceName,serviceState);

        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
        transport.connect(myEmailAccount, myEmailPassword);

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());

        // 7. 关闭连接
        transport.close();
    }


    /**
     * 创建一封只包含文本的简单邮件
     *
     * @param session 和服务器交互的会话
     * @param sendMail 发件人邮箱
     * @return
     * @throws Exception
     */
    public static MimeMessage createMimeMessage(Session session, String sendMail,String echoName, String serviceName, String serviceState) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);

        // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
        message.setFrom(new InternetAddress(sendMail, "微服务健康检测", "UTF-8"));

        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
//        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress("oceanbai@saas.top", "USER_DD", "UTF-8"));
//        message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("basilwang@saas.top", "USER_DD", "UTF-8"));
//        message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("evenzhang@saas.top", "USER_DD", "UTF-8"));
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress("offical@saas.top", "USER_DD", "UTF-8"));

        // 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
        message.setSubject("微服务健康检测", "UTF-8");

        // 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
        String content = echoName +"调用服务：" + serviceName + " , 服务状态: " + (serviceState.equals(ERROR_MESSAGE) ? "服务异常" : "服务未正常启动");
        message.setContent(content, "text/html;charset=UTF-8");

        // 6. 设置发件时间
        message.setSentDate(new Date());

        // 7. 保存设置
        message.saveChanges();

        return message;
    }

}
