package com.jetty.issue.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

public class JettyIssueEntry implements EntryPoint {

    @JsType(name = "Window", isNative = true)
    public interface HTMLWindow {
        @JsProperty String getName();
        @JsProperty void setName(String name);
    }

    @Override
    public void onModuleLoad() {
        HTMLWindow window = (HTMLWindow) ScriptInjector.TOP_WINDOW;
        window.setName("Window Name");
        RootPanel.get().add(new Label(window.getName()));
    }
}
