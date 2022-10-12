package study.saas.common.viewmodel;

import java.util.Date;

public class PayReturnModel extends BaseObject{
    private Integer templateId;
    private String authAppId;
    private String productPin;
    private String tenantId;
    private Integer userKeyId;
    private Integer orderKeyId;
    private Date startSettleDate;//开始结算时间
    private Integer settleDays;//结算所需天数
    private Date endSettleDate;//结算结束时间
    private Integer distributionRuleKeyId;//结算的规则id

    public PayReturnModel() {

    }

    public PayReturnModel(Integer templateId ,String authAppId, String productPin, String tenantId) {
        this.templateId = templateId;
        this.authAppId = authAppId;
        this.productPin = productPin;
        this.tenantId = tenantId;
    }

    public PayReturnModel(Integer userKeyId ,Integer orderKeyId,Date startSettleDate,Integer settleDays,Integer distributionRuleKeyId,String productPin) {
        this.userKeyId = userKeyId;
        this.orderKeyId = orderKeyId;
        this.startSettleDate = startSettleDate;
        this.settleDays = settleDays;
        this.distributionRuleKeyId = distributionRuleKeyId;
        this.productPin = productPin;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getAuthAppId() {
        return authAppId;
    }

    public void setAuthAppId(String authAppId) {
        this.authAppId = authAppId;
    }

    public String getProductPin() {
        return productPin;
    }

    public void setProductPin(String productPin) {
        this.productPin = productPin;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getUserKeyId() {
        return userKeyId;
    }

    public void setUserKeyId(Integer userKeyId) {
        this.userKeyId = userKeyId;
    }

    public Integer getOrderKeyId() {
        return orderKeyId;
    }

    public void setOrderKeyId(Integer orderKeyId) {
        this.orderKeyId = orderKeyId;
    }

    public Date getStartSettleDate() {
        return startSettleDate;
    }

    public void setStartSettleDate(Date startSettleDate) {
        this.startSettleDate = startSettleDate;
    }

    public Integer getSettleDays() {
        return settleDays;
    }

    public void setSettleDays(Integer settleDays) {
        this.settleDays = settleDays;
    }

    public Date getEndSettleDate() {
        return endSettleDate;
    }

    public void setEndSettleDate(Date endSettleDate) {
        this.endSettleDate = endSettleDate;
    }

    public Integer getDistributionRuleKeyId() {
        return distributionRuleKeyId;
    }

    public void setDistributionRuleKeyId(Integer distributionRuleKeyId) {
        this.distributionRuleKeyId = distributionRuleKeyId;
    }
}
