package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.loaigiaytobean;
import bean.nhanvienbean;

public class AdminGiayTo {
	public ArrayList<loaigiaytobean> getLoaiGiayTo() throws Exception {
		ArrayList<loaigiaytobean> ds = new ArrayList<loaigiaytobean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "SELECT * FROM LoaiGiayTo";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaGiayTo = rs.getString("MaGiayTo");
			String TenGiayTo = rs.getString("TenGiayTo");
			ds.add(new loaigiaytobean(MaGiayTo, TenGiayTo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	
	public void themGiayTo(String MaGiayTo, String TenGiayTo) throws Exception {
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "INSERT INTO LoaiGiayTo VALUES (?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaGiayTo);
		cmd.setString(2, TenGiayTo);
		cmd.executeUpdate();
		System.out.println("Da Them");
		kn.cn.close();
	}
	
	public void suaGiayTo(String MaGiayTo, String TenGiayTo) throws Exception {
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "UPDATE LoaiGiayTo SET TenGiayTo = ? where MaGiayTo = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, TenGiayTo);
		cmd.setString(2, MaGiayTo);
		cmd.executeUpdate();
		System.out.println("Da Sua");
		kn.cn.close();
	}
	
	public void xoaGiayTo(String MaGiayTo) throws Exception {
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "DELETE FROM LoaiGiayTo WHERE MaGiayTo = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaGiayTo);
		cmd.executeUpdate();
		System.out.println("Da Xoa");
		kn.cn.close();
	}
	
	public static void main(String[] args) {
		AdminGiayTo ad= new AdminGiayTo();
		try {
			ad.xoaGiayTo("GT7");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
