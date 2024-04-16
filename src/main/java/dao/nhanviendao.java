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
	public void ThemNV(String TenDangNhap, String MatKhau) throws Exception{
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "declare @newMaNV int, @newMaNV_Str nvarchar(10)\r\n"
				+ "select @newMaNV = max(CAST(SUBSTRING(MaNV, 3,LEN(MaNV) - 2) as int)) + 1 from NhanVien\r\n"
				+ "if @newMaNV < 100 set @newMaNV_Str = '0'+ cast(@newMaNV as nvarchar(10))\r\n"
				+ "else set @newMaNV_Str = CAST(@newMaNV as nvarchar(10))\r\n"
				+ "insert into NhanVien(MaNV,MaCV,TenDangNhap, MatKhau)\r\n"
				+ "values ('NV'+ cast(@newMaNV_Str as nvarchar(10)) ,'NV',?,?)";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    cmd.setString(1, TenDangNhap);
	    cmd.setString(2,  MatKhau);
	    cmd.executeUpdate();
	    System.out.println("Da them nhan vien moi");
	}
//	public static void main(String[] args) {
//		try {
//			nhanviendao nvdao = new nhanviendao();
//			nvdao.ThemNV("tandz", "123");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
}
