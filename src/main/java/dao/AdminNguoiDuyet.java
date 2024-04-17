package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.nguoiduyetbean;

public class AdminNguoiDuyet {
	public ArrayList<nguoiduyetbean> getNguoiDuyet() throws Exception{
		ArrayList<nguoiduyetbean> ds = new ArrayList<nguoiduyetbean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from NguoiDuyet";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaNV = rs.getString("MaNguoiDuyet");
		    String TenNV = rs.getString("TenNguoiDuyet");
			String MaCV = rs.getString("MaCV");
			ds.add( new nguoiduyetbean(MaNV, TenNV, MaCV));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public void themNguoiDuyet(String MaNguoiDuyet, String TenNguoiDuyet, String MaCV) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "INSERT INTO NguoiDuyet VALUES (?, ?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaNguoiDuyet);
		cmd.setString(2, TenNguoiDuyet);
		cmd.setString(3, MaCV);
		cmd.executeUpdate();
		System.out.println("Da Them Nguoi Duyet");
	}
	
	public void xoaNguoiDuyet(String MaNguoiDuyet) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "DELETE FROM NguoiDuyet WHERE MaNguoiDuyet = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaNguoiDuyet);
		cmd.executeUpdate();
		System.out.println("Da Xoa Nguoi Duyet");
	}
	
	public void suaNguoiDuyet(String MaNguoiDuyet, String TenNguoiDuyet, String MaCV) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "UPDATE NguoiDuyet SET TenNguoiDuyet = ?, MaCV = ? WHERE MaNguoiDuyet = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, TenNguoiDuyet);
		cmd.setString(2, MaCV);
		cmd.setString(3, MaNguoiDuyet);
		cmd.executeUpdate();
		System.out.println("Da Sua Nguoi Duyet");
	}
}
