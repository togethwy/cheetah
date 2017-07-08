package com.wthfeng.cheetah.handler;

import com.wthfeng.cheetah.Result;

/**
 * @author wangtonghe
 * @date 2017/5/3 21:47
 */
public interface Handler {

    /**
     * 处理爬取结果
     * @param result 结果集
     */
    void handle(Result result);

    /**
     * 对handler做结尾工作
     */
    void destory();


    /**
     * 设置网站域名
     * @param domain
     */
    void setDomain(String domain);
}
