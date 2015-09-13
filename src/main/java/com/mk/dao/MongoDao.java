package com.mk.dao;

import com.mongodb.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.net.UnknownHostException;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 27/10/2013
 * Time: 7:07 PM
 * To change this template use File | Settings | File Templates.
 */


public class MongoDao {
    @Value("${mongo.db.url}") private String mongoUrl;
    @Value("${db.name}") private String dbName;
    @Value("${collection.name}") private String collectionName;

    @Bean
    public DBCollection createCollection() throws UnknownHostException {
        MongoClient client = new MongoClient(new MongoClientURI(mongoUrl));
        DB db = client.getDB(dbName);
        DBCollection collection = db.getCollection(collectionName);
        return collection;
    }

    public void update(DBCollection collection, int id, int diff) {
        BasicDBObject day = new BasicDBObject();
        day.put("Day", diff);
        day.put("Time", new Date());
        collection.update(new BasicDBObject("Ejamaat", id), new BasicDBObject("$push", new BasicDBObject("Days", day)));
    }
}
