/**
 *
 * @author Tuan van tien
 */

import java.io.*;

/**
 * Student class
 * @author Tuan Van Tien
 *Student Class which holds all data elements in the list.
 */

public class Students {

	//variables
	private Integer Id;
	private String StudentName;
	private float GPA;
	
	//Constructor
	public Students(Integer id, String studentName, float gpa) {
		//initialize variables
		this.Id = id;
		this.StudentName = studentName;
		this.GPA = gpa;
	}
	
	/**
	 * getMethods - Grabs Id,name & GPA.
	 */
	
	public Integer getID(){
		return this.Id;
	}

	public String getName(){
		return this.StudentName;
	}

	public float getGPA(){
		return this.GPA;
	}
	
	/**
	 * 
	 * Set methods, sets the ID, name & GPA.
	 */
	public void setID(Integer ID){
		this.Id = ID;
	}

	public void setName(String Name){
		this.StudentName = Name;
	}

	public void setGPA(float GPA){
		this.GPA = GPA;
	}
}
