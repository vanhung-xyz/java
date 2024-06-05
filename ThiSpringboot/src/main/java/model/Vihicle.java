package model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle_production")
public class Vihicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private int vehicleId;

    @Column(name = "vehicle_name", nullable = false)
    private String vehicleName;

    @Column(name = "vehicle_model", nullable = false)
    private String vehicleModel;

    @Column(name = "year_of_manufacture", nullable = false)
    private int yearOfManufacture;

    @Column(name = "vehicle_color")
    private String vehicleColor;

    public Vihicle(int vehicleId, String vehicleName, String vehicleModel, int yearOfManufacture, String vehicleColor) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleColor = vehicleColor;
    }

    public Vihicle() {
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
