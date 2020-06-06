package cn.live.recommendation.lrs.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Redis工具类
 */
@Component
public final class RedisUtil {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisUtil.class);

    /**
     * Redis是否存在key
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    /**
     * 普通value的获取
     * @param key
     * @return
     */
    public Object get(String key){
        return key==null?null:redisTemplate.opsForValue().get(key);
    }

    /**
     * 普通缓存放入
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
        return true;
    }

    /**
     * 普通缓存放入 同时设置超时时间，单位秒
     * @param key
     * @param value
     * @param time
     * @return
     */
    public boolean set(String key,Object value,long time){
        if(time>0){
            redisTemplate.opsForValue().set(key,value,time,TimeUnit.SECONDS);
        }else{
            set(key,value);
        }
        return true;
    }

    /**
     * 删除缓存
     * @param key
     */
    public void del(String key){
        redisTemplate.delete(key);
    }

    /**
     * 设置超时时间，单位秒
     * @param key
     * @param time
     * @return
     */
    public boolean expire(String key,long time){
        return redisTemplate.expire(key,time, TimeUnit.SECONDS);
    }
}
