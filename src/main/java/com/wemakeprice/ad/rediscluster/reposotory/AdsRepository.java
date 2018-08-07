package com.wemakeprice.ad.rediscluster.reposotory;

import com.wemakeprice.ad.rediscluster.model.Ads;

public interface AdsRepository {

    void save(Ads ads);
    Ads find(String keyword);
    void delete(String keyword);
    void deleteAll(String key);
    String rename();
}
