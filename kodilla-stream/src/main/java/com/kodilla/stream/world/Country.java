package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String country;
    private final int population;

    public Country(final String country, final int population){
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal  getPopulation() {
        return new BigDecimal(this.population);
    }

    @Override
    public String toString(){
        return "Country: " + country + '\'' +
                " Population: " + population;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (!( o instanceof Country)) return false;
        Country countryEquals = (Country) o;
        return getCountry().equals(countryEquals.getCountry());
    }
}
