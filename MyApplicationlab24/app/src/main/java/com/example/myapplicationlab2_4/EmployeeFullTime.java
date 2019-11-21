package com.example.myapplicationlab2_4;

public class EmployeeFullTime extends Employee {

    @Override
    public double TinhLuong() {
        return 500;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +" -->FullTime="+TinhLuong();
    }
}