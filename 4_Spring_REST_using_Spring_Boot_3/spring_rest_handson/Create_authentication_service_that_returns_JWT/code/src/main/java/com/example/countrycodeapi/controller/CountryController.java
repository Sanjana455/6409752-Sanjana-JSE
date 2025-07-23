package com.example.countrycodeapi.controller;

import com.example.countrycodeapi.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CountryController {

    private static final Map<String, Country> countries = new HashMap<>();

    static {
        countries.put("IN", new Country("IN", "India", "New Delhi"));
        countries.put("US", new Country("US", "United States", "Washington D.C."));
        countries.put("FR", new Country("FR", "France", "Paris"));
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = countries.get(code.toUpperCase());
        if (country == null) {
            throw new RuntimeException("Country not found for code: " + code);
        }
        return country;
    }
}
