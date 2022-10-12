package study.saas.common.facade;


import java.util.List;

/**
 *
 * @author even
 * @Title: BaseFacadeV2
 * @Description:
 * @date 16:24
 */
public interface BaseFacadeV2<T> {

    T findOne(String id);

     T save(T entity) ;

     void save(List<T> entityList);

     void deleteById(String id);
    


}
