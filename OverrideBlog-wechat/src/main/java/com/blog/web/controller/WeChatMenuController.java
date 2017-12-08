package com.blog.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * @author Flandre#CtChan
 */
@RestController
@RequestMapping("wechatMenu")
public class WeChatMenuController {
    @RequestMapping("/getToken")
    @ResponseBody
    public Object getToken(HttpServletRequest request) throws IOException {
        String params = request.getQueryString();
        String result = Request.Get("https://api.weixin.qq.com/cgi-bin/token?" + params).execute().handleResponse(httpResponse -> {
            int code = httpResponse.getStatusLine().getStatusCode();
            System.out.println(code);
            if (code != 200) {
                return "error:code=" + code;
            }
            return EntityUtils.toString(httpResponse.getEntity());
        });
        return result;
    }

    @RequestMapping("/getMenu")
    @ResponseBody
    public Object getMenu(HttpServletRequest request) throws IOException {
        String params = request.getQueryString();
        String result = Request.Get("https://api.weixin.qq.com/cgi-bin/menu/get?" + params).execute().handleResponse(httpResponse -> {
            int code = httpResponse.getStatusLine().getStatusCode();
            System.out.println(code);
            if (code != 200) {
                return "error:code=" + code;
            }
            return EntityUtils.toString(httpResponse.getEntity(), Charset.forName("utf-8"));
        });
        return result;
    }

    @RequestMapping("/createMenu")
    @ResponseBody
    public Object createMenu(String json, String access_token) throws IOException {
        String result = Request.Post("https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + access_token).body(new StringEntity(json, ContentType.APPLICATION_JSON)).execute().handleResponse(httpResponse -> {
            int code = httpResponse.getStatusLine().getStatusCode();
            System.out.println(code);
            if (code != 200) {
                return "error:code=" + code;
            }
            return EntityUtils.toString(httpResponse.getEntity(), Charset.forName("utf-8"));
        });
        return result;
    }
}
