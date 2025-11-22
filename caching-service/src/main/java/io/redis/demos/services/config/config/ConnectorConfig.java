package io.redis.demos.services.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class ConnectorConfig {

     @Value("${database.hostname")
     private String databaseHostname;

     @Value("${database.name")
     private String databaseName;

     @Value("${database.port")
     private String databasePort;

     @Value("${database.user")
     private String databaseUser;

     @Value("${database.password}")
     private String rdbmsDBPassword;

     @Value("${database.password}")
     private String databasePassword;

     @Value("${database.server.id}")
     private String databaseServerId;

     @Value("${database.server.name}")
     private String databaseServerName;

     @Value("${table.whitelist}")
     private String tableWhitelist;

}
