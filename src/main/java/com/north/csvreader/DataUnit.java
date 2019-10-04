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
