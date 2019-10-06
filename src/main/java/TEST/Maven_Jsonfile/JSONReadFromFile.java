package TEST.Maven_Jsonfile;


import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
* @author Crunchify.com
*/

public class JSONReadFromFile {

   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
	 //JSON parser object to parse read file
       JSONParser parser = new JSONParser();

       try {
    	   String pathJson ="D:\\Backup_fang\\Work\\JAVA_Example_170219\\Maven_Jsonfile\\src\\main\\resource\\employee.json";
           Object obj = parser.parse(new FileReader(pathJson));
           
           //Read JSON file
           JSONObject employee = (JSONObject) obj;
           JSONObject employeeObject = (JSONObject) employee.get("employee");
           
           //Get employee first name
           String firstName = (String) employeeObject.get("firstName");   
           System.out.println(firstName);
          
          /* String firstName = (String) jsonObject.get("firstName");
           String lastName = (String) jsonObject.get("lastName");
           String website = (String) jsonObject.get("website");
           JSONArray companyList = (JSONArray) jsonObject.get("Company List");

           System.out.println("firstName: " + firstName);
           System.out.println("lastName: " + lastName);
           System.out.println("website: " + website);
           System.out.println("\nCompany List:");
           Iterator<String> iterator = companyList.iterator();
           while (iterator.hasNext()) {
               System.out.println(iterator.next());
           }
*/
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
  
}
