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
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Displaying_Charge_station")

public class DisplayCharge extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String location=  req.getParameter("location");
				
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            
            PreparedStatement ps1 = con.prepareStatement("select * from scharges location=?");
            
            /*ps1.setString(1, uid);
            ps1.setString(2, upassword);*/
            
            ResultSet rs=ps1.executeQuery();
            if(rs.next()) 
            {
            	HttpSession session=req.getSession();
            	session.setAttribute("session_name",rs.getString("location"));           	
            	RequestDispatcher rd= req.getRequestDispatcher("/Profile.jsp");
            	rd.include(req, resp);            	
            }
            else
            {
            	RequestDispatcher rd=req.getRequestDispatcher("/LoginFail.jsp");
            	rd.include(req, resp);
            	
            }
		}
            
        catch(Exception e)
		{
        	/*e.printStackTrace();	
		   resp.setContentType("text/html");
       	out.print("<h3 style = 'color: red' User not Register due to some error");*/
       	RequestDispatcher rd = req.getRequestDispatcher("/EVBookingDetails.jsp");
       	rd.include(req, resp);
		   
		}
		
	}
	
	}

		
	

