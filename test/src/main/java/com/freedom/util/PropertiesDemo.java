package com.freedom.util;

import java.util.Properties;

/**
 * Created by kshine on 2017/5/22.
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("王大锤","30");

        prop.getProperty("王大锤");
    }
}
