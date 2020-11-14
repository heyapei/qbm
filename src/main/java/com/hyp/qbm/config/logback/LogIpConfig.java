package com.hyp.qbm.config.logback;
 
import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xiaoming
 * @date 2019/5/14 11:37
 * @description
 */
public class LogIpConfig extends ClassicConverter {

    private static String webIP;
    static {
        try {
            webIP = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            webIP = null;
        }
    }
 
    @Override
    public String convert(ILoggingEvent event) {

        return webIP;
    }


}