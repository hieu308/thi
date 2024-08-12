package thi.view;

import thi.controller.AccountPayController;
import thi.controller.AcountSaveController;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AcountSaveController acountSaveController = new AcountSaveController();
        AccountPayController accountPayController = new AccountPayController();
        do {
            System.out.println("Chọn chức năng để tiếp tục \n" +
                    "1.thêm moi \n" +
                    "2.xoa  \n" +
                    "3.xem danh sách \n" +
                    "4.Tim kiem  \n" +
                    "5.Thoat");
            System.out.println("Nhap lua chon");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Thêm tai khoan thanh toán \n" +
                            "2.Thêm mới tài khoản tiết kiệm \n" +
                            "3.trở về "
                    );
                    System.out.println("Nhap lua chon");
                    int choice3 = sc.nextInt();
                    switch (choice3) {
                        case 1:
                            accountPayController.addAccountPay();
                            break;
                        case 2:
                            acountSaveController.addAccountSave();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.Xoá tai khoan thanh toán \n" +
                            "2.Xoá tài khoản tiết kiệm \n" +
                            "3.trở về "
                    );
                    System.out.println("Nhap lua chon");
                    int choice4 = sc.nextInt();
                    switch (choice4) {
                        case 1:
                            accountPayController.deleteAccountPay();
                            break;
                        case 2:
                            accountPayController.deleteAccountPay();
                    }
                    break;
                case 4:
                    System.out.println("1.Tìm tai khoan thanh toán \n" +
                            "2.Tìm tài khoản tiết kiệm \n" +
                            "3.trở về "
                    );
                    System.out.println("Nhap lua chon");
                    int choice5 = sc.nextInt();
                    switch (choice5) {
                        case 1:
                            accountPayController.searchAccountPay();
                            break;
                        case 2:
                            acountSaveController.searchAccountPay();
                            break;

                    }

                case 3:
                    System.out.println("1.hien thi tai khoan thanh toán \n" +
                            "2.Hiển thị tài khoản tiết kiệm \n" +
                            "3.trở về "
                    );
                    System.out.println("Nhap lua chon");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            accountPayController.displayAccountPay();
                            break;
                        case 2:
                            acountSaveController.displayAccountSave();
                            break;

                    }
                    break;


            }
        } while (true);

    }
}
