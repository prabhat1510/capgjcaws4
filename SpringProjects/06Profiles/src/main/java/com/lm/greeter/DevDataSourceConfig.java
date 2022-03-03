package com.lm.greeter;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dataSource")
@Profile("dev")
public class DevDataSourceConfig implements DataSourceConfig {

    @Override
    public void setup() {
        System.out.println("Setting up datasource for DEV environment. ");
    }

}