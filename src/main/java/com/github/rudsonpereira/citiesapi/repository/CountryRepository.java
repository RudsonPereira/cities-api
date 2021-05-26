package com.github.rudsonpereira.citiesapi.repository;

import com.github.rudsonpereira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
