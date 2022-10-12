package study.saas.common.service;

import study.saas.common.repo.BaseRepoV2;
import study.saas.common.util.MapUtil;
import study.saas.common.viewmodel.PageModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author even
 * @Title: BaseServiceV2
 * @Description: TODO
 * @date 2019/7/44:40 PM
 */
public abstract class BaseServiceV2<T, R extends BaseRepoV2<T, String>> {
    protected R repo;

    protected String tenantId = "0";

    protected BaseServiceV2(R repo) {
        this.repo = repo;
    }


    public T findOne(String  code) {
        return repo.findOne(code);
    }

    public T save(T entity) {

        return repo.save(entity);
    }

    public void save(List<T> entityList) {
        repo.save(entityList);
    }

    public void deleteById(String code) {
        repo.delete(code);
    }

    /**
     *
     * @param page 分页的page
     * @param pageable 分页的数量
     * @param <F> 不限制类型
     * @return PageModel
     */
    public <F> PageModel<F> getPageModel(Page<F> page, Pageable pageable) {
        PageModel<F> result = new PageModel<>(page.getContent(), page.getTotalPages());
        long index = page.getTotalElements() - pageable.getOffset();
        result.setIndex((int) index);
        return result;
    }

    /**
     *
     * @param page 分页的page
     * @param pageable 分页的数量
     * @param keys 需要映射的键
     * @return PageModel
     */
    public PageModel<Map<String,Object>> getPageModelByObjectAndKeys(Page<Object[]> page, Pageable pageable, String[] keys) {
        List<Map<String,Object>> resultList = MapUtil.convertToListHashMap(page.getContent(),keys);
        PageModel<Map<String,Object>> result = new PageModel<>(resultList, page.getTotalPages());
        long index = page.getTotalElements() - pageable.getOffset();
        result.setIndex((int) index);
        return result;
    }

    // 动态条件查询时的范围查询拆分
    public String scopeJudgment(String column, String scope, String delimit) {
        String min;
        String max;
        try {
            String[] scopes = scope.split(delimit, 2);
            if (scopes.length > 1){
                min = scopes[0];
                max = scopes[1].contains("岁")?scopes[1].substring(0,scopes[1].indexOf("岁")):scopes[1];
                return "and " + column + " BETWEEN '" + min + "' AND '" + max + "' ";
            }else{
                if (scope.contains("岁以上")){
                    min = scope.substring(0,scope.indexOf("岁以上"));
                    return "and " + column + " >= " + min +" ";
                }
            }
            return "";
        } catch (Exception e) {
            return "";
        }

    }
}
