package study.saas.common.facade;


import java.util.List;

/**
 * Created by wanghuajie on 17/8/5.
 */
public interface BaseFacade<T> {

    T findOne(Integer id);

     T save(T entity) ;

     List<T> save(List<T> entityList);

     void deleteById(Integer id);
    


}
