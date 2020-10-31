package com.test.servlet;

import com.test.searchengine.LuceneMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
/**
 * @author preetham
 *
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        System.out.println("FirstServlet Constructor called!");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet \"Init\" method called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("FirstServlet \"Destroy\" method called");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstServlet \"Service\" method(inherited) called");
		System.out.println("FirstServlet \"DoGet\" method called");
		
		//storeInSessionAndRespond(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstServlet \"Service\" method(inherited) called");
        System.out.println("FirstServlet \"DoPost\" method called");
        
        //storeInSessionAndRespond(request, response);

		List<String> str = LuceneMain.startSearchEngine(request.getParameter("query"));

		writeResponse(request,response, str);

	}
	


	public void writeResponse(HttpServletRequest request,
							  HttpServletResponse response, List<String> list ) throws IOException {

		PrintWriter out = response.getWriter();

		out.write("<html><body><h4>THE Query results</h4></body></html>");

		list.forEach(string ->{
			out.write("<html><body>"+string+"<br/></body></html>");
		});

		if (list.isEmpty()) {
			out.write("<html><body>No Results</body></html>");

		}

	}

}
