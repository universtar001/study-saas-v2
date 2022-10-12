package study.saas.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author: fred
 * @date: 2019-12-31 09:30
 * @description: 配置文件加载工具类
 */
public class PropertyUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtil.class);

    /**
     * 获取resources的配置文件
     * @param fileName 文件名
     */
    public static Properties loadProperties(String fileName) {
        Properties prop = new Properties();
        try (InputStream inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream(fileName)) {
            prop.load(inputStream);
        } catch (Exception e) {
            LOGGER.error("没有找到[{}]配置文件", fileName);
        }
        return prop;
    }
}
