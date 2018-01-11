package com.blog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Elvis on 2017/10/16.
 */
public class MD5Utils {

    private static final Logger logger = LoggerFactory.getLogger(MD5Utils.class);

    private static MessageDigest md5;

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            logger.error("加载MD5出错...{}",e);
        }
    }

    public static String getMD5Password(String password){

        return new BigInteger(1, (md5.digest(password
                .getBytes()))).toString(16);
    }
}
