package study.saas.common.viewmodel;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program: kumi-saas
 * @description: 消息队列工具类
 * @author: Jerry
 * @create: 2018-03-13
 **/

public class MessageModel extends BaseObject {

    /** ------- 必填项 ------------------- */
    private String openId;
    private String weChatAppId;//与微信公众号连接的Appid
    private String productPin;
    private String tenantId;
    private String msgId;//模板标题Id
    private List<String> keyWordValues;//keyWord关键字，按选择顺序添加
    private String formId;//小程序必填，公众号不需要
    private String templateId; //项目小程序消息模板id
    /** ------- 必填项 ------------------- */

    private Integer classified;  // 在MessagetTemplate中选用那个模板
    private Integer relatedKeyId;
    private Integer orderKeyId;
    private Integer situation;
    private String value;
    private Integer userKeyId; //发送给消息的用户id （目标用户）
    private Integer type;   //一个通用的type
    private Integer state;
    private String relatedType;
    private Integer toUserType;
    private String messageContent;
    private String title;
    private String pagePath;
    private Date date;
    private String projectId;

    private List<Integer> userkeyIds;
    private List<Map<String, String>> tenantIdAndUserKeyIdList;
    private List<String> opendIds;




    public Integer getClassified() {
        return classified;
    }

    public void setClassified(Integer classified) {
        this.classified = classified;
    }

    public Integer getRelatedKeyId() {
        return relatedKeyId;
    }

    public void setRelatedKeyId(Integer relatedKeyId) {
        this.relatedKeyId = relatedKeyId;
    }

    public Integer getOrderKeyId() {
        return orderKeyId;
    }

    public void setOrderKeyId(Integer orderKeyId) {
        this.orderKeyId = orderKeyId;
    }

    public Integer getSituation() {
        return situation;
    }

    public void setSituation(Integer situation) {
        this.situation = situation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getUserKeyId() {
        return userKeyId;
    }

    public void setUserKeyId(Integer userKeyId) {
        this.userKeyId = userKeyId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getProductPin() {
        return productPin;
    }

    public void setProductPin(String productPin) {
        this.productPin = productPin;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType;
    }

    public Integer getToUserType() {
        return toUserType;
    }

    public void setToUserType(Integer toUserType) {
        this.toUserType = toUserType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Map<String, String>> getTenantIdAndUserKeyIdList() {
        return tenantIdAndUserKeyIdList;
    }

    public void setTenantIdAndUserKeyIdList(List<Map<String, String>> tenantIdAndUserKeyIdList) {
        this.tenantIdAndUserKeyIdList = tenantIdAndUserKeyIdList;
    }

    public List<Integer> getUserkeyIds() {
        return userkeyIds;
    }

    public void setUserkeyIds(List<Integer> userkeyIds) {
        this.userkeyIds = userkeyIds;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getOpendIds() {
        return opendIds;
    }

    public void setOpendIds(List<String> opendIds) {
        this.opendIds = opendIds;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getWeChatAppId() {
        return weChatAppId;
    }

    public void setWeChatAppId(String weChatAppId) {
        this.weChatAppId = weChatAppId;
    }

    public List<String> getKeyWordValues() {
        return keyWordValues;
    }

    public void setKeyWordValues(List<String> keyWordValues) {
        this.keyWordValues = keyWordValues;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getPagePath() {
        return pagePath;
    }

    public void setPagePath(String pagePath) {
        this.pagePath = pagePath;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "classified=" + classified +
                ", relatedKeyId=" + relatedKeyId +
                ", orderKeyId=" + orderKeyId +
                ", situation=" + situation +
                ", value='" + value + '\'' +
                ", userKeyId=" + userKeyId +
                ", type=" + type +
                ", state=" + state +
                ", productPin='" + productPin + '\'' +
                ", formId='" + formId + '\'' +
                ", templateId='" + templateId + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", relatedType='" + relatedType + '\'' +
                ", toUserType=" + toUserType +
                ", messageContent='" + messageContent + '\'' +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", openId='" + openId + '\'' +
                ", weChatAppId='" + weChatAppId + '\'' +
                ", userkeyIds=" + userkeyIds +
                ", tenantIdAndUserKeyIdList=" + tenantIdAndUserKeyIdList +
                ", opendIds=" + opendIds +
                '}';
    }
}
