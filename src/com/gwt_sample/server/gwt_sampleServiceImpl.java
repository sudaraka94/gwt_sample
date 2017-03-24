package com.gwt_sample.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwt_sample.client.gwt_sampleService;

public class gwt_sampleServiceImpl extends RemoteServiceServlet implements gwt_sampleService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
//        if(msg.equals("Vishaka")){
//            return "Client said: \"" + msg + "\"<br>Server answered: \"Hi Sudaraka's wife!\"";
//
//        }else {
//            return "Client said: \"" + msg + "\"<br>Server answered: \"Hi! Stranger\"";
//        }
        String[] numbers=msg.split(",");
        float num1=Float.valueOf(numbers[0]);
        float num2=Float.valueOf(numbers[1]);
        float val=num1+num2;
        return String.valueOf(val);
    }
}