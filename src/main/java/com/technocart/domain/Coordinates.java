package com.technocart.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by shankarraomata on 5/21/17.
 */
@Getter
@Setter
public class Coordinates {

    private String vehicleCode;

    private Double longitude;

    private Double latitude;

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
