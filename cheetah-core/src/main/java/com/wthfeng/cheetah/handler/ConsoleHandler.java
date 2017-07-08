package com.wthfeng.cheetah.handler;

import com.wthfeng.cheetah.Result;

import java.util.Map;

/**
 * @author wangtonghe
 * @date 2017/5/3 21:47
 */
public class ConsoleHandler implements Handler {
    @Override
    public void handle(Result result) {

       for(Map.Entry<String,Object> entry:result.getResult().entrySet() ){
           System.out.println(entry.getKey()+":\t"+entry.getValue());
       }
    }

    @Override
    public void destory() {

    }

    @Override
    public void setDomain(String domain) {

    }
}
