package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.bangdangkybean;
import bean.chitietdangkybean;

public class bangdangkydao {
	public ArrayList<bangdangkybean> getbangdk() throws Exception{
		ArrayList<bangdangkybean> ds = new ArrayList<bangdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ThongKeCaLamCuaTatCaNhanVien";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String Manv = rs.getString("MaNV");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			Boolean Duyet = rs.getBoolean("Duyet");
			String LyDo = rs.getString("LyDo");
			ds.add(new bangdangkybean(Manv, MaLoaiCa, MaLoaiDK, NgayDangKy, Duyet, LyDo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public ArrayList<bangdangkybean> selectBDCaLamKByMaNV(String manv) throws Exception{
		ArrayList<bangdangkybean> ds = new ArrayList<bangdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ThongKeCaLamCuaTatCaNhanVien where MaNV = ? and (MaLoaiDK = 'LDK1' or MaLoaiDK = 'LDK3') ";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, manv);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String Manv = rs.getString("MaNV");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			Boolean Duyet = rs.getBoolean("Duyet");
			String LyDo = rs.getString("LyDo");
			ds.add(new bangdangkybean(Manv, MaLoaiCa, MaLoaiDK, NgayDangKy, Duyet, LyDo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public ArrayList<bangdangkybean> selectBDKByMaN_Month_Year(String manv,int month,int year) throws Exception{
		ArrayList<bangdangkybean> ds = new ArrayList<bangdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ThongKeCaLamCuaTatCaNhanVien where MaNV = ? and Month(NgayDangKy) = ? and Year(NgayDangKy) = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, manv);
		cmd.setInt(2, month);
		cmd.setInt(3, year);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String Manv = rs.getString("MaNV");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			Boolean Duyet = rs.getBoolean("Duyet");
			String LyDo = rs.getString("LyDo");
			ds.add(new bangdangkybean(Manv, MaLoaiCa, MaLoaiDK, NgayDangKy, Duyet, LyDo));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public void insertDK(String manv) throws Exception{
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "DECLARE @NewMaDonDK INT;\r\n"
				+ "SELECT @NewMaDonDK = MAX(CAST(SUBSTRING(MaDonDK, 3, LEN(MaDonDK) - 2) AS INT)) + 1 FROM DangKy;\r\n"
				+ "\r\n"
				+ "INSERT INTO DangKy (MaDonDK, MaNV, Duyet)\r\n"
				+ "VALUES ('DK' + CAST(@NewMaDonDK AS NVARCHAR(10)), ?, 0);";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    cmd.setString(1, manv);
	    cmd.executeUpdate();
	    System.out.println("Da update bang DK");
	}
	public void insertCTDK(String maLK, java.sql.Date ngay) throws Exception{
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "DECLARE @NewMaDonDK INT;\r\n"
				+ "SELECT @NewMaDonDK = MAX(CAST(SUBSTRING(MaDonDK, 3, LEN(MaDonDK) - 2) AS INT)) FROM DangKy;\r\n"
				+ "\r\n"
				+ "INSERT INTO ChiTietDangKy ( MaDonDK,MaLoaiDK, MaNguoiDuyet, MaLoaiCa, NgayDangKy, Vang, LyDo) \r\n"
				+ "VALUES ('DK' + CAST(@NewMaDonDK AS NVARCHAR(10)), 'LDK1', 'HT', ?, ?, 0, NULL);";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    cmd.setString(1, maLK);
	    cmd.setDate(2,  ngay);
	    cmd.executeUpdate();
	    System.out.println("Da update bang CTDK");
	}
}
