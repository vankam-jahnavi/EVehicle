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
@WebServlet("/userRegForm")

public class UserRegister extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		PrintWriter out = resp.getWriter();
		
		String uid  =  req.getParameter("uid");
		String uname=  req.getParameter("uname"); // value must be same as in register.jsp file
		String uphone=req.getParameter("uphone");
		String uemail= req.getParameter("uemail");
		String upassword=  req.getParameter("upassword");
				
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle","root","Jahnavi@16");	
            PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?)");

            ps.setString(1, uid);
            ps.setString(2, uname);
            ps.setString(3, uphone);
            ps.setString(4, uemail);
            ps.setString(5, upassword);
            int count=ps.executeUpdate();
            PreparedStatement ps1=con.prepareStatement("insert into login values(?,?)");
            
            ps1.setString(1, uid);
            ps1.setString(2, upassword);

            
            int count1= ps1.executeUpdate();

           if(count>0 && count1>0)

            {
            	resp.setContentType("text/html");
            	
            	out.print("<h3 style = 'color:green'> User Register Successfully</h3>");
            	RequestDispatcher rd = req.getRequestDispatcher("/Login.jsp");
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
       	RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
       	rd.include(req, resp); 
		}
		
	}

		
	
}
