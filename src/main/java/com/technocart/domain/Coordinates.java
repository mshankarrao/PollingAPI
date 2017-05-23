package com.technocart.domain;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shankarraomata on 5/21/17.
 */
@Entity
@Table(name = "datapoints")
public class Coordinates {

    @Id
    @Column(name="id")
    private String vehicleCode;

    @Column(name="longitude")
    private Double longitude;

    @Column(name="latitude")
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
