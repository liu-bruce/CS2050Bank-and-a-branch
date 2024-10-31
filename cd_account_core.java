//child 3
public class cd_account_core extends home_information
{
  private String maturty_date_month = "";
  private int    maturty_date_day = 0;
  private int    maturty_date_year = 0;
public cd_account_core()
{

}
////////////////////////
public void set_maturity_month( String maturty_date_month_input)
{
  maturty_date_month = maturty_date_month_input;
}

public String get_maturty_month()
{
  return maturty_date_month;
}
///////////////////////////////////
public void set_maturity_day(int maturty_date_day_input)
{
  maturty_date_day = maturty_date_day_input;
}

public int get_maturty_date_day()
{
  return maturty_date_day;
}
///////////////////////////////////////////
public void set_maturity_year(int maturty_date_year_input)
{
  maturty_date_year = maturty_date_year_input;
}
public int get_maturty_year()
{
  return maturty_date_year;
}

public String toString()
{
    String string_output = super.toString();
    string_output = string_output + "  maturty date is : " + maturty_date_month + "/" + maturty_date_day + "/" + maturty_date_year;

    return string_output;
}

}
