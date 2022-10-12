package study.saas.common.facade;

/**
 * @author even
 * @Title: BaseFacadeImplV2
 * @Description:
 * @date 16:25
 */
public class BaseFacadeImplV2<R> {

    protected R service;

    protected BaseFacadeImplV2(R service) {
        this.service = service;
    }
}