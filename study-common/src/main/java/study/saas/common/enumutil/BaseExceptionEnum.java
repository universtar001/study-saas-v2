/* 版权所有(C)，库米（上海）信息科技有限公司，2019，所有权利保留。
 *
 * 项目名：	kumi.saas.edu.common.enumutil
 * 文件名：	BaseExceptionEnum
 * 模块说明：
 * 修改历史：
 * 2019/8/21 - sunyi - 创建。
 */

package study.saas.common.enumutil;

/**
 * @author sunyi
 * @date 2019/8/21
 */
public interface BaseExceptionEnum {
    /**
     * 获取代码
     *
     * @return 错误码
     */
    String getCode();

    /**
     * 获取异常消息
     *
     * @return 错误消息
     */
    String getMsg();
}
