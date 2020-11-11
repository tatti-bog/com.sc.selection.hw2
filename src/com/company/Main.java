package com.company;
import static ibio.Helpers.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] students = { "Donald", "Evgeney", "Charlie", "Khalid"};
        String [] grades = { "B", "B", "A", "C"};
        String search = input("who's grade do you want to know? Enter the name: ");
     
        for (int i=0; i < students.length; i++)
        {
            if (students[i].equals(search))
            {
              
               System.out.println(grades[i]);
            }
        }


    }

}
