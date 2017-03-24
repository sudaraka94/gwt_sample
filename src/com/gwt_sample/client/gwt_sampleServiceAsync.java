package com.gwt_sample.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface gwt_sampleServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
