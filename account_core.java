



public class account_core
{
  // bank infomation
  private int bank_account_number = 0 ;
  private int account_number = 0;
  private double account_balance = 0;
  private double interest_rate = 0;
  // start personal infomation
  private int socail_security_number = 0;
  private String name_of_owner = "";
  private String address_street = "";
  private String street_name = "";
  private String city = "" ;
  private String state = "";
  private String zip_code = "";
///////////////////////////////////////////////////////setters
  public void set_account_number(int account_number_input)
  {
    account_number = account_number_input ;
  }
  public void set_account_balance( double balance_change)
  {
    account_balance = account_balance + balance_change;
  }
  public void set_interest_rate(double interest_rate_to_set)
  {
    interest_rate = interest_rate_to_set;
  }


  /////////////////////////////////////////////////////////////////////////getters
  public int get_bank_account_number()
  {
    return bank_account_number;

  }
  public int get_account_number()
  {
    return account_number ;
  }
  public double get_account_balance()
  {
    return account_balance ;
  }
  public double get_interest_rate()
  {
    return interest_rate ;
  }


}
