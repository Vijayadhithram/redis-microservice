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

     public io.debezium.config.Configuration createConnectorConfig() {
          Properties props = new Properties();

          props.setProperty("name", "cacheserviceengine");
          props.setProperty("connector.class", "io.debezium.connector.mysql.MySqlConnector");

          props.setProperty("database.hostname", databaseHostname);
          props.setProperty("database.name", databaseName);
          props.setProperty("database.port", databasePort);
          props.setProperty("database.user", databaseUser);
          props.setProperty("database.password", databasePassword);
          props.setProperty("database.server.id", databaseServerId);
          props.setProperty("database.server.name", databaseServerName);
          props.setProperty("database.history", "io.debezium.relational.history.FileDatabaseHistory");
          props.setProperty("database.history.file.filename", "./dbhistory.dat");
          props.setProperty("table.whitelist", tableWhitelist);



     }

}
