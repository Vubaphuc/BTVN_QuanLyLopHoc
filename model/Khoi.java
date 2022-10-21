package model;

import java.util.ArrayList;

public class Khoi {
    private String lop;
    private int khoaHoc;
    private int kyHoc;
    private ArrayList<School> schools = new ArrayList<>();

    public Khoi(String tenLop, int kyHoc, ArrayList<School> schools) {
    }

    public Khoi() {
    }

    public Khoi(String lop, int khoaHoc, int kyHoc, ArrayList<School> schools) {
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
        this.schools = schools;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "Khoi{" +
                "lop='" + lop + '\'' +
                ", khoaHoc=" + khoaHoc +
                ", kyHoc=" + kyHoc +
                ", schools=" + schools +
                '}';
    }
}

