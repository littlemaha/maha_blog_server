package cn.edu.hezeu.jsj.maha.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.hezeu.jsj.maha.pojo.the_blog;

public class get_the_blog extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public get_the_blog() {
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		String filePath = "d:\\a.txt";
		 String encoding="GBK";
         File file=new File(filePath);
         if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
             InputStreamReader read = new InputStreamReader(
             new FileInputStream(file),encoding);//���ǵ������ʽ
             BufferedReader bufferedReader = new BufferedReader(read);
             String lineTxt = null;
             while((lineTxt = bufferedReader.readLine()) != null){
                 System.out.println(lineTxt);
                 System.out.println("1");
                 System.out.println(lineTxt);
                 System.out.println("2");
                 the_blog theblog = new the_blog(lineTxt);
                 System.out.println("3");
                 System.out.println(theblog.getBlogTxt());
                 System.out.println("4");
                 out.write(lineTxt);
             }
             
             read.close();
             
//             out.write();
         }
         
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
