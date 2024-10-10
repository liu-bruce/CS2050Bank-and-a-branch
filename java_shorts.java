/*

https://www.geeksforgeeks.org/generating-random-numbers-in-java/
https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
*/


import java.io.PrintWriter;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class java_shorts
{

public static void command_line_output(String string_input)
{
  System.out.print(string_input);

}
public static int random_number_generator_int(int random_low, int random_high)
{

}
public static int random_number_generator_int_positive(int random_cap)
{
  Random random_obj = new Random();

  return random_obj.nextInt(random_cap);
}
public static void hello_world()
{
  command_line_output("hello_world \n\n");
}

//file input prep
public static void file_data_output(String file_output_name)
{
  String output_file_name = file_output_name;

}

public static void file_data_read(String file_to_be_read)
{

}
public static void print_to_file_action_history()
{

}
public static void file_read_action_history()
{

}
public static void generate_file_account_numbers()
{

}
public static void generate_pesonal_infomation_file()
{
  
}

}
