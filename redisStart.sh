redis-server /usr/local/etc/7010/conf/redis_cluster1.conf

redis-server /usr/local/etc/7010/conf/redis_cluster1_slave1.conf
redis-server /usr/local/etc/7010/conf/redis_cluster1_slave2.conf
redis-server /usr/local/etc/7010/conf/redis_cluster1_slave3.conf


redis-server /usr/local/etc/7020/conf/redis_cluster2.conf
  
redis-server /usr/local/etc/7020/conf/redis_cluster2_slave1.conf
redis-server /usr/local/etc/7020/conf/redis_cluster2_slave2.conf
redis-server /usr/local/etc/7020/conf/redis_cluster2_slave3.conf

redis-server /usr/local/etc/7030/conf/redis_cluster3.conf
  
redis-server /usr/local/etc/7030/conf/redis_cluster3_slave1.conf
redis-server /usr/local/etc/7030/conf/redis_cluster3_slave2.conf
redis-server /usr/local/etc/7030/conf/redis_cluster3_slave3.conf


#./redis-trib.rb create --auth 11111  --replicas 3 127.0.0.1:7010 127.0.0.1:7020 127.0.0.1:7030 127.0.0.1:7011 127.0.0.1:7012 127.0.0.1:7013 127.0.0.1:7021 127.0.0.1:7022 127.0.0.1:7023 127.0.0.1:7031 127.0.0.1:7032 127.0.0.1:7033



# ./redis-trib.rb create --auth 11111 --replicas 1 127.0.0.1:7010 127.0.0.1:7020 127.0.0.1:7030 127.0.0.1:7011 127.0.0.1:7021 127.0.0.1:7031

