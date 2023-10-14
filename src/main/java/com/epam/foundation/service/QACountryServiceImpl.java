package com.epam.foundation.service;

import com.epam.foundation.entity.Country;
import com.epam.foundation.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QACountryServiceImpl implements CountryService {

    private CountryRepository repository;

    @Autowired
    public QACountryServiceImpl(final CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public String saveData() {
        final Country country = new Country();
        country.setId(1);
        country.setName("customName - qa env");
        repository.save(country);
        return country.getName();
    }
}
