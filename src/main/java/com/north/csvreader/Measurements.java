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
