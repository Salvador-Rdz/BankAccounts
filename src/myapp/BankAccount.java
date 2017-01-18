/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author Salvador
 */
public class BankAccount {
    private long accountID;
    private int pin;
    private double funds;
    public String userID;
    
    public BankAccount (int accountID, int pin,double funds) 
    {
        this.accountID=accountID;
        this.pin=pin;
        this.funds=funds;
    }
    //accountID get and set
    public long getAccountID()
    {
        return accountID;
    }
    public boolean setAccountID(long accountID)
    {
        try
        {
            if(String.valueOf(accountID).length()!=20)
            {
                return false;
            }
            else
            {
                this.accountID=accountID;
                return true;
            }
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    // pin get and set
    public int getPin()
    {
        return pin;
    }
    public boolean setPin(int pin)
    {
        try
        {
            this.pin=pin;
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    //funds get and set
    public double getFunds()
    {
        return funds;
    }
    public boolean setFunds(double funds)
    {
        try
        {
            this.funds=funds;
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    // userID get and set
    public String getUserID()
    {
        return userID;
    }
    public boolean setUserID(String userID)
    {
        if(userID==null||userID=="")
        {
            return false;
        }
        else
        {
            this.userID=userID;
            return true;
        }
    }
    //deposit and withdraw methods
    public void deposit (double amount)
    {
        funds+=amount;
    }
    public void withdraw (double amount)
    {
        funds-=amount;
    }
}
