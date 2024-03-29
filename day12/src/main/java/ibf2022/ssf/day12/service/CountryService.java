package ibf2022.ssf.day12.service;

import ibf2022.ssf.day12.repository.CountryRepo;

import java.util.List;

import ibf2022.ssf.day12.model.Country;


public class CountryService {

    CountryRepo ctyRepo;

    public CountryService() {
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries() {
        return ctyRepo.getAllCountries();

    }

    public Boolean createCountry(Country cty) {
        Boolean result = ctyRepo.createCountry(cty);
        return result;
    }
    
}
