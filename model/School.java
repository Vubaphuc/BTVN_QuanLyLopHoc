package model;

import java.time.LocalDate;

public class School {

    private String hoVaTen;
    private LocalDate ngaySinh;
    private String queQuan;

    public School() {
    }

    public School(String hoVaTen, LocalDate ngaySinh, String queQuan) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "School{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }
}
