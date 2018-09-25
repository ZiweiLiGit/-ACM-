<%@page import="acm.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="acm.beans.Student"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>南理ACM成员信息注册</title>
<style type="text/css">
 body {background: url("imag/witestone.jpg");}
 .whole{margin-left: auto;margin-right: auto;width: 70%;}
h1 {text-align: center;}
</style>
<script type="text/javascript">
	function ok() {
		window.location.href="ok";
	}
	function back(){
		window.history.back(-1);
	}

</script>
</head>
<body>
<div class="whole">
	<div class="top">
		<h1>请仔细确认信息是否正确</h1>
		<hr>
	
	</div>
	<div class="middl">
	   <%
	   request.setCharacterEncoding("utf-8");
	       String name = (String)request.getParameter("name");
	       String tel = (String)request.getParameter("tel");
	       String sno = (String)request.getParameter("sno");
	       String sex = (String)request.getParameter("sex");
	       String gra = (String)request.getParameter("gra");
	       String dep = (String)request.getParameter("dep");
	       String major = (String)request.getParameter("major");
	       String cno = (String)request.getParameter("cno");
	       String account = (String)request.getParameter("account");
	       if("其他".equals(dep)){
	    	   String other1 = (String) request.getParameter("other1");
	    	   if(other1!=null){
	    		   dep = other1;
	    	   }else{
	    		   response.sendRedirect("errors/error1.html");
	    	   }
	       }
	       if("其他".equals(cno)){
	    	   String other2 = (String) request.getParameter("other2");
	    	   if(other2!=null){
	    		   cno = other2;
	    	   }else{
	    		   response.sendRedirect("errors/error2.html");
	    	   }
	       }
	     
	       	session.setAttribute("name", name);
	       	session.setAttribute("sno", sno);
	       	session.setAttribute("tel", tel);
	       	session.setAttribute("sex", sex);
	       	session.setAttribute("gra", gra);
	       	session.setAttribute("dep", dep);
	       	session.setAttribute("major", major);
	       	session.setAttribute("cno", cno);
	       	session.setAttribute("account", account);
	       	//Student student = new Student(name ,sno,tel,sex,gra,dep,major,cno，account);
			//System.out.println(student.toString());
			//session.setAttribute("student", student);
	      
	   %>
	   姓名：<%= name %><br>
	   学号：<%= sno %><br>
	   电话号码：<%= tel %><br>
	   性别：<%= sex %><br>
	   班级信息：<%= gra %>级<%= dep %>学院<%= major %>专业（<%= cno %>）班<br>
	 南理oj账号：<%=account %><br>
	   <input type="button" value="提交" onclick="ok()">
	   <input type="button" value="返回修改" onclick="back()"><br>
	</div>
	</dir>
	<div class="button">
	
	</div>
</div>
</body>
</html>