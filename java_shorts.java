/*

https://www.geeksforgeeks.org/generating-random-numbers-in-java/
https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
*/


import java.io.PrintWriter;
import java.util.Random;

public class java_shorts
{

public static void command_line_output(String string_input)
{
  System.out.print(string_input);

}
public static int random_number_generator_int(int random_cap)
{
  Random random_obj = new Random();

  return random_obj.nextInt(random_cap);
}
public static void hello_world()
{
  command_line_output("hello_world \n\n");
}

//file input prep
public static void from_file_data_intake(String file_name)
{

}

}
