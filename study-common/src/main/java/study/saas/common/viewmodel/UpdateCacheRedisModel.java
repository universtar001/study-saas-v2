package study.saas.common.viewmodel;

public class UpdateCacheRedisModel extends BaseObject {
    private String tenantId;
    private Integer cacheRedisEnumId;
    private Integer userId;
    private String productId;
    private String productPin;

    public UpdateCacheRedisModel() {

    }

    public UpdateCacheRedisModel(Integer cacheRedisEnumId) {
        this.cacheRedisEnumId = cacheRedisEnumId;
    }

    public UpdateCacheRedisModel(String tenantId, Integer cacheRedisEnumId, Integer userId, String productId,String productPin) {
        this.tenantId = tenantId;
        this.cacheRedisEnumId = cacheRedisEnumId;
        this.userId = userId;
        this.productId = productId;
        this.productPin = productPin;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getCacheRedisEnumId() {
        return cacheRedisEnumId;
    }

    public void setCacheRedisEnumId(Integer cacheRedisEnumId) {
        this.cacheRedisEnumId = cacheRedisEnumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPin() {
        return productPin;
    }

    public void setProductPin(String productPin) {
        this.productPin = productPin;
    }
}
