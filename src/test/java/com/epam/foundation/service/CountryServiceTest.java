package com.epam.foundation.service;

import com.epam.foundation.entity.Country;
import com.epam.foundation.repository.CountryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CountryServiceTest {

    @Autowired
    private CountryService countryService;
    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void testSaveDataDev() {
        countryService.saveData();
        final Country country = countryRepository.findById(1).orElse(null);
        Assertions.assertEquals("customName - dev env", country.getName());
    }
}
