package account_methods;


abstract public static class account_core
{
  private int bank_account_number = 0 ;
  private double account_balance = 0;
  private double interest_rate = 0;
}
public static class checking_account extends account_core
{
  public static void set_account_number()
  {

  }
  public static void set account_balance()
  {

  }
  public static void set_interest_rate()
  {

  }
  public static int get_account_number()
  {

  }
  public static double get_account_balance()
  {

  }
  public static double get_interest_rate()
  {

  }

}
public static class savings_account extends account_core
{

}
public static class cd_account_core extends saving_account
{
  // overwite interest_rate
}
public static class account_information_write
{


}

public static class account_information_read
{

}
