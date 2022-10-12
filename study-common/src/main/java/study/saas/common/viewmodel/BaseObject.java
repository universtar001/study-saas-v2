package study.saas.common.viewmodel;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: even
 * @create: 2018/12/26 5:05 PM
 **/
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseObject implements Serializable {

    public BaseObject() {
        this.latestTime = new Date();
    }

    public BaseObject(Integer keyId) {
        this.keyId = keyId;
    }

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer keyId;

    /**
     * 创建时间,(旧版)
     */
    @Temporal(TemporalType.TIMESTAMP)
    protected Date latestTime;

    /**
     * 创建时间（新版）
     */
    @CreatedDate
    protected Date createTime;

    /**
     * 更新时间
     */
    @LastModifiedDate
    protected Date updateTime;

    /**
     * 是否删除
     */
    @Column(columnDefinition = "int default 0")
    protected Integer isDeleted = 0;

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public Integer getKeyId() {
        return keyId;
    }

    public Date getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Date latestTime) {
        this.latestTime = latestTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
