package org.example.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
 private String name;
 private CoordInfo coord;

 private MainInfo main;

    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    private ArrayList<weatherInfo> weather;

    public ArrayList<weatherInfo> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<weatherInfo> weather) {
        this.weather = weather;
    }

    public CoordInfo getCoord() {
        return coord;
    }

    public void setCoord(CoordInfo coord) {
        this.coord = coord;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "name='" + name + '\'' +
                ", coord=" + coord +
                ", main=" + main +
                ", weather=" + weather +
                '}';
    }
}
