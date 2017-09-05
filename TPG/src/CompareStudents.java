/**
 *
 * @author Tuan van tien
 * Comparator Class which does the algorithm of comparing each student by their GPA.
 */

//Import packages
import java.io.*;
import java.util.*;


public class CompareStudents implements Comparator<Students>{

	@Override 	//Override super class method
	
	/**
	 * Compare method which compares each student.
	 */
public int compare(Students s1, Students s2) {
		//Checks if student 1 is less than student 2 GPA. 
        if (s1.getGPA() < s2.getGPA()){
            return 1;
        }
        //Checks if student 1 gpa is greater than student 2 GPA.
        else if(s1.getGPA() > s2.getGPA()){
            return -1;
        }
        
        //If student name is the same, comapare the Id's 
        else if(s1.getName() == s2.getName()){
            return  s1.getID().compareTo(s2.getID());  
        }
   
        return s1.getName().compareTo(s2.getName());	//Returns
    }

}
