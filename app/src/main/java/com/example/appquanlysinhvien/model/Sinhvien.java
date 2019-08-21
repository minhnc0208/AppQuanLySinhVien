package com.example.appquanlysinhvien.model;

public class Sinhvien {
    private String ten;
    private String lop;
    private String diaChi;

    public Sinhvien(String ten, String lop, String diaChi) {
        this.ten = ten;
        this.lop = lop;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
