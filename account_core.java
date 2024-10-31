//import java.lang.String;
// parent
// extends to personal information

public class account_core
{
  // bank infomation
  private String  bank_name = "null";
  private int     bank_account_number = 0 ;
  private int     account_number = 0;

  private double  account_balance = 0;
  private double  interest_rate = 0;
  private int     interest_payment_frequency_in_months = 0;

  private String  account_creation_month = "null";
  private int     account_creation_day = 0;
  private int     account_creation_year = 0;
////calculated values
  private double  interest_payment_ammount = 0;


public account_core()
{
}
/////bulk setters/////////////////
public bulk_setter_bank_info(String bank_name_bulk, int bank_account_number_bulk,int account_number_bulk )
{
  set_bank_name(bank_name_bulk);
  set_bank_account_number(bank_account_number);
  set_account_number(account_number_bulk);
}
public bulk_setter_balance_info(double account_balance_bulk , double interest_rate_bulk, int interest_payment_frequency_in_months_bulk )
{
  set_account_balance(account_balance_bulk);
  set_interest_rate(interest_rate_bulk);
  set_interest_payment_frequency(interest_payment_frequency_in_months_bulk);
}
public bulk_setter_set_account_date(String account_creation_month_bulk , int account_creation_day_bulk, int account_creation_year_bulk)
{
  set_account_creation_month(account_creation_month_bulk);
  set_account_creation_day(account_creation_day_bulk);
  set_account_creation_year(account_creation_year_bulk);
}
//////////////////setter and getters ////////////////////////////////////
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
  public int get_interest_payment_frequency()
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
    return account_creation_month;
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
  public double get_interest_payment_ammount()
  {
    return interest_payment_ammount;
  }


  public String toString()
  {
    String output_string = "";

    output_string = output_string + "Bank name: " + get_bank_name() + "\n";
    output_string = output_string + "Bank account number: " + get_bank_account_number() + "\n";
    output_string = output_string + "Account number: " + get_account_number() + "\n";
    output_string = output_string + "Account balance: " + get_account_balance() + "\n";
    output_string = output_string + "Interest rate: " + get_interest_rate() + "\n";
    output_string = output_string + "Intrest payment: " + get_interest_payment_ammount() + "\n";
    output_string = output_string + "Intrest payment frequency in months: " + get_interest_payment_frequency()+ "\n";
    output_string = output_string + "Date of account creation: " + get_account_creation_month() + "/" + get_account_creation_day() + "/" + get_account_creation_year() + "\n";

    return output_string;
  }



}
