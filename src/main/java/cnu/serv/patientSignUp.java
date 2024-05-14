package cnu.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cnu.dao.MainDAO;
import cnu.db.DBConnection;
import cnu.dto.Patientdto;
import cnu.dto.Userdto;

/**
 * Servlet implementation class patientSignUp
 */
public class patientSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientSignUp() {
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
		

        // Fetching data from the form
        int utype =1;
        MainDAO dao = new MainDAO();
        Userdto udto = new Userdto();
        Patientdto pdto = new Patientdto();
        udto.setUname(request.getParameter("pname"));
        udto.setUid(request.getParameter("puserid"));
        udto.setUmob(request.getParameter("pmob"));
        udto.setUadd(request.getParameter("padd"));
        pdto.setP_age(Integer.parseInt(request.getParameter("page")));
        pdto.setP_gender(request.getParameter("pgender"));
        udto.setUpass(request.getParameter("ppass"));
        String upass=request.getParameter("ppass");
        String ucpass = request.getParameter("pcpass");
        
        // Checking if passwords match
        if (!upass.equals(ucpass)) {
        	response.sendRedirect("signup.jsp");
        } else {
        	boolean b = dao.insertPatient(udto,pdto);
        	if(b) {
        		response.sendRedirect("login.jsp");
        	}else {
        		response.sendRedirect("signup.jsp");
        	}
        }

	}
}
