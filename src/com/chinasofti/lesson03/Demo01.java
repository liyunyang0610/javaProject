package com.chinasofti.lesson03;

public class Demo01 {
    public static void main(String[] args) {

        Car Aodi = AodiFactory.createAodi();
        Car BenChi  = BenChiFactory.createBenChi();
        Aodi.run();
        BenChi.run();
    }
}
