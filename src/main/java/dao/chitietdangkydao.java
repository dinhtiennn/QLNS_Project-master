package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.chitietdangkybean;

public class chitietdangkydao {
	public ArrayList<chitietdangkybean> getchitietdangky() throws Exception{
		ArrayList<chitietdangkybean> ds = new ArrayList<chitietdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ChiTietdangKy";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			Long MaCTDK = rs.getLong("MaCTDK");
			String MaDonDK = rs.getString("MaDonDK");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			String MaNguoiDuyet = rs.getString("MaNguoiDuyet");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			String LyDo = rs.getString("LyDo");
			ds.add(new chitietdangkybean(MaCTDK, MaDonDK, MaLoaiDK, MaNguoiDuyet, MaLoaiCa, NgayDangKy, LyDo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public ArrayList<chitietdangkybean> selectDsByMMYYYY(String manv,int month, int year) throws Exception{
		ArrayList<chitietdangkybean> ds = new ArrayList<chitietdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			Long MaCTDK = rs.getLong("MaCTDK");
			String MaDonDK = rs.getString("MaDonDK");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			String MaNguoiDuyet = rs.getString("MaNguoiDuyet");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			String LyDo = rs.getString("LyDo");
			ds.add(new chitietdangkybean(MaCTDK, MaDonDK, MaLoaiDK, MaNguoiDuyet, MaLoaiCa, NgayDangKy, LyDo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
}
