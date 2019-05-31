package cn.wanghaomiao.seimi.core;

import cn.wanghaomiao.seimi.http.SeimiCookie;

import java.util.List;

public interface SeimiCookiePool {

    void putCookies(String account, String url, List<SeimiCookie> seimiCookies);

    List<SeimiCookie> getCookies(String account, String url);

}
