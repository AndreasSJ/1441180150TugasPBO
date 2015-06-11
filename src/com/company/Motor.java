package com.company;

/**
 * Created by LENOVO on 11-Jun-15.
 */
public class Motor {

    private String merkMotor;
    private Double hargaMotor;
    private String warnaMotor;
    private int ccMotor;

    public Motor(String merkMotor, Double hargaMotor, String warnaMotor, int ccMotor) {
        this.merkMotor = merkMotor;
        this.hargaMotor = hargaMotor;
        this.warnaMotor = warnaMotor;
        this.ccMotor = ccMotor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public Double getHargaMotor() {
        return hargaMotor;
    }

    public void setHargaMotor(Double hargaMotor) {
        this.hargaMotor = hargaMotor;
    }

    public String getWarnaMotor() {
        return warnaMotor;
    }

    public void setWarnaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
    }

    public int getCcMotor() {
        return ccMotor;
    }

    public void setCcMotor(int ccMotor) {
        this.ccMotor = ccMotor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "merkMotor='" + merkMotor + '\'' +
                ", hargaMotor=" + hargaMotor +
                ", warnaMotor='" + warnaMotor + '\'' +
                ", ccMotor=" + ccMotor +
                '}';
    }
}
