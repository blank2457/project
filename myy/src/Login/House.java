package Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabaseConnection.CredentialsDAO;
import Information.HouseInformation;

/**
 * Servlet implementation class House
 */
@WebServlet("/House")
public class House extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");	
		String phone_no=request.getParameter("phone_no");	
		String Hname=request.getParameter("Hname");	
		String address=request.getParameter("address");
	String cost1=request.getParameter("cost");
	int cost=Integer.parseInt(cost1);

	
		String broker = null;
		if(request.getParameter("broker") != null)
		{
			broker=request.getParameter("broker");
		}
		String s=null,a = null,f = null,b = null ;
		if(request.getParameter("s")!=null)
		{
			s=request.getParameter("s");
		}
		
		if(request.getParameter("a")!=null)
		{
			a=request.getParameter("a");
		}
		
		if(request.getParameter("f")!=null)
		{
			f=request.getParameter("f");
		}
		
		if(request.getParameter("b")!=null)
		{
			b=request.getParameter("b");
		}
		
		CredentialsDAO c=new CredentialsDAO();
		boolean rentOrSell = false,isBroker = false,appartmentOrHouse = false,familyOrBachelors = false;
		if(s.equals("sell"))
		{
			rentOrSell=true;
		}
		if(a.equals("appartment"))
		{
			appartmentOrHouse=true;
		}
		if(broker.equals("broker"))
		{
			isBroker=true;
		}
		if(f.equals("f"))
		{
			familyOrBachelors=true;
		}
		HouseInformation h= new HouseInformation(Hname, address, rentOrSell, isBroker, appartmentOrHouse,b , cost, familyOrBachelors);
		boolean k=c.insertHouseDetails(h, uname, phone_no);
		request.setAttribute("uname",uname);
		request.getRequestDispatcher("print.jsp").forward(request, response); 
	}

	

}
