package com.company;

/**
 * Created by LENOVO on 11-Jun-15.
 */
public class Pengendara {

    private String namaPengendara;
    private String alamatPengendara;
    private char jeniskelaminPengendara;
    private String pekerjaanPengendara;

    public Pengendara(String namaPengendara, String alamatPengendara, char jeniskelaminPengendara, String pekerjaanPengendara) {
        this.namaPengendara = namaPengendara;
        this.alamatPengendara = alamatPengendara;
        this.jeniskelaminPengendara = jeniskelaminPengendara;
        this.pekerjaanPengendara = pekerjaanPengendara;
    }

    public String getNamaPengendara() {
        return namaPengendara;
    }

    public void setNamaPengendara(String namaPengendara) {
        this.namaPengendara = namaPengendara;
    }

    public String getAlamatPengendara() {
        return alamatPengendara;
    }

    public void setAlamatPengendara(String alamatPengendara) {
        this.alamatPengendara = alamatPengendara;
    }

    public char getJeniskelaminPengendara() {
        return jeniskelaminPengendara;
    }

    public void setJeniskelaminPengendara(char jeniskelaminPengendara) {
        this.jeniskelaminPengendara = jeniskelaminPengendara;
    }

    public String getPekerjaanPengendara() {
        return pekerjaanPengendara;
    }

    public void setPekerjaanPengendara(String pekerjaanPengendara) {
        this.pekerjaanPengendara = pekerjaanPengendara;
    }

    @Override
    public String toString() {
        return "Pengendara{" +
                "namaPengendara='" + namaPengendara + '\'' +
                ", alamatPengendara='" + alamatPengendara + '\'' +
                ", jeniskelaminPengendara=" + jeniskelaminPengendara +
                ", pekerjaanPengendara='" + pekerjaanPengendara + '\'' +
                '}';
    }
}
