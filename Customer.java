/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmpro;

/**
 *
 * @author admin
 */
  public class Customer{
        String name;
        double balance;
        int pin;
        int account_No;
        int card_no;
        public Customer(String name,double balance,int pin,int account_No,int card_no)
        {
            this.name=name;
            this.balance=balance;
            this.pin=pin;
            this.account_No=account_No;
            this.card_no=card_no;
        }
        
        public boolean withdraw(double amount)
        {
            if(this.balance>=amount)
            {
                this.balance-=amount;
                return true;
            }
            else
            {
                return false;
            }
        }
        public void deposit(double amount)
        {
            this.balance+= amount;
   
        }
        
        public String getname()
        {
            return name;
        }
        public double getbalance()
        {
            return balance;
        }
         public int getpin()
        {
            return pin;
        }
          public int getaccount_No()
        {
            return account_No;
        }
           public int getcard_no()
        {
            return card_no;
        }
        
        
    }
        
    
