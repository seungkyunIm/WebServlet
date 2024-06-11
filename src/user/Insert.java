package user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.servlet.Utils;

import db.DBconn;
import db.DBtable;
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	
//	private String page = "user/Select.jsp";
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DBtable dto = new DBtable();

//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		String pwd = request.getParameter("pwd");
//		String gender = request.getParameter("gender");
		
		dto.setName(request.getParameter("name"));
		dto.setEmail(request.getParameter("email"));
		dto.setPwd(request.getParameter("pwd"));
		dto.setGender(request.getParameter("gender"));
		
				
//		Map<String, String> userMap = new HashMap<String, String>();
//		userMap.put("name",name);  //dto.getName());                       // "" 안에는 키값  , 뒤에는 변수명
//		userMap.put("email",email); //dto.getEmail());
//		userMap.put("pwd",pwd); //dto.getPwd());
//		userMap.put("gender",gender); //dto.getGender());
		
		SqlSession sql = DBconn.getFac().openSession();
		int status = sql.insert("user.add", dto);
		System.out.println("상태값 : " + status);
		if(status == 1) {
			int no = sql.selectOne("user.getNo");
//			System.out.println("no : " + no);
			sql.commit();
			
			response.sendRedirect("Select?no=" + no);  // get 방식 호출 : 생성된 사용자 번호 전달
		} else {
			sql.rollback();
		}
		
//		System.out.println(name + " : " + email + " : " + pwd + " : " + gender);
		
//		Utils.print(request, response, page);
	}

}
