package cn.wanghaomiao.seimi.core;

public interface SeimiCookiePool {

    String get(String name);

    void put(String name);

}
