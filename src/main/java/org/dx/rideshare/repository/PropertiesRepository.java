package org.dx.rideshare.repository;

import org.dx.rideshare.utilities.MyUtils;
import org.dx.rideshare.model.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PropertiesRepository {

    @Value("${env.name}")
    private String environment;

    public List<Property> getProperties() {
        List<Property> allProperties = new ArrayList<>();
        String IPAddress = MyUtils.getMyIP();
        Property IPAddressProperty = new Property("myIPAddress", IPAddress);
        String osDetails = MyUtils.collectOS();
        Property osDetailsProperty = new Property("osDetails", osDetails);
        Property envDetailsProperty = new Property("env", environment);
        allProperties.add(IPAddressProperty);
        allProperties.add(osDetailsProperty);
        allProperties.add(envDetailsProperty);
        return allProperties;
    }








}
