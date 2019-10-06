package TEST.Maven_Jsonfile;

import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
/**
 * @author Crunchify.com
 */
 
public class ReadJsonExample {
 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
        	String pathJson ="D:\\Backup_fang\\Work\\JAVA_Example_170219\\Maven_Jsonfile\\src\\main\\resource\\employee.json";
            Object obj = parser.parse(new FileReader(pathJson));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("Name");
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
 
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}