package cnu.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cnu.dao.MainDAO;
import cnu.dto.Hospitaldto;
import cnu.dto.Patientdto;
import cnu.dto.Userdto;

/**
 * Servlet implementation class HospitalSignUp
 */
public class HospitalSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//Fetching data from the form
		
		int utype = 1;
		MainDAO dao = new MainDAO();
		Userdto udto = new Userdto();
		Hospitaldto hdto = new Hospitaldto();
		 udto.setUname(request.getParameter("hname"));
	        udto.setUid(request.getParameter("huserid"));
	        udto.setUmob(request.getParameter("hmob"));
	        udto.setUadd(request.getParameter("hadd"));
	        hdto.setH_licenceno(request.getParameter("hlicenseno"));
	        String upass=request.getParameter("hpass");
	        String ucpass = request.getParameter("hcpass");
	        
	        //check if password match 
	        if (!upass.equals(ucpass)) {
	        	response.sendRedirect("hospitalsignup.jsp");
	        } else {
				boolean b = dao.insertHospital(udto, hdto);
	        	if(b) {
	        		response.sendRedirect("login.jsp");
	        	}else {
	        		response.sendRedirect("hospitalsignup.jsp");
	        	}
	        }
	        
		
		
	}

}
