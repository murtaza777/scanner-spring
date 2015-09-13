package com.mk.config;

import com.mk.dao.MongoDao;
import com.mongodb.DBCollection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 28/10/2013
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class DaoConfig {
    @Bean(name = "mongoDao")
    public MongoDao createMongoDao() {
        return new MongoDao();
    }
}
