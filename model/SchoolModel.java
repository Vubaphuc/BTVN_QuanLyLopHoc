package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SchoolModel {

    public School thongTinHocSinh(Scanner sc){
        System.out.println("Nhập Họ và Tên Học Sinh: ");
        String hoVaTen = sc.nextLine();
        System.out.println("Ngày Tháng Năm Sinh");
        String nS = sc.nextLine();
        LocalDate ngaySinh = LocalDate.parse(nS, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Quê Quán");
        String queQuan = sc.nextLine();
        School school = new School(hoVaTen, ngaySinh, queQuan);

        return school;

    }
}
