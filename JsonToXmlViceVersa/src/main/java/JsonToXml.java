import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
import org.json.XML;


public class JsonToXml {
	
	static String line2="",str2="";

	public static void main(String[] args) {
		
		 String link2 = "src/test/resources/JsonFile.json";
		 
		 BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(link2));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        try {
				while ((line2 = br.readLine()) != null) 
				{   
				    str2+=line2;  
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
		 
		 JSONObject json = new JSONObject(str2); 
		 System.out.println(XML.toString(json));
		
		
	}

}