package com.fiany.utilproject.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description : 获取属性文件工具类
 * @Author : yifan
 * @Data : 2018/3/11 17:04
 */
public class PropUtils {
    protected static final String REDIS_RESOURCES_PROPERTIES_FILE_NAME = "redis.properties";

    /**
     * 取得所有属性值
     *
     * @param propertiesFileName
     * @return
     * @throws IOException
     */
    protected static Properties getProperties(String propertiesFileName) throws IOException {
        Properties prop = new Properties();
        InputStream is = PropUtils.class.getClassLoader().getResourceAsStream(propertiesFileName);

        try {
            prop.load(is);
        } catch (IOException e) {
            throw e;
        }

        return prop;
    }


    /**
     * 取得redis文件
     *
     * @return
     * @throws IOException
     */
    public static Properties getRedisResourcesProperties() {
        try {
            return getProperties(REDIS_RESOURCES_PROPERTIES_FILE_NAME);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }


    /**
     * 取得redis文件的属性值
     *
     * @return
     * @throws IOException
     */
    public static String getRedisValue(String key) {
        Properties properties = getRedisResourcesProperties();
        return properties.getProperty(key);
    }
}
