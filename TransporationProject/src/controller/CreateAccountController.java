package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import model.Authenticator;
import model.User;

import sun.text.normalizer.ICUBinary.Authenticate;


@WebServlet("/CreateAccountController")
public class CreateAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	public CreateAccountController() {
		super();
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String RUID = request.getParameter("ruid");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
 
		Authenticator authenticator = new Authenticator();
		String result = authenticator.createAccount(RUID, username, password, confirmPassword, email, address, fname, lname);
		if(result.equals("missing fields")){
			
			//need to change to popup window
			System.out.println("missing required data");
		}
		else if (result.equals("password does not match")) {
			//need to change to popup window
			System.out.println("password does not match");
		
		} 
		else if(result.equals("duplicate username")){
			//need to change
			System.out.println("duplicate username");
		}
		else{
			System.out.println("success");
		}
		
	}
}
