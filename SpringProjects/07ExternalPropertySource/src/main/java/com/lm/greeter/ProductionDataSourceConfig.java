package com.lm.greeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("dataSource")
@Profile("prod")
@PropertySource("/proddb.properties")
public class ProductionDataSourceConfig implements DataSourceConfig {

	@Autowired
	Environment env;

	@Override
	public void setup() {
		System.out.println("Setting up datasource for PRODUCTION environment. ");

		MyDbConfig dbConf = new MyDbConfig();
		dbConf.setDbHost(env.getProperty("db.host.url"));
		dbConf.setDbPort(env.getProperty("db.port.number"));
		dbConf.setDbService(env.getProperty("db.service.name"));

		dbConf.setDbPassword(env.getProperty("db.password"));
		System.out.println(dbConf.toString());
	}

}
