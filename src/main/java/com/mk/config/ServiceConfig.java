package com.mk.config;

import com.mk.dao.MongoDao;
import com.mk.service.ScannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 28/10/2013
 * Time: 10:01 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class ServiceConfig {

    @Bean(name = "scannerService")
    @Autowired
    public ScannerService createScannerService(MongoDao mongoDao) {
        return new ScannerService(mongoDao);
    }
}
