//child 2
public class home_information extends personal_infomation
{

    private int  building_number = 0;
    private String street_name = "null";
    private String city = "null" ;
    private String state = "null";
    private String zip_code = "null";
    private String contry = "null";
public home_information(int building_number_init,String street_name_init, String city_init, String state_init, String zip_code_init,String contry_init)
{
  super();
  set_numerical_address_street(building_number_init);
  set_street_name(street_name_init);
  set_city(city_init);
  set_state(state_init);
  set_zip_code(zip_code_init);
  set_contry(contry_init);
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
public int get_street_name()
{
  return street_name;
}
/////////////////////////////////////////
public void set_city(String town)
{
  city = town;
}
public string get_city()
{
  return town;
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
public void get_contry(String contry_orgin)
{
  contry = contry_orgin;
}
public String get_contry()
{
  return = contry;
}
/////////////////////////////////////
@Overwrite

public String toString()
{
  String home_information_output = "";
  super.toString();
  concat(home_information_output,get_numerical_address_street()," ", get_street_name(), ",\n");
  concat(home_information_output, get_city(),", ",get_state(), " ", get_zip_code(),", ",get_contry()"\n");
  return home_information_output;
}





}
