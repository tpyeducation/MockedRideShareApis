package org.dx.rideshare.service;

import org.dx.rideshare.model.Property;
import org.dx.rideshare.repository.PropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertiesService {

    @Autowired
    private PropertiesRepository propertiesRepository;

    public List<Property> getProperties() {
        List<Property> a =propertiesRepository.getProperties();
        return a;
    }



}
