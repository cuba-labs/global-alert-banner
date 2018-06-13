package com.company.demo;

import com.haulmont.cuba.core.config.Config;
import com.haulmont.cuba.core.config.Property;
import com.haulmont.cuba.core.config.Source;
import com.haulmont.cuba.core.config.SourceType;

@Source(type = SourceType.DATABASE)
public interface MaintenanceConfig extends Config {

    @Property("maintenance.globalAlert")
    String getGlobalAlert();
    void setGlobalAlert(String alert);
}