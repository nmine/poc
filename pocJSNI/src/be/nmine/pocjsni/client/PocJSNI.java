package be.nmine.pocjsni.client;

import be.nmine.pocjsni.client.views.TextBoxWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PocJSNI implements EntryPoint {
    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
	TextBoxWidget textBoxWidget = new TextBoxWidget();
	RootPanel.get().add(textBoxWidget);
    }
}
