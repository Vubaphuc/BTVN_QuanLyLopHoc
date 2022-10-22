import model.Khoi;
import model.KhoiModel;
import model.SchoolModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchoolModel schoolModel = new SchoolModel();
        KhoiModel khoiModel = new KhoiModel();
        Khoi khoi = new Khoi();
        while (true){
            System.out.println("1. Nhập Hồ Sơ Học Sinh ");
            System.out.println("2. Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên");
            System.out.println("3. Hiển thị ra màn hình tất cả những học sinh của lớp 10A1");
            System.out.println("0. Thoát Chương Trình");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1:
                    khoiModel.Khoi(sc);
                    break;
                case 2:
                    int namSinh = 1985;
                    String que = "Thái Nguyên";
                    if (khoi!=null) {
                        for (int i = 0; i < khoi.getSchools().size(); i++) {
                            if (khoi.getSchools().get(i).getNgaySinh().getYear() == namSinh && khoi.getSchools().get(i).getQueQuan().equalsIgnoreCase(que)) {
                                System.out.println(khoi.getSchools().toString());
                            }else {
                                System.out.println("không có bạn nào!");
                            }
                        }
                    }else {
                        System.out.println("không có bạn nào!");
                    }
                    break;
                case 3:
                    if (khoi != null) {
                        String lop = "10A1";
                        for (int i = 0; i < khoi.getSchools().size(); i++) {
                            if (khoi.getLop().equalsIgnoreCase(lop)) {
                                System.out.println(khoi.getSchools().toString());
                            } else {
                                System.out.println("không có lớp 10A1 nào!");
                            }
                        }
                    }else {
                        System.out.println("không có lớp 10A1 nào!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát Chương Trình");
                    System.exit(0);
                    break;
            }
        }
    }
}