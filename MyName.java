/*Name:Daniel
Teacher:Ms. Dyke
Date:September 18 2015
Assignment:Outputs my first name and last name changed with patterns.*/
import java.awt.*;
import hsa.Console;

public class MyName
{
    Console c;           // The output console
    String lastName = "Lasquite";
    public MyName ()
    {
	c = new Console ("My Name");
    }


    public void drawTitle ()
    {
	c.println ();
	c.print (" ", 36);
	c.println ("My Name");
    }


    public void displayData ()
    {
	String firstName = "Daniel";
	c.println (firstName.toLowerCase ());
	c.println (lastName.toUpperCase ());
	c.println ();
    }


    public void displayName ()
    {
	c.println (lastName.charAt (0));
	c.println (lastName.charAt (1));
	c.println (lastName.charAt (2));
	c.println (lastName.charAt (3));
	c.println (lastName.charAt (4));
	c.println (lastName.charAt (5));
	c.println (lastName.charAt (6));
	c.println (lastName.charAt (7));

    }


    public static void main (String[] args)
    {
	MyName m;
	m = new MyName ();
	m.drawTitle ();
	m.displayData ();
	m.displayName ();
    } // main method
} // MyName class
