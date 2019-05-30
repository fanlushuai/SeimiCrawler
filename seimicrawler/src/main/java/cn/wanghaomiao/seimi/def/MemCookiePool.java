package cn.wanghaomiao.seimi.def;

import cn.wanghaomiao.seimi.core.SeimiCookiePool;
import cn.wanghaomiao.seimi.http.okhttp.CookiesManager;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemCookiePool implements SeimiCookiePool {

    private Map<String, CookieStore> aphcCookieStore = new ConcurrentHashMap<>();

    //    private CookiesManager okHttpCookiesManager = new CookiesManager();
    private Map<String, CookiesManager> okHttpCookiesManager = new ConcurrentHashMap<>();


    public CookieStore getCookieStore(String account) {
        if (aphcCookieStore.get(account) != null) {
            return aphcCookieStore.get(account);
        }

        return initApcCookieStore(account);
    }

    public synchronized CookieStore initApcCookieStore(String account) {
        if (aphcCookieStore.get(account) != null) {
            return aphcCookieStore.get(account);
        }

        aphcCookieStore.put(account, new BasicCookieStore());
        return aphcCookieStore.get(account);
    }

    public CookiesManager getOkHttpCookiesManager(String account) {
        if (okHttpCookiesManager.get(account) != null) {
            return okHttpCookiesManager.get(account);
        }

        return initOkHttpCookiesManager(account);
    }

    public synchronized CookiesManager initOkHttpCookiesManager(String account) {
        if (okHttpCookiesManager.get(account) != null) {
            return okHttpCookiesManager.get(account);
        }

        okHttpCookiesManager.put(account, new CookiesManager());
        return okHttpCookiesManager.get(account);
    }

    @Override
    public String get(String name) {
        return null;
    }

    @Override
    public void put(String name) {

    }
}
