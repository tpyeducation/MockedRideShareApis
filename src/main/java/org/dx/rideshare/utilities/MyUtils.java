package org.dx.rideshare.utilities;


import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

import java.net.InetAddress;
import java.time.LocalDateTime;

public class MyUtils {

    private MyUtils() {

    }

    public static String collectOS() {
        SystemInfo si = new SystemInfo();
        OperatingSystem os = si.getOperatingSystem();

        System.out.println("OS: " + os.getFamily());
        System.out.println("Version: " + os.getVersionInfo());


        return os.getFamily() + "<<>>>>" + os.getVersionInfo() + "><<<" + si.getHardware().getComputerSystem().getManufacturer()
                + "<>" + si.getOperatingSystem().getFamily();
    }

    public static String getMyIP() {
        try {

            InetAddress localHost = InetAddress.getLocalHost();

            String hostname = localHost.getHostName();
            String ipAddress = localHost.getHostAddress();
            LocalDateTime localDateTime = LocalDateTime.now();

            System.out.println("LocalDateTime:=================" + localDateTime + "<<<<<<<>>>>>>>>>..");
            System.out.println("Hello TP year 2");
            System.out.println("Hostname: " + hostname);
            System.out.println("IP Address: " + ipAddress);
            return hostname + ">><<" + ipAddress;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
