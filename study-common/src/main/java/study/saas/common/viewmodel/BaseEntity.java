package study.saas.common.viewmodel;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author even
 * @Title: BaseEntity
 * @Description: 基础实体类
 * @date 2019/7/44:09 PM
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity implements Serializable {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    @Column(name = "uuid", unique = true, nullable = false, length = 32)
    private String uuid;

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

    public Boolean isDelete() {
        return isDeleted == 1;
    }
}
