package cnu.db;

import java.sql.Connection;
import java.sql.DriverManager;
//Java DBConnection class to start the jdbc connection
public class DBConnection implements DBConfig {
	public static Connection getConn() {
		Connection con = null;
		try {
			//Values of Driver, Conn, Unm, Pw are set in the DBConfig Interface  
			Class.forName(Driver);
			con = DriverManager.getConnection(Conn,Unm,Pw);
		}catch(Exception tt) {
			System.out.println(tt);
		}
		return con;
	}
}
