package acm.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDDao {

	private Connection connection;
	private String driver;
	private String url;
	private String username;
	private String password;
	
	public BDDao(String driver, String url, String username, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	

	public BDDao() {
		// TODO Auto-generated constructor stub
	}
	//获取数据库链接
	public void getConnection() throws Exception {
		if(connection == null) {			
			 Class.forName(driver);
			 connection = DriverManager.getConnection(url, username, password);
		}
		
	}
	//插入操作
	public boolean insert(String sql) throws Exception {
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		int n = prepareStatement.executeUpdate();
		//prepareStatement.close();
		//System.out.println("n = "+n);
		if(n == 1) {
			return true;
		}
		return false;
	}
	
	//查询操作
	public ResultSet query(String sql) throws Exception, Exception {
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		ResultSet rSet = prepareStatement.executeQuery();
		//prepareStatement.close();
		return rSet;
	}
	
	//关闭连接

	public void close() throws Exception {
		if(connection!=null&&!connection.isClosed()) {
			connection.close();
		}
	}
}
