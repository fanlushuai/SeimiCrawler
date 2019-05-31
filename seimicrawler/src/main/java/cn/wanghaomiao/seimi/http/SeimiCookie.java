package cn.wanghaomiao.seimi.http;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import org.apache.http.client.CookieStore;

import java.util.Date;
import java.util.List;

/**
 * http cookie要素，屏蔽hcclient与okhttp区别
 * @author github.com/zhegexiaohuozi seimimaster@gmail.com
 * @since 2016/12/4.
 */
public class SeimiCookie implements CookieJar , CookieStore  {
    public SeimiCookie(String domain, String path, String name, String value) {
        this.domain = domain;
        this.path = path;
        this.name = name;
        this.value = value;
    }

    private String domain;
    private String path;
    private String name;
    private String value;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {

    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        return null;
    }

    @Override
    public void addCookie(org.apache.http.cookie.Cookie cookie) {

    }

    @Override
    public List<org.apache.http.cookie.Cookie> getCookies() {
        return null;
    }

    @Override
    public boolean clearExpired(Date date) {
        return false;
    }

    @Override
    public void clear() {

    }
}
