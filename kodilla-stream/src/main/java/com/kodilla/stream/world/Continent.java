package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

   private final String continent;
   private final Set<Country> countriesOfTheContinent = new HashSet<>();

   public Continent(final String continent ){this.continent = continent;}

    public String getContinent() {
        return continent;
    }

    public Set<Country> getCountries() {
        return countriesOfTheContinent ;
    }

    @Override
    public String toString(){
       return "Continent " + continent;
    }

    @Override
    public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Continent)) return false;
    Continent continentEquals = (Continent) o;
    return  continent.equals(continentEquals.continent);
    }
}
