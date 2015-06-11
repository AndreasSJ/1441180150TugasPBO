package com.company;

/**
 * Created by LENOVO on 11-Jun-15.
 */
public class TestPengendara {

    public static void main(String[] args) {

        Pengendara andre = new Pengendara("andre","sidoarjo",'L',"pns");
        System.out.println(andre.getNamaPengendara());
        System.out.println(andre.getAlamatPengendara());
        System.out.println(andre.getJeniskelaminPengendara());
        System.out.println(andre.getPekerjaanPengendara());

        Motor mio = new Motor("yamaha",14.000000,"merah",115);
        System.out.println(mio.getMerkMotor());
        System.out.println(mio.getHargaMotor());
        System.out.println(mio.getWarnaMotor());
        System.out.println(mio.getCcMotor());
    }
}
