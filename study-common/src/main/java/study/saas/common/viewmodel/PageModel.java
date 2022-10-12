package study.saas.common.viewmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author Peter on 2017-03-14.
 */
@ApiModel
public class PageModel<T> implements Serializable {


    public PageModel() {
        this.pageTotal = 1;
    }

    public PageModel(List<T> list, Integer pageTotal) {
        this.list = list;
        this.pageTotal = pageTotal;
    }

    @ApiModelProperty(value = "列表")
    private List<T> list;

    private int totalElements;

    @ApiModelProperty(value = "总页数")
    private int pageTotal;

    /**
     * 当前list中第一个元素在总结果中的序号
     */
    private Integer index;


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }
}
