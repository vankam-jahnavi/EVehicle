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
@WebServlet("/search_charge_station")

public class ChargeBook extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String myloc=  req.getParameter("location"); // value must be same as in register.jsp file
					
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("select * from scharges where location= ?");
            
            ps.setString(1, myloc);
                       
            ResultSet rs= ps.executeQuery();
            if(rs.next())
            {
            	resp.setContentType("text/html");
            	out.print("<h3 style = 'color:green'><ceter> Location Found Successfully</Center></h3><br><br>");
   
            	out.print("<br><h5 style ='color:black'><ceter> Station Id:</Center></h5>");
            	out.print(rs.getString("stid"));
            	
            	out.print("<br><br><h5 style ='color:black'><ceter> Station Name :</Center></h5>");
            	out.print(rs.getString("stname"));
            	
            	
            	out.print("<br><br><h5 style ='color:black'><ceter> Address :</Center></h5>");
            	out.print(rs.getString("address"));
            	out.print("<br><br><h5 style ='color:black'><ceter> Location:</Center></h5>");
            	out.print(rs.getString("location"));
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
