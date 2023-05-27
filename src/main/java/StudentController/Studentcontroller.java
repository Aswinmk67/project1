package StudentController;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import StudentDao.Studentdao;
import StudentDto.Studentdto;

@WebServlet("/insert")
public class Studentcontroller extends GenericServlet {
	 @Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String std_id = arg0.getParameter("sid");
		String std_name = arg0.getParameter("sname");
/*		
		System.out.println(std_id);
		System.out.println(std_name);
*/
		int std_idn = Integer.parseInt(std_id);
		
		Studentdto dto = new Studentdto();
		dto.setStd_id(std_idn);
		dto.setStd_name(std_name);
		
		Studentdao dao = new Studentdao();
		dao.insert(dto);
	}
}
