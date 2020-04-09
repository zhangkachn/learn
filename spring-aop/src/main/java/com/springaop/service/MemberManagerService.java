package com.springaop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

/**
 * @Auther: zk
 * @Date: 2020/4/7 16:27
 * @Description:
 */
@Service
public class MemberManagerService {

    private final static Logger LOG = Logger.getLogger(MemberManagerService.class);

    /**
     *
     * @param member
     * @return
     */
    public Member add(Member member){
        LOG.info("增加用户");
        return null;
    }


    public boolean remove(long id) throws Exception{
        LOG.info("删除用户");
        throw new Exception("这是我们自己跑出来的异常");
    }


    public boolean modify(Member member){
        LOG.info("修改用户");
        return true;
    }

    public boolean query(String loginName){
        LOG.info("查询用户");
        return true;
    }


}
}
