package com.mk.service;

import com.mk.dao.MongoDao;
import com.mongodb.DBCollection;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 28/10/2013
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class ScannerService {
    private MongoDao mongoDao;
    private static final DateTime NOW = DateTime.now();
    //private static final int DATE = 4;

    @Value("${date.start}") private String dateStart;


    public ScannerService(MongoDao mongoDao) {
        this.mongoDao = mongoDao;
    }

    public void update(int id) throws UnknownHostException {
        DBCollection collection = mongoDao.createCollection();
        int diff = NOW.dayOfMonth().get() - Integer.valueOf(dateStart);
        mongoDao.update(collection, id, diff);
    }
}
