package TEST.Maven_Jsonfile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Iterator;

import org.ini4j.Ini;
import org.ini4j.InvalidFileFormatException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Hello world!
 *
 */
public class App {
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		Ini ini;
		try {
			// ini = new Ini(new
			// File("D:\\Backup_fang\\Work\\JAVA_Example_170219\\Maven_Jsonfile\\src\\main\\resource\\config.ini"));
			ini = new Ini(new File("config.ini"));
			// get pathJson from config.ini
			String pathJson = ini.get("owner", "json.path", String.class);
			System.out.println("pathJson : " + pathJson);

			Object obj;
			try {
				obj = parser.parse(new FileReader(pathJson));
				JSONObject jsonObject = (JSONObject) obj;

				String firstName = (String) jsonObject.get("firstName");
				String lastName = (String) jsonObject.get("lastName");
				// String website = (String) jsonObject.get("website");
				JSONArray companyList = (JSONArray) jsonObject.get("Company List");

				System.out.println("firstName: " + firstName);
				System.out.println("lastName: " + lastName);
				// System.out.println("website: " + website);
				System.out.println("\nCompany List:");
//				Iterator<String> iterator = companyList.iterator();
//				while (iterator.hasNext()) {
//					System.out.println(iterator.next());
//				}
				for(Object companyObject : companyList) {
					System.out.println(companyObject);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (InvalidFileFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
