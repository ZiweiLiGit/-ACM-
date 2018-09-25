package acm.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import acm.beans.BDDao;
import acm.beans.Student;

/**
 * Servlet implementation class Ok
 */
public class Ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ok() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
	     Student student = (Student) session.getAttribute("student");
	     
	    // System.out.println(student.toString());
	     String name =null;
	     String sno =null;
	     String tel =null;
	     String sex=null;
	     String gra=null;
	     String dep=null;
	     String major=null;
	     String cno=null;
	     String account = null;
	     try {
	    	 name = (String) session.getAttribute("name");
	    	 sno = (String) session.getAttribute("sno");
	    	 tel = (String) session.getAttribute("tel");
	    	 sex = (String) session.getAttribute("sex");
	    	 gra = (String) session.getAttribute("gra");
	    	 dep = (String) session.getAttribute("dep");
	    	 major = (String) session.getAttribute("major");
	    	 cno = (String) session.getAttribute("cno");
	    	 account = (String) session.getAttribute("account");
	    	 
	    	
	     }catch (Exception e) {
			// TODO: handle exception
           e.getStackTrace();
	     
	     }
	     
	     boolean flag = false;
	     
	     //连接数据库
	     try {
			BDDao db = new BDDao("com.mysql.jdbc.Driver","jdbc:mysql://localhost:3366/acm?serverTimezone=GMT%2B8"
							,"root","1234");
			db.getConnection();
			String sqlQuery = "select * from  acm_member where sno ='"+sno+"';";
			
	    	//System.out.println(sqlQuery);
			ResultSet rSet = db.query(sqlQuery);
			int n = 0;
			while(rSet.next()) {
				n++;
			}
			//System.out.println("n = "+n);
	    	if(n == 0) {
	    		String sqlInsert = "insert into acm_member (name,sno,tel,sex,gra,dep,major,cno,account) values ('"+name+"','"+sno+"','"+
	    							tel+"','"+sex+"','"+gra+"','"+dep+"','"+major+"','"+cno+"','"+account+"');";
	    		//System.out.println(sqlInsert);
	    		flag = db.insert(sqlInsert);
	    	}
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	     //插入成功
	     if(flag == true) {
	    	 response.sendRedirect("success.jsp");
	     }else {
			response.sendRedirect("fail.jsp");
		}
	
	
	}
}
