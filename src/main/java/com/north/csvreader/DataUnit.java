/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.north.csvreader;

/**
 *
 * @author mohammed
 */
public class DataUnit {

    public DataUnit(int time, double value, String comment) {
        this.time = time;
        this.value = value;
        this.comment = comment;
    }
    private int time;
    private double value;
    private String comment;
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
