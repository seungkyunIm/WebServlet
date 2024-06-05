

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class ResultPage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTf-8");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println("럭키");
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		String txt = request.getParameter("txt");		
		PrintWriter pw = response.getWriter();
		
		for(int i = 0; i < cnt ; i++) {
			System.out.println(cnt + "," + txt);
			pw.append((i+1)+ " "+txt + "</br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");                                // body에 직접 받아오기 때문에 response 가 아닌 request에 먼저 한글 자료를 담는다.
//		response.setCharacterEncoding("UTf-8");
//		response.setContentType("text/html; charset=UTF-8");
//		System.out.println("락키");
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		String txt = request.getParameter("txt");		
//		PrintWriter pw = response.getWriter();
//		
//		for(int i = 0; i < cnt ; i++) {
//			System.out.println(cnt + "," + txt);
//			pw.append((i+1)+ " "+txt + "</br>");
//		}
	}
}
