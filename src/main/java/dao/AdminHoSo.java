package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.hosobean;

public class AdminHoSo {
	public ArrayList<hosobean> getAllHS() throws Exception{
		ArrayList<hosobean> ds = new ArrayList<hosobean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from HoSo";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaHS = rs.getString("MaHS");
			String MaNV = rs.getString("MaNV");
			String DaNop =  rs.getString("DaNop");
			ds.add(new hosobean(MaHS, MaNV, DaNop));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public String getMaHS(String manv) throws Exception{
		String mahs ="";
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select MaHS from HoSo where MaNV=?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, manv);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			mahs = rs.getString("MaHS");
		}
		rs.close();
		kn.cn.close();
		return mahs;
	}
}
