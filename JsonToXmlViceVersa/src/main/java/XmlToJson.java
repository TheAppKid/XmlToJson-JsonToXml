import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException;
import org.json.JSONObject;
import org.json.XML;


public class XmlToJson {
	
	static String line="",str="";

	public static void main(String[] args)  {
		
		 String link = "src/test/resources/ab.xml";
 
	        BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(link));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        try {
				while ((line = br.readLine()) != null) 
				{   
				    str+=line;  
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	        JSONObject jsondata = XML.toJSONObject(str);
	        System.out.println(jsondata);
	    }
			
    }  
		    