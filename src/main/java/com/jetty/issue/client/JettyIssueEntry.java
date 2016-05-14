package com.jetty.issue.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class JettyIssueEntry implements EntryPoint {

    @Override
    public void onModuleLoad() {
        GWT.setUncaughtExceptionHandler(e -> GWT.log(e.getMessage(), e));

        RootPanel.get().add(new Label("Loaded!"));
    }
}
