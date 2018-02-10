import java.util.*;
import java.lang.Math.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class calc
{
    public static void main(String args[])
    {
            /* String and Int */
        String user;
        String menu;
        String function;
        Scanner keyboard = new Scanner(System.in);
            
            /*MENU START*/
        System.out.println("Welcome to use my programe, may I ask your name?");
        System.out.print("NAME: ");
        user = keyboard.nextLine();
        System.out.print("Thank you! ");
            /* TIMING START */
        String time;
        int timenum;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        time = sdf.format(cal.getTime());
        timenum = Integer.parseInt(time);
        if (timenum < 12)
        {
            System.out.println("Good morning "+user+"!");
        }
        else if ((timenum >=12) && (timenum < 18))
        {
            System.out.println("Good afternoon "+user+"!");
        }
        else
        {
            System.out.println("Good evening "+user+"!");
        }
             /* TIMING END */

             /*Main Part*/
        System.out.println("Please type your equation");
        double equation = keyboard.nextDouble();
        System.out.println("the answer is:"+equation+"");

    }
}