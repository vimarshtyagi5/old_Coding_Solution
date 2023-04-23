import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class AA_testing {
   
    public static void main(String[] args)
    {
        try
        { //1. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.  Creating a connection
            String url="jdbc:mysql://localhost:3306/youtube";
            String username="root";
            String password="root";

            Connection con= DriverManager.getConnection(url,username,password);

            // we are checking whether our connection is created or not

            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }

            else
            {
                System.out.println("Connection created.....");
            }


        }
        catch(Exception e)
        {

            e.printStackTrace();

        }






    }



    }


        



