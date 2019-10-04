/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.north.csvreader;

import java.util.ArrayList;

/**
 *
 * @author mohammed
 */
public class Measurements {

    private ArrayList<DataUnit> measurements = new ArrayList<DataUnit>();

    public ArrayList<DataUnit> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(ArrayList<DataUnit> measurements) {
        this.measurements = measurements;
    }

}
