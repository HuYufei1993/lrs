package cn.live.recommendation.lrs.service;

import cn.live.recommendation.lrs.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public String test(int id){
        return this.testDao.findByid(id);
    }
}
