// child 3

public class savings_account extends home_information
{
  private int withdraw_limits = 0;
  private int current_month_withdraws = 0;



  public savings_account()
  {
  }
  ///////////////////////////////////////
  public void set_current_month_withdraws(int current_month_withdraws_input)
  {
    current_month_withdraws = current_month_withdraws_input;
  }
  public int get_current_month_withdraws()
  {
    return current_month_withdraws;
  }

///////////////////////////////////////////
public void set_withdraw_limit(int set_withdraw_count)
{
  withdraw_limits = set_withdraw_count;
}
public int get_withdraw_limit()
{
  return withdraw_limits;
}
///////////////////////////////////////////
public String toString()
{
  String string_output = super.tostring();


  return string_output;
}



}
