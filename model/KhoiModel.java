package model;

import java.util.ArrayList;
import java.util.Scanner;

public class KhoiModel {
    SchoolModel schoolModel = new SchoolModel();

    public Khoi Khoi(Scanner sc){
        System.out.println("Nhập Tên lớp");
        String tenLop = sc.nextLine();
        System.out.println("Kỳ Học");
        int kyHoc = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số học sinh");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<School> schools = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ "+(i+1));
            School school = schoolModel.thongTinHocSinh(sc);
            schools.add(school);
        }

        Khoi khoi = new Khoi(tenLop, kyHoc, schools);

        return khoi;
    }
}
