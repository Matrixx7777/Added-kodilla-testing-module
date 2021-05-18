package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageValueTemperatures() {
        Map<String, Double> averageValue = new HashMap<>();

        double sum = 0;
        for (Map.Entry<String, Double> temperature :
               temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();

        }
        sum = sum / averageValue.size();

        return sum;
    }

//    public double medianaOfTemperatures() {
//        Map<String, Double> medianaMap = new HashMap<>();
//
//        double mediana=0;
//        double average = 0.0;
//        Arrays.sort(medianaMap.values().toArray(new Double[0]));
//
//        if (medianaMap.size() % 2 == 0 )
//        {
//            average = medianaMap[medianaMap.size()/2] + medianaMap[(medianaMap.size()/2)-1];
//
//            mediana = average/2.0;
//
//        }
//        else
//        {
//            mediana = medianaMap[medianaMap.size()/2];
//        }
//
//        return mediana;
//    }
}
