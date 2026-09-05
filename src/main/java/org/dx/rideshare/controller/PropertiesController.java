package org.dx.rideshare.controller;

import org.dx.rideshare.model.Property;
import org.dx.rideshare.service.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mock")
public class PropertiesController  {

    @Autowired
    private PropertiesService propertiesService;


    @GetMapping("/properties")
    public ResponseEntity<List<Property>> propertiesGet() {
       List<Property> r= propertiesService.getProperties();
       ResponseEntity<List<Property>> j = new ResponseEntity<>(r, HttpStatus.OK);
        return j;
    }


}
