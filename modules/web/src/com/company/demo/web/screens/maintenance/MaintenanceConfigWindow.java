package com.company.demo.web.screens.maintenance;

import com.company.demo.MaintenanceConfig;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.TextArea;

import javax.inject.Inject;
import java.util.Map;

public class MaintenanceConfigWindow extends AbstractWindow {
    @Inject
    private MaintenanceConfig maintenanceConfig;
    @Inject
    private TextArea alertTextArea;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        alertTextArea.setValue(maintenanceConfig.getGlobalAlert());
    }

    public void apply() {
        maintenanceConfig.setGlobalAlert(alertTextArea.getValue());

        close(COMMIT_ACTION_ID);

        showNotification("New global alert applied");
    }

    public void close() {
        close(CLOSE_ACTION_ID);
    }
}