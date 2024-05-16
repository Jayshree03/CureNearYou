package cnu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


import cnu.db.DBConnection;
import cnu.dto.Patientdto;
import cnu.dto.Userdto;

public class MainDAO {
	Connection con = null;
	PreparedStatement ps= null;
	Statement stm = null;
	ResultSet rs = null;
	public boolean insertPatient(Userdto udto, Patientdto pdto) {
		boolean x = false;
		try {
            // Getting connection from DBConnection class
            con = DBConnection.getConn();
            
            // Inserting data into the database
            String query = "INSERT INTO user (uid, uname, umob, uadd, upass, utype) VALUES(?, ?, ?, ?, ? ,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,udto.getUid());
            pst.setString(2, udto.getUname());
            pst.setString(3,udto.getUmob());
            pst.setString(4, udto.getUadd());
            pst.setString(5, udto.getUpass());
            pst.setInt(6, udto.getUtype());
            String query1 = "INSERT INTO patient (uid, age, gender) VALUES (?, ?, ?)";
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setString(1,udto.getUid());
            pst1.setInt(2, pdto.getP_age());
            pst1.setString(3, pdto.getP_gender());
            int rowsAffecteduser = pst.executeUpdate();
            int rowsAffectedpatient = pst1.executeUpdate();

            if (rowsAffecteduser > 0 && rowsAffectedpatient >0) {
                x=true;
            } else {
            	x=false;
            }

        } catch(Exception tt) {
        	System.out.println(tt);
        }
		return x;
	}
	public boolean checkLoginCred(int utype, String uid, String upass) {
		boolean b = false;
		try {
			con = DBConnection.getConn();
			ps = con.prepareStatement("select uid,upass from user where uid=? and upass=? and utype=?");
			ps.setString(1, uid);
			ps.setString(2, upass);
			ps.setInt(3, utype);
			rs = ps.executeQuery();
			b=rs.next();
			rs.close();
			ps.close();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return b;
	}
	public Vector<String> SpecAppointment(){
		Vector<String> app = new Vector<String>();
		try {
			con = DBConnection.getConn();
			stm=con.createStatement();
			rs=stm.executeQuery("select distinct specification from doctor");
			while(rs.next()) {
				app.add(rs.getString(1));
			}
			rs.close();
			stm.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return app;
	}
	public Vector<String> Doc_Appointment(String spec){
		Vector<String> app = new Vector<String>();
		try {
			con = DBConnection.getConn();
			stm=con.createStatement();
			rs=stm.executeQuery("select distinct uname from user inner join doctor where doctor.specification ="+ spec +" and utype = 2 ");
			while(rs.next()) {
				app.add(rs.getString(1));
			}
			rs.close();
			stm.close();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return app;
	}
	public List getUserByUid(String uid) {
		List l = new ArrayList<>();
        try {
        	con = DBConnection.getConn();
            String query = "SELECT * FROM users WHERE uid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, uid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               l.add(rs.getString("uid"));
               l.add(rs.getString("uname"));
               l.add(rs.getString("umob"));
               l.add(rs.getString("uadd"));
               l.add(rs.getString("utype"));
               
                        // No need to set password for profile view
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }
}
