import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		
		ServletOutputStream sos = resp.getOutputStream();
		PrintStream ps = new PrintStream(sos, true);
		ps.print("안녕 친구야,반가워");
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		}
	}
}
