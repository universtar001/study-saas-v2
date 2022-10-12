package study.saas.common.repo;

import study.saas.common.entity.YPageable;
import study.saas.common.viewmodel.PageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Map;
import java.util.List;

/**
 * @Author:Stalary
 * @Description:
 * @Date Created in 下午6:07 17/7/25
 */
@NoRepositoryBean
public interface BaseRepo<T, Integer extends Serializable> extends JpaRepository<T, Integer>  {

    <R> PageModel<R> queryPage(String JPql, Map<String, Object> params,
                               Class<R> resultClass, YPageable pageable);

    <R> List<R> nativeSqlQuery(String sql, Map<String, Object> params);

    int nativeSqlQuerySum(String sql, Map<String, Object> params);

    <R> List<R> queryPageList(String JPql, Map<String, Object> params,
                              Class<R> resultClass);
}
                  