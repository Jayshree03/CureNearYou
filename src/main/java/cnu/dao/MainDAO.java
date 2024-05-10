package cnu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cnu.db.DBConnection;

public class MainDAO {
	public boolean checkLoginCred(int utype, String uid, String upass) {
		boolean b = false;
		try {
			Connection con = DBConnection.getConn();
			PreparedStatement ps = con.prepareStatement("select uid,upass from user where uid=? and upass=? and utype=?");
			ps.setString(1, uid);
			ps.setString(2, upass);
			ps.setInt(3, utype);
			ResultSet rs = ps.executeQuery();
			b=rs.next();
			ps.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return b;
	}
}
