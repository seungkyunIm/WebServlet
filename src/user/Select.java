package user;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.servlet.Utils;

import db.DBconn;
import db.DBtable;

@WebServlet("/Select")
public class Select extends HttpServlet {
	
	private final String page = "user/Select.jsp";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		
		SqlSession sql = DBconn.getFac().openSession();
		HashMap<String, Object> map = sql.selectOne("user.findId", no);
//		String Name = map.get("name").toString();
		
		request.setAttribute("user", map);
		Utils.print(request, response, page);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = ""; //request.getParameter("name");
		String email = ""; //request.getParameter("email");
		String pwd = ""; //request.getParameter("pwd");
		String gender = ""; //request.getParameter("gender");
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("pwd", pwd);
		request.setAttribute("gender", gender);
		
		Utils.print(request, response, page);
	}

}
