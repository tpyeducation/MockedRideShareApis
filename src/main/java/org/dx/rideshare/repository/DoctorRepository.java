package org.dx.rideshare.repository;

import com.github.javafaker.Faker;
import org.dx.rideshare.model.Driver;
import org.mitre.synthea.engine.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepository {

    @Autowired
    private Faker fakerAuto;

    @Autowired
    private Generator generatorAuto;

    public List<Driver> getDriversFromRepository() {
        List<Driver> doctors = new ArrayList<>();
        Driver doctors1 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Car");
        Driver doctors2 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Van");
        Driver doctors3 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "SUV");
        Driver doctors4 = new Driver(generatorAuto.getRandomizer().randInt(), generatorAuto.location.city,
                generatorAuto.toString());
        Driver doctors5 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Lorry");

        doctors.add(doctors1);
        doctors.add(doctors2);
        doctors.add(doctors3);
        doctors.add(doctors4);
        doctors.add(doctors5);
        return doctors;
    }



}
