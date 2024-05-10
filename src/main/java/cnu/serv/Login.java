package cnu.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import cnu.dao.MainDAO;
import cnu.dto.Userdto;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Userdto user = new Userdto();
		int utype = Integer.parseInt(request.getParameter("utype"));
		String uid = request.getParameter("uid");
		String upass = request.getParameter("upass");
		MainDAO dao = new MainDAO();
		HttpSession hs = null;
		boolean b = dao.checkLoginCred(utype, uid, upass);
		if(b) {
			hs = request.getSession(false);
			if(hs!=null) {
				hs.invalidate();
				hs = null;
			}
			hs=request.getSession(true);
			hs.setAttribute("uid", uid);
			if(utype == 1)
				response.sendRedirect("./index.jsp");
			else if(utype == 2)
				response.sendRedirect("./doctor/doctorindex.jsp");
			else if(utype == 2)
				response.sendRedirect("./admin/adminindex.jsp");
			else if(utype == 2)
				response.sendRedirect("./hospital/hospitalindex.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
