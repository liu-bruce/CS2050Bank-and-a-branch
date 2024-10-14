

public class account_main
{
public static void main (String args[])
{
  java_shorts js = new java_shorts();
  js.hello_world();
  account_core ac = new account_core("bank",123,456,500.23,5.55,1,"April",22,1777);
  js.command_line_output(ac.toString());
  
}

}
