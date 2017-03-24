package com.gwt_sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("gwt_sampleService")
public interface gwt_sampleService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use gwt_sampleService.App.getInstance() to access static instance of gwt_sampleServiceAsync
     */
    public static class App {
        private static gwt_sampleServiceAsync ourInstance = GWT.create(gwt_sampleService.class);

        public static synchronized gwt_sampleServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
