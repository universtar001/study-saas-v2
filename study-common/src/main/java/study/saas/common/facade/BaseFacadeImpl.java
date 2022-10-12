package study.saas.common.facade;


import study.saas.common.repo.BaseRepo;
import study.saas.common.service.BaseService;

import java.util.List;

/**
 * @Author:Stalary
 * @Description:
 * @Date Created in 下午6:07 17/7/25
 */
public class BaseFacadeImpl<T, R extends BaseService<T, U>, U extends BaseRepo<T,Integer>> implements BaseFacade<T> {

    protected R service;

    protected BaseFacadeImpl(R service) {
        this.service = service;
    }


    public T findOne(Integer id) {
        return service.findOne(id);
    }

    public T save(T entity) {

        return service.save(entity);
    }

    public List<T> save(List<T> entityList) {
        return service.save(entityList);
    }

    public void deleteById(Integer id) {
        service.deleteById(id);
    }

    


}