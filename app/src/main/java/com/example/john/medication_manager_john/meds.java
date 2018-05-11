package com.example.john.medication_manager_john;

import java.io.Serializable;


/**
 * Created by John on 5/5/2018.
 */

public class meds implements Serializable {
    private long id;
    private String name;
    private String amount;
    private String unit;
    private String Frequency;

    public meds(){

    }



    public meds(long id, String name, String amount, String unit, String Frequency)
    {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.Frequency = Frequency;

    }
    public meds(String name, String amount, String unit, String Frequency)

    {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.Frequency = Frequency;

    }

    public meds(long id, String name, String amount, String unit, String Frequency) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.Frequency = Frequency;
}

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount){
        this.amount = amount;
    }

    public String getUnit(){
        return unit;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public String getFrequency(){
        return Frequency;
    }
    public void setFrequency(String Frequency){
        this.name = Frequency;
    }

    @Override
    public String toString(){
        return "com.example.john.medication_manager_john.meds{"+
                "name='" + name + '\''+
                ", amount='" + amount + '\'' +
                ", unit='" + unit + '\'' +
                ", Frequency'" + Frequency + '\''+
                '}';

    }

}
