SeimiCrawler 修改版本
============
基于SeimiCrawler2.x
解决多账号下使用cookie的问题
修改逻辑：在Request对象里面添加了useCookiesOfAccount参数。默认都是global。（目前只是修改okhttpClient的）
具体使用：request实例设置useCookiesOfAccount就可以使用不同的账号的cookie。

## 使用
框架具体使用见：[Github](https://github.com/zhegexiaohuozi/SeimiCrawler)

