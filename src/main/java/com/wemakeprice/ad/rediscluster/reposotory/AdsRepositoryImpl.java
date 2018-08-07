package com.wemakeprice.ad.rediscluster.reposotory;


import com.wemakeprice.ad.rediscluster.model.Ads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class AdsRepositoryImpl implements AdsRepository{

    private static final String KEY = "ADS";
    private static final String KEY1 = "ADS1";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, Integer, Ads> hashOperations;





    @Autowired
    public AdsRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {

        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {

        hashOperations = redisTemplate.opsForHash();
    }


    @Override
    public void save(Ads ads) {

//        System.out.println("keyword : " + ads.getKeyword() +  " / keyword.hashCode() : " + ads.getKeyword().hashCode() + "/ ads.deals : " + ads.getDesls());
        hashOperations.put(KEY1 , ads.getKeyword().hashCode(), ads);

    }

    @Override
    public Ads find(String keyword) {

        System.out.println("keyword : " + keyword +  " / keyword.hashCode() : " + keyword.hashCode());


        return hashOperations.get(KEY, keyword.hashCode());

    }

    @Override
    public void delete(String keyword) {
        hashOperations.delete(KEY, keyword.hashCode());
    }


    @Override
    public void deleteAll(String key) {
        if (key.equals(KEY)) {
            redisTemplate.delete(key);
        }
    }

    @Override
    public void rename() {
//        redisTemplate.delete(KEY);
        redisTemplate.rename(KEY1, KEY);

    }
}
