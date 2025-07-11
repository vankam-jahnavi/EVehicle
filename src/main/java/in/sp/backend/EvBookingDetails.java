package in.sp.backend;

import java.io.PrintWriter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/bookdetails")

public class EvBookingDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String uid =  req.getParameter("uid");
		String vno=  req.getParameter("vno"); // value must be same as in register.jsp file
		String vmodel= req.getParameter("vmodel");
		String uname=  req.getParameter("uname");
		String location=  req.getParameter("location");
		String vdate=  req.getParameter("vdate");
		String vtime=  req.getParameter("vtime");
				
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("insert into bookdetails values(?,?,?,?,?,?,?)");

            ps.setString(1, uid);
            ps.setString(2, vno);
            ps.setString(3, vmodel);
            ps.setString(4, uname);
            ps.setString(5, location);
            ps.setString(6, vdate);
            ps.setString(7, vtime);
            int count=ps.executeUpdate();

           if(count>0)

            {
            	resp.setContentType("text/html");
            	
            	out.print("<h3 style = 'color:green'> User EV BOOKING Successfully</h3>");
            	RequestDispatcher rd = req.getRequestDispatcher("/Payment.jsp");
            	rd.include(req, resp);
            	
            	
            }
            else
            {
            	resp.setContentType("text/html");
            	out.print("<h3 style = 'color: red' User not Register due to some error");
            	RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
            	rd.include(req, resp);
            	
            }
            
		}
		catch(Exception e)
		{
		   e.printStackTrace();	
		   resp.setContentType("text/html");
       	out.print("<h3 style = 'color: red' User not Register due to some error");
       	RequestDispatcher rd = req.getRequestDispatcher("/Payment.jsp");
       	rd.include(req, resp); 
		}
		
	}

		
	
}
