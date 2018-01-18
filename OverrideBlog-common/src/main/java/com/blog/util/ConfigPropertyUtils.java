package com.blog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigPropertyUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigPropertyUtils.class);

    private static Properties props;

    static {
        loadProps();
    }

    synchronized static private void loadProps() {
        LOGGER.info("开始加载系统配置文件...");
        props = new Properties();
        InputStream in = null;
        try {
            in = ConfigPropertyUtils.class.getClassLoader().getResourceAsStream("appConfig.properties");
            props.load(in);
        } catch (IOException e) {
            LOGGER.error("加载系统配置文件时，出现IOE异常...请检查【ConfigPropertyUtils】类相关代码！");
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error("加载系统配置文件时，关闭流出现异常...");
                }
            }
        }
        LOGGER.info("加载系统配置文件完成...");
    }

    public static String getProperty(String key) {
        if(props == null) {
            loadProps();
        }
        return props.getProperty(key);
    }

}
