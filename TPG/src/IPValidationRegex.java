
/**
 *
 * @author Tuan van tien
 */
//Import Packages
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;


public class IPValidationRegex {
    
    //Variables
    
    private Pattern pattern;
    private Matcher matcher;
    private static String fileLocation = "src/Resources/IpAdresses.txt";	//Location of IpAddress
    
    //Regular expression Pattern
    private static final String IPV4PATTERN = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    //Initialize Constructor
    static IPValidationRegex validationRegex = new IPValidationRegex();
    
    //Default no-arg constructor
    public IPValidationRegex() { 
        pattern = Pattern.compile(IPV4PATTERN);   //Create Pattern object
    }
    
   public static void main(String[] args) throws IOException {
        getIpFile(fileLocation);
    }
    
    /**
     * 
     * @param ipAdress
     * @return matching ipv4 address when matching with the pattern.
     */
    public void validateIpAddress(String ipAddress) {
        
        matcher = pattern.matcher(ipAddress);
        //Checks if text matches the pattern
        if (matcher.find()) {
        	System.out.println(ipAddress);
        }
    }
    
    
    /**
     * 
     * @param fileName
     * Grabs the .txt file and throws an exception catch when file can't be found.
     * @throws IOException 
     */
    public static void getIpFile(String fileName) throws IOException  {
 
    	
    	BufferedReader bReader;
    	FileReader fileReader;
    	String endLine = null;	//Creates null temporary String
    	
		try {
			fileReader = new FileReader(fileName);
			bReader = new BufferedReader(new FileReader(fileName));
			
			//Reads file until line is null.
			while ((endLine = bReader.readLine()) != null) {
				validationRegex.validateIpAddress(endLine);

			}
			bReader.close();	//Closes buffer reader
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block	
			System.out.println("Could not find File");	//Throws error when file not found
			e.printStackTrace();
		}
    } 
}
