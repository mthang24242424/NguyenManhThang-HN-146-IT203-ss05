package Ss05;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] SinhVien = new String[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Hien thi danh sach MSSV");
            System.out.println("2. Them MSSV moi");
            System.out.println("3. Cap nhat MSSV theo index");
            System.out.println("4. Xoa MSSV");
            System.out.println("5. Tim kiem MSSV theo chuoi bat ki");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sach rong");
                    } else {
                        System.out.println("Danh sach MSSV:");
                        for (int i = 0; i < count; i++) {
                            System.out.println(i+1 + ": " + SinhVien[i]);
                        }
                    }
                    break;

                case 2:
                    String newSinhVien;
                    while (true) {
                        System.out.print("Nhap MSSV moi: ");
                        newSinhVien = sc.nextLine();
                        if (newSinhVien.matches("^B\\d{7}$")) {
                            SinhVien[count] = newSinhVien;
                            count++;
                            System.out.println("Them thanh cong!");
                            break;
                        } else {
                            System.out.println("Sai dinh dang! Vi du dung: B2101234");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap index can sua: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index < 0 || index >= count) {
                        System.out.println("Index khong hop le!");
                    } else {
                        String updateMSSV;
                        while (true) {
                            System.out.print("Nhap MSSV moi: ");
                            updateMSSV = sc.nextLine();
                            if (updateMSSV.matches("^B\\d{7}$")) {
                                SinhVien[index] = updateMSSV;
                                System.out.println("Cap nhat thanh cong!");
                                break;
                            } else {
                                System.out.println("Sai dinh dang MSSV!");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Nhap MSSV can xoa: ");
                    String deleteMSSV = sc.nextLine();
                    boolean check = false;

                    for (int i = 0; i < count; i++) {
                        if (SinhVien[i].equals(deleteMSSV)) {
                            for (int j = i; j < count - 1; j++) {
                                SinhVien[j] = SinhVien[j + 1];
                            }
                            count--;
                            check = true;
                            System.out.println("Xoa thanh cong!");
                            break;
                        }
                    }

                    if (!check) {
                        System.out.println("Khong tim thay MSSV!");
                    }
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}
