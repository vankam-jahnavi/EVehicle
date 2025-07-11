package in.sp.backend;

import java.io.PrintWriter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/search")

public class Search extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String myuser=  req.getParameter("uid"); // value must be same as in register.jsp file
					
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("select * from user where uid= ?");
            
            ps.setString(1, myuser);
                       
            ResultSet rs= ps.executeQuery();
            if(rs.next())
            {
            	resp.setContentType("text/html");
            	out.print("<h3 style = 'color:green'><ceter> User Record Found Successfully</Center></h3><br><br>");
   
            	out.print("<br><h5 style ='color:black'><ceter> NAME :</Center></h5>");
            	out.print(rs.getString("uname"));
            	
            	out.print("<br><br><h5 style ='color:black'><ceter> EMAIL :</Center></h5>");
            	out.print(rs.getString("uemail"));
            	
            	
            	out.print("<br><br><h5 style ='color:black'><ceter> MOBILE :</Center></h5>");
            	out.print(rs.getString("uphone"));
            	out.print(rs.getString("<br><br>"));
            	
            	RequestDispatcher rd = req.getRequestDispatcher("/Search.jsp");
           	    rd.include(req, resp);
    		 
            }
            else
            {
            	resp.setContentType("text/html");
             	out.print("<h3 style = 'color:green'> User Record not Found, Search Another.</h3><br><br>");
            	RequestDispatcher rd = req.getRequestDispatcher("/Search.jsp");
            	rd.include(req, resp);
            	
            }
		}
		catch(Exception e)
		{
		 	RequestDispatcher rd = req.getRequestDispatcher("/searchdetails.jsp");
       	    rd.include(req, resp);
		   
		}
	}}
