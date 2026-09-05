package org.dx.rideshare.service;

import org.dx.rideshare.model.Driver;
import org.dx.rideshare.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriversService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Driver> getDoctorsFromService() {
        List<Driver> doctors = doctorRepository.getDriversFromRepository();

        return doctors;
    }

}
