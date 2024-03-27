package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.nhanvienbean;

public class nhanviendao {
	public ArrayList<nhanvienbean> getnhanvien() throws Exception{
		ArrayList<nhanvienbean> ds = new ArrayList<nhanvienbean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from NhanVien";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaNV = rs.getString("MaNV");
		    String TenNV = rs.getString("TenNV");
			String MaCV = rs.getString("MaCV");
			Date NgaySinh = rs.getDate("NgaySinh");
			String GioiTinh = rs.getString("GioiTinh");
			String Email = rs.getString("Email");
			String SDT = rs.getString("SDT");
			String DVCT = rs.getString("DVCT");
			String ChucDanh = rs.getString("ChucDanh");
			String TenDangNhap = rs.getString("TenDangNhap");
			String MatKhau = rs.getString("MatKhau");
			ds.add( new nhanvienbean(MaNV, TenNV, MaCV, NgaySinh, GioiTinh, Email, SDT, DVCT, ChucDanh, TenDangNhap, MatKhau));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public nhanvienbean getnhanvientheoma(String manv) throws Exception{
		nhanvienbean nvb = new nhanvienbean();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from NhanVien where MaNV = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, manv);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaNV = rs.getString("MaNV");
			String TenNV = rs.getString("TenNV");
			String MaCV = rs.getString("MaCV");
			Date NgaySinh = rs.getDate("NgaySinh");
			String GioiTinh = rs.getString("GioiTinh");
			String Email = rs.getString("Email");
			String SDT = rs.getString("SDT");
			String DVCT = rs.getString("DVCT");
			String ChucDanh = rs.getString("ChucDanh");
			String TenDangNhap = rs.getString("TenDangNhap");
			String MatKhau = rs.getString("MatKhau");
			nvb =  new nhanvienbean(MaNV, TenNV, MaCV, NgaySinh, GioiTinh, Email, SDT, DVCT, ChucDanh, TenDangNhap, MatKhau);
		}
		rs.close();
		kn.cn.close();
		
		return nvb;
	}
	public nhanvienbean getNhanVienTheoTKvaMK( String tendangnhap,String matkhau) throws Exception{
		nhanvienbean nvb = null;
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from NhanVien where TenDangNhap = ? and MatKhau = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, tendangnhap);
		cmd.setString(2, matkhau);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaNV = rs.getString("MaNV");
			String TenNV = rs.getString("TenNV");
			String MaCV = rs.getString("MaCV");
			Date NgaySinh = rs.getDate("NgaySinh");
			String GioiTinh = rs.getString("GioiTinh");
			String Email = rs.getString("Email");
			String SDT = rs.getString("SDT");
			String DVCT = rs.getString("DVCT");
			String ChucDanh = rs.getString("ChucDanh");
			String TenDangNhap = rs.getString("TenDangNhap");
			String MatKhau = rs.getString("MatKhau");
			nvb =  new nhanvienbean(MaNV, TenNV, MaCV, NgaySinh, GioiTinh, Email, SDT, DVCT, ChucDanh, TenDangNhap, MatKhau);
		}
		rs.close();
		kn.cn.close();
		
		return nvb;
	}
}
