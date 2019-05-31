package cn.wanghaomiao.seimi.def;

import cn.wanghaomiao.seimi.core.SeimiCookiePool;
import cn.wanghaomiao.seimi.http.SeimiCookie;

import java.util.List;

public class RedisCookiePool implements SeimiCookiePool {

    @Override
    public void putCookies(String account, String url, List<SeimiCookie> seimiCookies) {

    }

    @Override
    public List<SeimiCookie> getCookies(String account, String url) {
        return null;
    }
}
