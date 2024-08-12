package thi.model;

import java.time.LocalDate;

public abstract class AccountBank {
    private int id;
    private String codeBank;
    private String nameOwner;
    private LocalDate date;

    public AccountBank(int id, String codeBank, String nameOwner, LocalDate date) {
        this.id = id;
        this.codeBank = codeBank;
        this.nameOwner = nameOwner;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeBank() {
        return codeBank;
    }

    public void setCodeBank(String codeBank) {
        this.codeBank = codeBank;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AccountBank{" +
                "id=" + id +
                ", codeBank='" + codeBank + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", date=" + date +
                '}';
    }
}
