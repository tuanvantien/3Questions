/**
 *
 * @author Tuan van tien
 */
//Import Packages
import java.io.*;
import java.util.*;


	
public class StudentMain {
	
	private static String fileLocation = "src/Resources/StudentList.txt";	//Location of IpAddress
	
	/**
	 * Runs the Program
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		List<Students> list = new ArrayList<Students>();	//Initialize List Array
		
		getIpFile(fileLocation,list);	//invoke method
		
        Collections.sort(list, new CompareStudents());	//Sorts list using comparator class.
        
        //Loops every element in List until the end.
		for (Students student : list) {
		    System.out.println(student.getName());
		}
	}

/**
 * 
 * @param fileName
 * @param list Passes list arugement
 * @throws IOException
 */
public static void getIpFile(String fileName, List<Students> list ) throws IOException  {
 
	//List<Students> list = new ArrayList<Students>();
	
    	BufferedReader bReader;
    	FileReader fileReader;
    	String endLine = null;	//Creates null temporary String
    	
    	//List<Students> list = new ArrayList<Students>();
		try {
			fileReader = new FileReader(fileName);
			bReader = new BufferedReader(new FileReader(fileName));
			
			//Loop Reads file until line is null.
			while ((endLine = bReader.readLine()) != null) {
				
				//Splits the text file with a delimiter of ","
				//stores each text into the appropriate variable
				//Lastly adds into the List.
				String[] temp = endLine.split(",");
				Integer id = Integer.parseInt(temp[0]);
				String name = temp[1];
				float gpa = Float.parseFloat(temp[2]);

				list.add(new Students(id, name, gpa));
			}
			
			bReader.close();	//Closes buffer reader
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block	
			System.out.println("Could not find File");	//Throws error when file not found
			e.printStackTrace();
		}
    }
}
