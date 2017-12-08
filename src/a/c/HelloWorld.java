package a.c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet(urlPatterns = "/msg/HelloWorldServlet", loadOnStartup = 1)
@WebServlet("/aaa") // 發出第一次req時,執行init(),且只執行一次.
//@WebServlet(urlPatterns="/aaa",loadOnStartup=1) // 再啟動servlet時,就執行init(),且只執行一次.

public class HelloWorld extends HttpServlet {
	private String message,message2;

	   public void init() throws ServletException {
		   System.out.println("servelte init...");
	      // Do required initialization
	      message = "Hello World";
	      message2 = "abcd1234";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<div style=text-align:center>"
	      		+ "<h1 style=font-size:50px >" + message + "</h1></div>");
	      out.println("<h1 style='color:red'>" + message2 + "</h1>");
	      	   
	   }

	   public void destroy() {
	      // do nothing.
	   }
	   
}
