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
		
		out.println("<h1>�û���¼</h1>");
		out.print("<form action='/TestServlet/FormClServlet' method='post'>");
		out.print("�û�����<input type='text' name='username'/><br/>");
		out.print("�ܡ��룺<input type='password' name='password'/><br/>");
		out.print("<input type='submit' value='�ύ'/></br></br>");
		
		out.print("�ԡ���<input type='radio' name='sex' value='��' checked/>�С�<input type='radio' name='sex' value='Ů'/>Ů</br></br>");

		out.print("���ã�</br><input type='checkbox' name='inst' value='��ɽ' checked/>��ɽ</br>");
		out.print("<input type='checkbox' name='inst' value='����'/>����</br>");
		out.print("<input type='checkbox' name='inst' value='��Ӱ'/>��Ӱ</br></br>");

		out.print("ְҵ��<select name='zhiye'><option value='����Ա'>����Ա</option> <option value='����Ա' selected>����Ա</option> <option value='���Ա'>���Ա</option></select></br></br>");
		
		out.print("˵����</br><textarea name='text' cols='35' rows='5'>���˵��...</textarea></br></br>");
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
