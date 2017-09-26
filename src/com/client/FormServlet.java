package com.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>用户登录</h1>");
		out.print("<form action='/TestServlet/FormClServlet' method='post'>");
		out.print("用户名：<input type='text' name='username'/><br/>");
		out.print("密　码：<input type='password' name='password'/><br/>");
		out.print("<input type='submit' value='提交'/></br></br>");
		
		out.print("性　别：<input type='radio' name='sex' value='男' checked/>男　<input type='radio' name='sex' value='女'/>女</br></br>");

		out.print("爱好：</br><input type='checkbox' name='inst' value='爬山' checked/>爬山</br>");
		out.print("<input type='checkbox' name='inst' value='音乐'/>音乐</br>");
		out.print("<input type='checkbox' name='inst' value='电影'/>电影</br></br>");

		out.print("职业：<select name='zhiye'><option value='程序员'>程序员</option> <option value='销售员' selected>销售员</option> <option value='会计员'>会计员</option></select></br></br>");
		
		out.print("说明：</br><textarea name='text' cols='35' rows='5'>情况说明...</textarea></br></br>");
		out.print("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
