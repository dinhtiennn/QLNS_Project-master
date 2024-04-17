package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import bean.nhanvienbean;

public class AdminNhanVien {
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
	public void thayDoiChucVuNhanVien(String MaNV, String MaCV) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "UPDATE NhanVien SET MaCV= ? WHERE MaNV= ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaCV);
		cmd.setString(2, MaNV);
		cmd.executeUpdate();
		System.out.println("Da Update");
		kn.cn.close();	
	}
	
	public void themNhanVien(String MaNV, String TenNV, String MaCV, Date NgaySinh, String GioiTinh, String Email, String SDT, String DVCT, String ChucDanh, String TenDangNhap, String MatKhau) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "INSERT INTO NhanVien VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaNV);
		cmd.setString(2, TenNV);
		cmd.setString(3, MaCV);
		cmd.setDate(4, NgaySinh);
		cmd.setString(5, GioiTinh);
		cmd.setString(6, Email);
		cmd.setString(7, SDT);
		cmd.setString(8, DVCT);
		cmd.setString(9, ChucDanh);
		cmd.setString(10, TenDangNhap);
		cmd.setString(11, MatKhau);
		cmd.executeUpdate();
		System.out.println("Da Them NV");
	}
	
	//Hàm của NgoTanNgoTan
	public void ThemNV(String TenDangNhap, String MatKhau) throws Exception{
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "declare @newMaNV int, @newMaNV_Str nvarchar(10)\r\n"
				+ "select @newMaNV = max(CAST(SUBSTRING(MaNV, 3,LEN(MaNV) - 2) as int)) + 1 from NhanVien\r\n"
				+ "if @newMaNV < 100 set @newMaNV_Str = '0'+ cast(@newMaNV as nvarchar(10))\r\n"
				+ "else set @newMaNV_Str = CAST(@newMaNV as nvarchar(10))\r\n"
				+ "insert into NhanVien(MaNV,TenNV,MaCV,NgaySinh,GioiTinh,Email,SDT,DVCT,ChucDanh,TenDangNhap, MatKhau)\r\n"
				+ "values ('NV'+ cast(@newMaNV_Str as nvarchar(10)),'','NV','','','','','Team Design','Teammate',?,?)";
	    PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    cmd.setString(1, TenDangNhap);
	    cmd.setString(2, MatKhau);
	    cmd.executeUpdate();
	    System.out.println("Da them moi 1 nhan vien!");
	    kn.cn.close();
	}
	
	public void xoaNhanVien(String MaNV) throws Exception {
		ketnoiDB kn= new ketnoiDB();
		kn.ketnoi();
		String sql= "DELETE FROM NhanVien WHERE MaNV = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaNV);
		cmd.executeUpdate();
		System.out.println("Da Xoa NV");
		kn.cn.close();
	}
	
	public static void main(String[] args) {
		AdminNhanVien ad = new AdminNhanVien();
		try {
			ad.xoaNhanVien("NV021");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
