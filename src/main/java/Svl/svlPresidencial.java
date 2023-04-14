package Svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class svlPresidencial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public svlPresidencial() {
        super();

    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
    	HttpSession session = request.getSession();
    	Dao.OnpeDao daoonpe= new Dao.OnpeDao();
    	
    	String id =request.getParameter("id");

    	
    	session.setAttribute("id", id);
    	
		response.sendRedirect("presidenciales.jsp");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
