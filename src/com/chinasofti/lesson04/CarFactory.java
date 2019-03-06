package com.chinasofti.lesson04;

public class CarFactory {

    public static Car createCar(String brand){

        if (brand==null){
            return null;
        }

        Car car = null;
        switch (brand){
            case "奥迪" :{
                car = new Aodi();
                break;
            }
            case "奔驰" :{
                car = new BenChi();
                break;
            }
            default:
                break;
        }
        return car;
    }
}
