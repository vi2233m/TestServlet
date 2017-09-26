package com.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormClServlet
 */
@WebServlet("/FormClServlet")
public class FormClServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormClServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("username");
		String passwd = request.getParameter("password");
		String sex = request.getParameter("sex");
		Enumeration<String> inst = request.getParameterNames();
		//String instva[] = request.getParameterValues("inst");
		String zhiye = request.getParameter("zhiye");
		String text = request.getParameter("text");

		
		out.print("�û���Ϊ��"+ uname +"; ����Ϊ��"+passwd );
		out.print("</br>�Ա�"+sex);
		while (inst.hasMoreElements()){
		    String name=(String)inst.nextElement();
		    String value=request.getParameter(name);
		    out.print(name + "=" + value);
			//out.print("</br>���ã�"+inst);
		}

		out.print("</br>ְҵ��"+zhiye);
		out.print("</br>���˵����"+text);

		//System.out.print("���ʳɹ�");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
