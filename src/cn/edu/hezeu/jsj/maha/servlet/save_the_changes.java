package cn.edu.hezeu.jsj.maha.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class save_the_changes extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public save_the_changes() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

response.setContentType("text/html;charset=utf-8");
		
		//½âÎöjson
		HttpSession session=request.getSession();
		PrintWriter out = response.getWriter();
		String encode = "utf-8";
		BufferedReader in = new BufferedReader(new InputStreamReader(
				request.getInputStream(), encode));
		String result = "";
		String line;
		while ((line = in.readLine()) != null) {
			result = result + line;
		}
		in.close();
		System.out.println(result);
		
		File fp=new File("d:\\a.txt");
        
       PrintWriter pfp= new PrintWriter(fp);
       pfp.print(result);
       pfp.close();
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
