import java.sql.*;  
  
public class update
{
	
	public static Statement stmt = null;
	static Connection con = null;

	public static void main(String[] args)
	{
		try
		{
			Class.forName("org.postgresql.Driver");  
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");  
			stmt = con.createStatement();
			for(int i=0;i<100;i++)
			{
			stmt.executeUpdate("INSERT INTO MESSAGE (sendby,receivedby,message,deletestatus,checkbox,trashbin) "+ "VALUES('ram','ram','"+i+"',0,0,0);"); 
			}
			stmt.close();
			con.close();
		
		}
		catch(Exception e){}
	}
}

	
	
		
		