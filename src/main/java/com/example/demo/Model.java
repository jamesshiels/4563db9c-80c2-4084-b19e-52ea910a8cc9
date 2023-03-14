package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="values")
public class Model {
    private int id;
    private String temperature;
    private String wind_speed;
    private String humidity;
    private String min_;
    private String max_;
    private String sum_;
    private String average;
    private String date;

    public Model(){

    }

    public Model(int id, String temperature, String wind_speed, String humidity, String min_, String max_, String sum_, String average, String date) {
        this.id = id;
        this.temperature = temperature;
        this.wind_speed = wind_speed;
        this.humidity = humidity;
        this.min_ = min_;
        this.max_ = max_;
        this.sum_ = sum_;
        this.average = average;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getMin_() {
        return min_;
    }

    public void setMin_(String min_) {
        this.min_ = min_;
    }

    public String getMax_() {
        return max_;
    }

    public void setMax_(String max_) {
        this.max_ = max_;
    }

    public String getSum_() {
        return sum_;
    }

    public void setSum_(String sum_) {
        this.sum_ = sum_;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
