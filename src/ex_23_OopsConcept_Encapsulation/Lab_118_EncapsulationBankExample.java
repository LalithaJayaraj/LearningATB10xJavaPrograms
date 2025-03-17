package ex_23_OopsConcept_Encapsulation;

import java.util.Scanner;

public class Lab_118_EncapsulationBankExample {
    public static void main(String[] args) {
        ICICIBank lali = new ICICIBank("LalithaJayaraj",100,"ICICI");
        Scanner sc = new Scanner(System.in);
        System.out.println("User name is "+lali.getName());
        System.out.println("Your current Balance is "+lali.getBalance());
        System.out.println("Are you a Cashier");
        boolean isCashier = sc.nextBoolean();
        System.out.println(lali.bankname);
        lali.setBalance(2000,isCashier);
    }
}

class ICICIBank{
    private String name;
    private long balance;
    public String bankname;

    ICICIBank(String namec, long balancec, String banknamec){
        this.name=namec;
        this.balance=balancec;
        this.bankname=banknamec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,boolean isCashier) {
        if(isCashier) {
            this.name = name;
            System.out.println("Name is updated");
            System.out.println("Updated Name is "+ this.name);
        }
        else{
            System.out.println("Not allowed to change the name");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance,boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
            System.out.println("Balance is updated");
            System.out.println("Updated Balance is "+ this.balance);
        }
        else{
            System.out.println("Not allowed to change the Balance");
        }

    }
}
