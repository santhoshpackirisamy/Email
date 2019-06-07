import java.sql.*;

class check
{
	public static Statement stmt = null;
	static Connection con = null;
	public static void main(String[] args)
	{
		//," + "check INT
		try
		{
			Class.forName("org.postgresql.Driver");  
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres", "root");  
			stmt = con.createStatement();
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS LOGIN " + "(ID SERIAL PRIMARY KEY," + "username TEXT NOT NULL," + "password TEXT NOT NULL)");
			stmt.executeUpdate("CREATE TABLE IF NOT EXISTS MESSAGE " + "(ID SERIAL PRIMARY KEY," + "sendby TEXT NOT NULL," + "receivedby TEXT NOT NULL," + "message TEXT NOT NULL," + "status INT," + "checkbox INT)");
		}
		catch(Exception e){}
	}
}