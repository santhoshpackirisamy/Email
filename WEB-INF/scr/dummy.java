import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.servlet.http.*; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class dummy
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
			ResultSet rs = stmt.executeQuery("SELECT * FROM MESSAGE WHERE checkbox = 1 AND id=5;");   
			if(rs.next())
			{
				
					System.out.print(rs.getString("id"));
				//	return true;
			}
			rs.close();         
		}catch(Exception e){System.out.println(e);}
		System.out.print("hi");
	//	return false;  
	}
}