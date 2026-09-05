package org.dx.rideshare.repository;

import com.github.javafaker.Faker;
import org.dx.rideshare.model.Driver;
import org.mitre.synthea.engine.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DriversRepository {

    @Autowired
    private Faker fakerAuto;

    @Autowired
    private Generator generatorAuto;

    private final List<Driver> drivers = new ArrayList<>();

    @PostConstruct
    public void loadData() {
        Driver doctors1 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Car");
        Driver doctors2 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Van");
        Driver doctors3 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "SUV");
        Driver doctors4 = new Driver(generatorAuto.getRandomizer().randInt(), generatorAuto.location.city,
                generatorAuto.toString());
        Driver doctors5 = new Driver(generatorAuto.getRandomizer().randInt(), fakerAuto.name().fullName(), "Lorry");

        drivers.add(doctors1);
        drivers.add(doctors2);
        drivers.add(doctors3);
        drivers.add(doctors4);
        drivers.add(doctors5);
    }

    public List<Driver> getDriversFromRepository() {
             return drivers;
    }



}
