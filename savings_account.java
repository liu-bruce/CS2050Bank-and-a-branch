// child 3
public class savings_account extends home_information
{
  private int withdraw_limits = 0;

  public savings_account(int withdraw_limits_init)
  {
    set_withdraw_limit(withdraw_limits_init);
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

}
}
