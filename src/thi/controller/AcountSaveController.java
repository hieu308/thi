package thi.controller;

import thi.model.AccountPay;
import thi.model.AccountSaving;
import thi.service.AccountSaveService;
import thi.service.IAccountSaveService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AcountSaveController {
    IAccountSaveService accountSaveService = new AccountSaveService();
    Scanner sc = new Scanner(System.in);
    public void displayAccountSave() {
        List<AccountSaving> payList = accountSaveService.getAll();
        if (payList.size() > 0) {
            for (AccountSaving accountSaving : payList) {
                System.out.println(accountSaving);

            }
        } else {
            System.out.println("Không tìm thấy id");
        }
    }
    public   void addAccountSave() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mã bank");
        String bank = sc.nextLine();
        System.out.println("Nhap tên");
        String nameOwner = sc.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        LocalDate date = LocalDate.parse(sc.nextLine());
        System.out.println("Nhap số tiền gởi tiết kiệm");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập ngày gởi");
        LocalDate date2 = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập lãi xuất phần trăm");
        int term = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập kì hàng tháng");
        int month = Integer.parseInt(sc.nextLine());
        AccountSaving accountSaving = new AccountSaving (id,bank,nameOwner,date,number,date2,term,month);
        accountSaveService.addAccountSave(accountSaving);
        System.out.println("Thêm thành cong");


    }
    public void searchAccountPay() {

        System.out.println("Nhâp id account pay:");
        int id = Integer.parseInt(sc.nextLine());
        accountSaveService.search(id);

    }
    public void deleteAccountSave() {
        System.out.println("Nhập id account pay cần xoá:");
        int id = Integer.parseInt(sc.nextLine());
        accountSaveService.deleted(id);
        System.out.println("Xoá thành công");
    }
}
