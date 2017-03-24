package com.gwt_sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.DOM;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class gwt_sample implements EntryPoint {

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        final Button button = new Button("Add");
        final TextBox textBox1=new TextBox();
        final TextBox textBox2=new TextBox();
        final Label label = new Label();

        button.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
//                if (label.getText().equals("")) {
//                    gwt_sampleService.App.getInstance().getMessage(textBox1.getText()+textBox2.getText(), new MyAsyncCallback(label,textBox1,textBox2));
//                } else {
//                    label.setText("");
//                }
                gwt_sampleService.App.getInstance().getMessage(textBox1.getText()+","+textBox2.getText(), new MyAsyncCallback(label,textBox1,textBox2));
            }
        });

        // Assume that the host HTML has elements defined whose
        // IDs are "slot1", "slot2".  In a real app, you probably would not want
        // to hard-code IDs.  Instead, you could, for example, search for all
        // elements with a particular CSS class and replace them with widgets.
        //
        RootPanel.get("slot1").add(button);
        RootPanel.get("slot2").add(label);
        RootPanel.get("slot3").add(textBox2);
        RootPanel.get("slot4").add(textBox1);
    }

    private static class MyAsyncCallback implements AsyncCallback<String> {
        private Label label;

        public MyAsyncCallback(Label label,TextBox textBox1,TextBox textBox2) {
            this.label = label;
        }

        public void onSuccess(String result) {
            label.getElement().setInnerHTML(result);
        }

        public void onFailure(Throwable throwable) {
            label.setText("Failed to receive answer from server!");
        }
    }
}
