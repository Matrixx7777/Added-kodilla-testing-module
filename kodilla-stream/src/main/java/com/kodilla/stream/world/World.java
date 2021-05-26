package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {

public final Set<Continent> continentsOfTheWorld;

public World(){continentsOfTheWorld = new HashSet<>();}

    public Set<Continent> getContinentsOfTheWorld() {
        return continentsOfTheWorld;
    }
    public void addContinent(Continent continent){
    continentsOfTheWorld.add(continent);
}

    public void removeContinent(Continent continent){
    continentsOfTheWorld.remove(continent);
}

public BigDecimal getPeopleQuantity(){

return getContinentsOfTheWorld().stream()
        .flatMap(continent -> continent.getCountries().stream())
        .map(Country::getPopulation)
        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
