package com.mycompany.lab1;

public class BankAccount {
    int accountNumber;
    double balance;

    
    public BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
    public static void main(String[] args) {
        BankAccount a=new BankAccount(231014029,10000);
        BankAccount b=new BankAccount(231014030,30000);
        
        a.deposit(5000);
        a.withdraw(3000);
        
        b.deposit(13000);
        b.withdraw(7500);
        
        
    }
    
    public void deposit(double money){
       if(money>0){
       balance=balance+money;
          System.out.println("Added Money Succesfully");
          System.out.println("Account Balance :"+balance);   
       }else{
        System.out.println("Invalid Amount");   
       }     
    }
    public void withdraw(double money){
        if(money>0&&money<balance){
       balance=balance-money;
          System.out.println("Withdraw Money Succesfully");
          System.out.println("Account Balance :"+balance);
       }else{
        System.out.println("Invalid Amount");   
       
       } 
    
    }
    
}
