package com.example.conditional.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MySQLConnection {
    public static  final Logger log= LoggerFactory.getLogger(MySQLConnection.class);

    private MySQLConnection(){
        log.info("MySQLConnection Initialized");
    }
}
