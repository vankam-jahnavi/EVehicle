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
@WebServlet("/payment")

public class Payment extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String customerid =  req.getParameter("customerid");
		String cardnumber=  req.getParameter("cardnumber"); // value must be same as in register.jsp file
		String cvv=req.getParameter("cvv");
		String paymentdate= req.getParameter("paymentdate");
		String amount=  req.getParameter("amount");
		String cardholdername=  req.getParameter("cardholdername");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("insert into payment values(?,?,?,?,?,?)");

            ps.setString(1, customerid);
            ps.setString(2, cardnumber);
            ps.setString(3, cvv);
            ps.setString(4, paymentdate);
            ps.setString(5, amount);
            ps.setString(6, cardholdername);

            
            int count=ps.executeUpdate();

           if(count>0)

            {
            	resp.setContentType("text/html");
            	
            	out.print("<h3 style = 'color:green'>EV Slot and Payment successfully completed</h3>");
            	RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
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
       	RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
       	rd.include(req, resp); 
		}
		
	}

		
	
}
