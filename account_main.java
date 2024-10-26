

public class account_main
{


public static void main (String args[])
{
  String  bank_name_input = "world world bank";
  int     bank_account_number_input = 123 ;
  int     account_number_input = 456;
  double  account_balance_input = 6789.56;
  double  interest_rate_input = 5.5;
  int     interest_payment_frequency_in_months_input = 1;
  String  account_creation_month_input = "may";
  int     account_creation_day_input = 6;
  int     account_creation_year_input = 1986;



  String social_security_number_input = "123-45-6789";
  String name_of_owner_input = "human name";
  String phone_number_input = "(123)456-789A" ;
  String birth_month_input = "April";
  int birth_day_input = 16;
  int birth_year_input = 1955;

  java_shorts js = new java_shorts();
  js.hello_world();

  personal_infomation personal_data = new personal_infomation();

  personal_data.set_social_secuity_number(social_security_number_input);
  js.command_line_output(personal_data.toString());

  js.command_line_output("\n\n\n");



}

}
