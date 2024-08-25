package com.example.conditional.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "nosqlconnection",
        value = "enabled",
        havingValue = "true",
        matchIfMissing = false)
public class NoSQLConnection {
    public static final Logger log= LoggerFactory.getLogger(NoSQLConnection.class);
    private NoSQLConnection(){
        log.info("NoSQLConnection Initialized");
    }
}
