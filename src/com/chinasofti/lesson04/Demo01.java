package com.chinasofti.lesson04;

public class Demo01 {

    public static void main(String[] args) {

        Car car = CarFactory.createCar("奥迪");
        car.run();
        Car car1 = CarFactory.createCar("奔驰");
        car1.run();
    }
}
