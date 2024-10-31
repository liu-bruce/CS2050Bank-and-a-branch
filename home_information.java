//child 2
// extends to checking account and saving account
public class home_information extends personal_infomation
{

    private int  building_number = 0;
    private String street_name = "null";
    private String city = "null" ;

    private String state = "null";
    private String zip_code = "null";
    private String contry = "null";
public home_information()
{
}
///bulk bulk_setters
public  bulk_setter_local_infomation()
{

}
public bulk_setter_nation_information()
{

}


//////////////////////////////////////////////////////////
public void set_numerical_address_street(int street_number)
{
  building_number = street_number;
}
public int get_numerical_address_street()
{
  return building_number;
}

/////////////////////////////////////////////////////////
public void set_street_name(String nearest_street_to_home)
{
  street_name = nearest_street_to_home;
}
public String get_street_name()
{
  return street_name;
}
/////////////////////////////////////////
public void set_city(String town)
{
  city = town;
}
public String get_city()
{
  return city;
}
////////////////////////////
public void set_state(String territory)
{
  state = territory;
}
public String get_state()
{
  return state;
}
//////////////////////////////////////////////////////
public void set_zip_code(String postal_code)
{
  zip_code = postal_code;
}
public String get_zip_code()
{
  return zip_code;
}
/////////////////////////////
public void set_contry(String contry_orgin)
{
  contry = contry_orgin;
}
public String get_contry()
{
  return contry;
}
/////////////////////////////////////

public String toString()
{
  String home_information_output = "";
  home_information_output = super.toString();
  home_information_output = home_information_output + "home information:\n";
  home_information_output = home_information_output +  get_numerical_address_street() +" " + get_street_name()+"\n";
  home_information_output = home_information_output + get_city() + ", " + get_state() + " " + get_zip_code() + ",\n" + get_contry() + "\n";

  return home_information_output;
}





}
