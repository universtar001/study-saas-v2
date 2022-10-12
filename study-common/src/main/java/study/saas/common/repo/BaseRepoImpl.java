package study.saas.common.repo;


import study.saas.common.entity.YPageable;
import study.saas.common.viewmodel.PageModel;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.List;

/**
 * @Author:Stalary
 * @Description:
 * @Date Created in 下午6:07 17/7/25
 */
public class BaseRepoImpl<T, Integer extends Serializable> extends SimpleJpaRepository<T, Integer> implements BaseRepo<T, Integer> {


    private final EntityManager entityManager;

    public BaseRepoImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);

        this.entityManager = entityManager;

    }

    public Long queryCountByJPQL(String JPql, Map<String, Object> params) {

        TypedQuery<Long> query = typedQuery(JPql, params, Long.class);


        return query.getSingleResult();
    }


    @Override
    public <R> PageModel<R> queryPage(String JPql, Map<String, Object> params, Class<R> resultClass, YPageable pageable) {

        if (pageable.getCountSql() == null) {
            pageable.setCountSql(Repo.toCountJPql(JPql));
        }
        TypedQuery<R> query = typedQuery(JPql, params, resultClass);

        query.setFirstResult(pageable.getOffset());
        query.setMaxResults(pageable.getPageSize());

        Long total = queryCountByJPQL(pageable.getCountSql(), params);


        int pageSize = pageable.getPageSize();

        int totalPage = (int) (total % pageSize == 0 ? total / pageSize : total / pageSize + 1);
        PageModel<R> pageModel = new PageModel<>(query.getResultList(), totalPage);

        pageModel.setTotalElements(total.intValue());

        pageModel.setIndex(total.intValue() - pageable.getOffset());
        return pageModel;


    }

    public <R> List<R> queryPageList(String JPql, Map<String, Object> params, Class<R> resultClass) {
        Repo.toCountJPql(JPql);
        TypedQuery<R> query = typedQuery(JPql, params, resultClass);
        return query.getResultList();
    }

    private <R> TypedQuery<R> typedQuery(String JPql, Map<String, Object> params, Class<R> resultClass) {

        TypedQuery<R> query = this.entityManager.createQuery(JPql, resultClass);

        if (params != null) {
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                query.setParameter(key, params.get(key));
            }
        }

        return query;

    }

    @Override
    public <R> List<R> nativeSqlQuery(String sql, Map<String, Object> params) {

        Query query = nativeQuery(sql, params);

        return query.getResultList();
    }

    @Override
    public int nativeSqlQuerySum(String sql, Map<String, Object> params) {

        Query query = nativeQuery(sql, params);

        return query.getMaxResults();
    }

    private Query nativeQuery(String sql, Map<String, Object> params) {
        Query query = this.entityManager.createNativeQuery(sql);

        if (params != null) {
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                query.setParameter(key, params.get(key));
            }
        }
        return query;
    }

}
