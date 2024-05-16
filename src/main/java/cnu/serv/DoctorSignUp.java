package cnu.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import cnu.dao.MainDAO;
import cnu.dto.Doctordto;
import cnu.dto.Userdto;

/**
 * Servlet implementation class DoctorSignUp
 */
public class DoctorSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Userdto udto = new Userdto();
		Doctordto ddto = new Doctordto(); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Fetching data from the form
        String dname = request.getParameter("dname");
        String duserid = request.getParameter("duserid");
        String dmob = request.getParameter("dmob");
        int dage = Integer.parseInt(request.getParameter("dage"));
        String dgender = request.getParameter("dgender");
        String D_specification = request.getParameter("dspec");
        String dpass = request.getParameter("dpass");
        String dcpass = request.getParameter("dcpass");
        

         // Print statement to verify fetched data
         System.out.println("dname: " + dname);
         System.out.println("duserid: " + duserid);
         System.out.println("dmob: " + dmob);
         System.out.println("dage: " + dage);
         System.out.println("dgender: " + dgender);
		System.out.println("dspec : " + D_specification); 
         System.out.println("dpass: " + dpass);
         System.out.println("dcpass: " + dcpass);
         
        int utype = 1;
		MainDAO dao = new MainDAO();
		Userdto udto = new Userdto();
		Doctordto ddto = new Doctordto();
		 udto.setUname(request.getParameter("dname"));
	        udto.setUid(request.getParameter("duserid"));
	        udto.setUmob(request.getParameter("dmob"));
	        ddto.setD_age(Integer.parseInt(request.getParameter("dage")));
	        ddto.setD_gender(request.getParameter("dgender"));
	        ddto.setD_specification(request.getParameter("dspec"));
	        String upass=request.getParameter("dpass");
	        String ucpass = request.getParameter("dcpass");
	        
	        //check if password match 
	        if (!upass.equals(ucpass)) {
	        	response.sendRedirect("doctorsignup.jsp");
	        } else {
	        	boolean b = dao.insertDoctor(udto,ddto);
	        	if(b) {
	        		response.sendRedirect("login.jsp");
	        	}else {
	        		response.sendRedirect("doctorsignup.jsp");
	        	}
	        }
	        
	}

}
