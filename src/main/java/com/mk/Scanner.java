package com.mk;

import com.mk.service.ScannerService;
import com.mongodb.DBCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: murtaza
 * Date: 28/10/2013
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Scanner {

    private static final Logger LOG = LoggerFactory.getLogger(Scanner.class);

    public static void main(String[] args) {
        String idArg = args[0];
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
            ScannerService scannerService = (ScannerService)applicationContext.getBean("scannerService");
            LOG.debug("Scanning id: '{}'", idArg);
            int id = Integer.parseInt(idArg);
            scannerService.update(id);
        } catch (NumberFormatException e) {
            LOG.error("Invalid id : '{}'", idArg);
        } catch (UnknownHostException ue) {
            LOG.error("Unknown  host exception {}", ue);
        }

    }
}
