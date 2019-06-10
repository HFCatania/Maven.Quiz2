package com.zipcodewilmington.assessment2.part3;

public class RedRobin implements Animal{
   String migrationMonth;
    @Override
    public String move() {
        return null;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }

    public RedRobin() {
    }

    public String migrationMonth(){
        return null;
    }

    public String getMigrationMonth(){
        return migrationMonth;
    }

    public String setMigrationMonth(){
       return this.migrationMonth;
    }
}
