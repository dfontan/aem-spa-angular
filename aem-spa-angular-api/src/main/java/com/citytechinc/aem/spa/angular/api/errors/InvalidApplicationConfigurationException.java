package com.citytechinc.aem.spa.angular.api.errors;

public class InvalidApplicationConfigurationException extends Exception {

    public InvalidApplicationConfigurationException(String m) {
        super(m);
    }

    public InvalidApplicationConfigurationException(String m, Exception e) {
        super(m, e);
    }

}
