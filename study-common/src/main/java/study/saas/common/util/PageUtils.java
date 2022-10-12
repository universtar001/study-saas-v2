package study.saas.common.util;

import study.saas.common.entity.YPageRequest;
import study.saas.common.entity.YPageable;
import study.saas.common.viewmodel.PageModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Peter on 2017-03-19.
 */
public class PageUtils {


    public static Pageable pageable(Integer page, Integer pageSize) {

        if (page == null) {
            page = 1;
        }

        if (page < 1) {
            page = 1;
        }

        if (pageSize == null) {
            pageSize = 20;
        }

        return new PageRequest(page - 1, pageSize);
    }

    public static Integer getStart(Integer page, Integer pageSize) {
        return (page - 1) * pageSize;
    }

    public static Integer getTotalPage(Integer totalData, Integer pageSize) {
        Integer totalPage;
        if (totalData % pageSize != 0) {
            totalPage = totalData / pageSize + 1;
        } else {
            totalPage = totalData / pageSize;
        }
        return totalPage;
    }

    public static YPageable Ypageable(Integer pageOld, Integer pageSize) {

        if (pageOld == null) {
            pageOld = 1;
        }

        if (pageOld < 1) {
            pageOld = 1;
        }

        if (pageSize == null) {
            pageSize = 20;
        }
        Integer page = pageOld - 1;
        return new YPageRequest(page, pageSize);
    }

    /**
     * 内部方法 list 内部分页
     *
     * @param list
     * @return
     */
    public static  <T> PageModel<T> getPagedSubList(List<T> list, Integer page, Integer pageSize) {
        if (page == null) {
            page = 1;
        }

        if (page < 1) {
            page = 1;
        }

        if (pageSize == null) {
            pageSize = 20;
        }
        page = page - 1;
        int totalCount = list.size();

        if (totalCount == 0)
            return null;

        int pageCount;

        int m = totalCount % pageSize;

        if (m > 0) {
            pageCount = totalCount / pageSize + 1;
        } else {
            pageCount = totalCount / pageSize;
        }

        if (page > pageCount)
            return null;

        List<T> subList;
        Integer toIndex = page * pageSize + pageSize;
        if (toIndex > totalCount){
            toIndex = totalCount;
        }
        subList = list.subList(page * pageSize, toIndex);

        PageModel<T> pageModel = new PageModel();
        pageModel.setPageTotal(pageCount);
        pageModel.setTotalElements(list.size());
        pageModel.setIndex(page * pageSize + 1);
        pageModel.setList(subList);

        return pageModel;

    }
    //以支持Object【】的分页
    public static PageModel<Object[]> getObjectPageModel(Page<Object[]> page, Pageable pageable) {
        PageModel<Object[]> result = new PageModel<>(page.getContent(), page.getTotalPages());
        long index = page.getTotalElements() - pageable.getOffset();
        result.setIndex((int) index);
        return result;
    }


    /**
     * 实体类与DTO转换
     * @param receivePageModel  传入的pageModel
     * @param result            数据集合
     * @param <T>               返回类型
     * @param <S>               传入类型
     * @return  PageModel<T>
     */
    public static <T, S> PageModel<T> pageModelConvert(PageModel<S> receivePageModel, List<T> result) {
        PageModel<T> pageModel = new PageModel<>();
        pageModel.setList(result);
        pageModel.setIndex(receivePageModel.getIndex());
        pageModel.setPageTotal(receivePageModel.getPageTotal());
        pageModel.setTotalElements(receivePageModel.getTotalElements());
        return pageModel;
    }
}
