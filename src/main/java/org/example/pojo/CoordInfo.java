package org.example.pojo;

public class CoordInfo {
    double lon;
    double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "CoordInfo{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
