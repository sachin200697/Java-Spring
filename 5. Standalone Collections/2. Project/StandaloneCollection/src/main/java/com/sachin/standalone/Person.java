package com.sachin.standalone;

import java.util.*;

 

public class Person {
    private List<String> Friends;
    private Map<String, String> feeStructure;
    private Properties properties;

    public Map<String, String> getFeeStructure() {
        return feeStructure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setFeeStructure(Map<String, String> feeStructure) {
        this.feeStructure = feeStructure;
    }
   
    public List<String> getFriends() {
        return Friends;
    }

    public void setFriends(List<String> Friends) {
        this.Friends = Friends;
    }

    @Override
    public String toString() {
        return "Person{" + "Friends=" + Friends + ", feeStructure=" + feeStructure + ", properties=" + properties + '}';
    }

        
}
