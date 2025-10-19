package com.example.config;

import com.example.dao.DaoApi;
import com.example.dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoAliasConfig {
    // Alias "dao" qui redirige vers le bean daoApi
    @Bean(name = "dao")
    public IDao daoAlias(DaoApi target) {
        return target;
    }
}
