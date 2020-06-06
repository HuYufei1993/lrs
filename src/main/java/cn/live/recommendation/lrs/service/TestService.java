package cn.live.recommendation.lrs.service;

import cn.live.recommendation.lrs.dao.TestDao;
import cn.live.recommendation.lrs.tools.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;
    @Autowired
    private RedisUtil redisUtil;

    public String test(int id){
        Object val = this.redisUtil.get(String.valueOf(id));
        if(val!=null){
            return val.toString();
        }else{
            String ret = this.testDao.findByid(id);
            this.redisUtil.set(String.valueOf(id),ret,60);
            return ret;
        }
    }
}
