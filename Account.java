package Bank_Management-System;

public class Account
{
  private int accountNumber;
  private String name;
  private String mobileNumber;
  private String adharNo;
  private String gender;
  private int age;
  private double balance;

  public void setAccountNumber(int accountNumber)
{
 this.accountNumber=accountNumber;
}
  public int getAccountNumber()
{
  return accountNumber;
}
  

  public void setName(String name)
{
 this.name=name;
}
  public String getName()
{
  return name;
}


  public void setMobileNumber(String mobileNumber)
{
 this.mobileNumber=mobileNumber;
}
  public String getMobileNumber()
{
  return mobileNumber;
}


   public void setAdharNo(String adharNo)
{
 this.adharNo=adharNo;
}
  public String getAdharNo()
{
  return adharNo;
}


 public void setGender(String gender)
{
 this.gender=gender;
}
  public String getGender()
{
  return gender;
}

  
    public void setAge(int age)
{
 this.age=age;
}
  public int getAge()
{
  return age;
}


   public void setBalance(double balance)
{
 this.balance=balance;
}
  public double getBalance()
{
  return balance;
}

}

