// child 1
public class personal_infomation extends account_core
{

  private int social_security_number = 0;
  private String name_of_owner = "null";
  private String phone_number = "null" ;
  private String birth_month = "null";
  private int birth_day = 0;
  private int birth_year = 0;
/////////////////////constructer
public personal_infomation (int social_security_number_init , String name_of_owner_init ,String phone_number_init, String birth_month_init,int birth_day_init, int birth_year_init)
{
set_social_secuity_number(social_security_number_init);
set_name_of_owner(name_of_owner);
set_phone_number(phone_number_init)
set_birth_month(birth_month_init);
set_birth_day(birth_day_init);
set_birth_year(birth_year_init)

}
//////////////setter getters
/////////////////////////////////////////////////////////////////////////
public void set_social_secuity_number(int social_security_number_input)
{
  social_security_number = social_security_number_input;
}
public int get_social_security_number()
{
  return social_security_number;
}
//////////////////////////////////////////////////////
public void set_name_of_owner(String human_name)
{
  name_of_owner = human_name;
}
public String get_name_of_owner()
{
  return name_of_owner;
}
/////////////////////////////////////////
public  void set_phone_number(String phone_digits)
{
  phone_number = phone_digits;
}
public String get_phone_number()
{
  return phone_number;
}
/////////////////////////////////////////////////
public void set_birth_month(String human_birth_month)
{
  birth_month= human_birth_month;
}
public String get_birth_month()
{
  return birth_month;
}
/////////////////////////////////////////////////////
public void set_birth_day(int human_birth_day)
{
  birth_day = human_birth_day;
}
public int get_birth_day()
{
  return birth_day;
}
///////////////////////////////////////////////////////////
public void set_birth_year(int human_birth_year)
{
  birth_year = human_birth_year;
}
public int get_birth_year()
{
  return birth_year;
}
////////////////////////////////////////////////////////////////
@Overwrite
public String toString()
{
  String personal_infomation_output = "";

  concat(personal_infomation_output, "social security number:", get_social_security_number(),"\n");
  concat(personal_infomation_output,"owner:", get_name_of_owner(),"\n" );
  concat(personal_infomation_output, "phone#:", get_phone_number(),"\n" );
  concat(personal_infomation_output,"date of birth information", get_birth_month()," ", get_birth_day(), ",",get_birth_year(), "\n\n\n");

  return personal_infomation_output;
}


//////////////////////////////
}
