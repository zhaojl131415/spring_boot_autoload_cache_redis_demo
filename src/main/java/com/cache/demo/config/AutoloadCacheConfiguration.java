package com.cache.demo.config;

import com.jarvis.cache.serializer.ISerializer;
import com.jarvis.cache.serializer.JacksonJsonSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jarvis.cache.ICacheManager;
import com.jarvis.cache.autoconfigure.AutoloadCacheProperties;
import com.jarvis.cache.clone.ICloner;
import com.jarvis.cache.map.MapCacheManager;

/**
 * 为了方便测试，使用Map缓存
 * 
 * @author: jiayu.qiu
 */
@Configuration
public class AutoloadCacheConfiguration {
//
//    @Bean
//    public ICacheManager mapCacheManager(AutoloadCacheProperties config, ICloner cloner) {
//        return new MapCacheManager(config.getConfig(), cloner);
//    }

    @Bean
    public ISerializer<Object> autoloadCacheSerializer() {
        return new JacksonJsonSerializer();
    }
}
