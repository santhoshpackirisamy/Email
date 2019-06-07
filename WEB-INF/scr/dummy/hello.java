import java.io.*; 
import java.sql.*;
import java.util.*; 
import org.json.*;

class hello
{ 
	public static void main(String args[]) throws Exception
	{ 	
		JSONArray arr = new JSONArray();
		arr = ResultSetConverter.convert();
		
		for(int i = 0; i < arr.length(); i++)
		{
			JSONObject jsonobject = arr.getJSONObject(i);
			String receivedby = jsonobject.getString("receivedby");
			String message = jsonobject.getString("message");
			System.out.println(receivedby+"\t"+message);
		}
	}
}
	