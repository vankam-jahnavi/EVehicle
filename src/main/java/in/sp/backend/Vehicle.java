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
@WebServlet("/vehicleDetails")

public class Vehicle extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String vno =  req.getParameter("vno");
		String vname=  req.getParameter("vname"); // value must be same as in register.jsp file
		String vtype=req.getParameter("vtype");
		String vmodel= req.getParameter("vmodel");
		String vcolor=  req.getParameter("vcolor");
				
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("insert into vehi values(?,?,?,?,?)");

            ps.setString(1, vno);
            ps.setString(2, vname);
            ps.setString(3, vtype);
            ps.setString(4, vmodel);
            ps.setString(5, vcolor);
            int count=ps.executeUpdate();

           if(count>0)

            {
            	resp.setContentType("text/html");
            	
            	out.print("<h3 style = 'color:green'> User Successfully Registered with Vehicle details</h3>");
            	RequestDispatcher rd = req.getRequestDispatcher("/DisplayCharge.jsp");
            	rd.include(req, resp);
            	
            	
            }
            else
            {
            	resp.setContentType("text/html");
            	out.print("<h3 style = 'color: red' User not Register due to some error");
            	RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
            	rd.include(req, resp);
            	
            }
            
		}
		catch(Exception e)
		{
		   e.printStackTrace();	
		   resp.setContentType("text/html");
       	out.print("<h3 style = 'color: red' User not Register due to some error");
       	RequestDispatcher rd = req.getRequestDispatcher("/DisplayCharge.jsp");
       	rd.include(req, resp); 
		}
		
	}

		
	
}
