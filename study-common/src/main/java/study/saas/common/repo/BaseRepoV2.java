package study.saas.common.repo;

import study.saas.common.entity.YPageable;
import study.saas.common.viewmodel.PageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author even
 * @Title: BaseRepoV2
 * @Description: 新版主键生成方式
 * @date 2019/7/44:38 PM
 */
@NoRepositoryBean
public interface BaseRepoV2<T, String extends Serializable> extends JpaRepository<T, String> {
    <R> PageModel<R> queryPage(java.lang.String JPql, Map<java.lang.String, Object> params,
                               Class<R> resultClass, YPageable pageable);

    <R> List<R> nativeSqlQuery(java.lang.String sql, Map<java.lang.String, Object> params);

    int nativeSqlQuerySum(java.lang.String sql, Map<java.lang.String, Object> params);

    <R> List<R> queryPageList(java.lang.String JPql, Map<java.lang.String, Object> params,
                              Class<R> resultClass);
}
