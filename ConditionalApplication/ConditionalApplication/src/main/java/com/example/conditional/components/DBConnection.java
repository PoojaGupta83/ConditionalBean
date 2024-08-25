package com.example.conditional.components;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
public static final Logger log= LoggerFactory.getLogger(DBConnection.class);

private  DBConnection(MySQLConnection mySQLConnection,NoSQLConnection noSQLConnection){
log.info("mySQLConnection:{}",mySQLConnection.hashCode());
log.info("NosqlConnection:{}",noSQLConnection.hashCode());
}
@PostConstruct
public void init(){
    log.info("DBConnection initialized");


    }
}
