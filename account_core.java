
// parent

public class account_core
{
  // bank infomation
  private String  bank_name = "";
  private int     bank_account_number = 0 ;
  private int     account_number = 0;
  private double  account_balance = 0;
  private double  interest_rate = 0;
  private int     interest_payment_frequency_in_months = 0;
  private String  account_creation_month = "";
  private int     account_creation_day = 0;
  private int     account_creation_year = 0;
////calculated values
  private double  interest_payment_ammount = 0;


public account_core(string bank_name_init ,int bank_account_number_init , int account_number_init ,double account_balance_init, double interest_rate_init,String account_creation_month_init, int account_creation_day_init, int account_creation_year_init)
{
  set_bank_name(bank_name_init);
  set_bank_account_number(bank_account_number_init);
  set_account_number(account_number_init);
  set_account_balance(account_balance_init);
  set_interest_rate(interest_rate_init);
  calculate_interest_payment();
  set_account_creation_month(account_creation_month_init);
  set_account_creation_day(account_creation_day_init);
  set_account_creation_year(account_creation_year_init);
}
//////////////////////////////////////////////////////
public void set_bank_name(String bank_name_input)
{
  bank_name = bank_name_input;

}
public String get_bank_name()
{
  return bank_name;
}
/////////////////////////////////////////////////////
public void set_bank_account_number(int bank_account_number_input)
{
  bank_account_number = bank_account_number_input;
}
public int get_bank_account_number()
{
  return bank_account_number;
}

///////////////////////////////////////////////////////
  public void set_account_number(int account_number_input)
  {
    account_number = account_number_input ;
  }
  public int get_account_number()
  {
    return account_number ;
  }

  ///////////////////////////////////////////////////////////////////
  public void set_account_balance( double balance_change)
  {
    account_balance = account_balance + balance_change;
  }
  public double get_account_balance()
  {
    return account_balance ;
  }
  /////////////////////////////////////////////////////////////////
  public void set_interest_rate(double interest_rate_to_set)
  {
    interest_rate = interest_rate_to_set;
  }
  public double get_interest_rate()
  {
    return interest_rate ;
  }
  //////////////////////////////////////////////
  public void set_interest_payment_frequency(int frequency_of_payment_in_months)
  {
    interest_payment_frequency_in_months = frequency_of_payment_in_months;
  }
  public void get_interest_payment_frequency()
  {
    return interest_payment_frequency_in_months;
  }


  /////////////////////////////////////////////////////////////////////
  public void set_account_creation_month(String month_of_account_creation)
  {
    account_creation_month = month_of_account_creation;
  }
  public String get_account_creation_month()
  {
    return account_creation_month
  }
/////////////////////////////////////////////////////////
  public void set_account_creation_day(int day_of_account_creation  )
  {
  account_creation_day = day_of_account_creation;
  }
  public int get_account_creation_day()
  {
    return account_creation_day;
  }
  ////////////////////////////////////////////////////
  public void set_account_creation_year(int year_of_account_creation)
  {
    account_creation_year = year_of_account_creation;
  }
  public int get_account_creation_year()
  {
    return account_creation_year;
  }
  ////////////////////////////////calculations
  public void calculate_interest_payment()
  {
    interest_payment_ammount = account_balance * interest_rate/100;
  }

  public String tostring()
  {
    String output_string = "";

    output_string = concat(output_string, "Bank name:", bank_name,"\n" );
    output_string = concat(output_string, "Bank account number:", bank_account_number,"\n");
    output_string = concat(output_string, "Account number:",account_number,"\n")
    output_string = concat(output_string, "Account balance:",account_balance,"\n");
    output_string = concat(output_string, "Intrest rate:", interest_rate, "%\n");
    output_string = concat(output_string, "Interest payment frequency in months:", interest_payment_frequency_in_months,"\n" );
    output_string = concat(output_string, "Interest payment ammount:", interest_payment_ammount,"\n");
    output_string = concat(output_string, "Date of account creation",account_creation_month, " ", account_creation_day, ",",account_creation_year "\n\n\n");
    return output_string;
  }



}
