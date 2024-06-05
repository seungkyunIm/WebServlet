import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Util {
	//static을 붙여서 메모리에 할당시켜 놓으면 new로 받지 않고 class 이름.메소드 이름으로 사용 가능하다.
	public static void ko(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");                                
		response.setCharacterEncoding("UTf-8");
		response.setContentType("text/html; charset=UTF-8");
	}
	
	
}
