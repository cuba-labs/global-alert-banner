package com.company.demo.web.screens;

import com.company.demo.MaintenanceConfig;
import com.google.common.base.Strings;
import com.haulmont.cuba.gui.components.Label;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private MaintenanceConfig maintenanceConfig;
    @Inject
    private Label alertLabel;

    @Override
    public void ready() {
        super.ready();

        String globalAlert = maintenanceConfig.getGlobalAlert();
        if (!Strings.isNullOrEmpty(globalAlert)) {
            alertLabel.setVisible(true);
            alertLabel.setValue(globalAlert);
        }
    }
}