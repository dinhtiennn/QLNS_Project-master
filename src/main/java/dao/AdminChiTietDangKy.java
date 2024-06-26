package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.chitietdangkybean;

public class AdminChiTietDangKy {
	public ArrayList<chitietdangkybean> GetAllCTDK() throws Exception{
		ArrayList<chitietdangkybean> ds = new ArrayList<chitietdangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql ="select * from ChiTietDangKy";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()){
			Long MaCTDK = rs.getLong("MaCTDK");
			String MaDonDK = rs.getString("MaDonDK");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			String MaNguoiDuyet = rs.getString("MaNguoiDuyet");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			String LyDo = rs.getString("LyDo");
			ds.add(new chitietdangkybean(MaCTDK, MaDonDK, MaLoaiDK, MaNguoiDuyet, MaLoaiCa, NgayDangKy, LyDo));
		}
		kn.cn.close();
		rs.close();
		return ds;
	}
	public void UpDateChiTietDangKy(long mactdk, String madondk, String maloaidk, String maloaica, Date ngaydangky, boolean vang, String lydo) throws Exception{
			ketnoiDB kn = new ketnoiDB();
			kn.ketnoi();
			String sql="UPDATE ChiTietDangKy SET MaDonDK = ?, MaLoaiDK= ?, MaNguoiDuyet= ?,MaLoaiCa = ?,NgayDangKy = ?, Vang= ?,LyDo=?  WHERE MaCTDK = ?";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, madondk);
			cmd.setString(2, maloaidk);
			cmd.setString(3, "ADMIN");
			cmd.setString(4, maloaica);
			SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd"); 
			String tam= dd.format(ngaydangky);
			Date n2= dd.parse(tam);
			cmd.setDate(5, new java.sql.Date(n2.getTime()));
			cmd.setBoolean(6, vang);
			cmd.setString(7, lydo);
			cmd.setLong(8, mactdk);;
			cmd.executeUpdate();
			kn.cn.close();
	}
	public chitietdangkybean GetCTDK(Long mactdk) throws Exception{
		chitietdangkybean ctdkb = null ;
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql ="select * from ChiTietDangKy where MaCTDK = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setLong(1, mactdk);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()){
			Long MaCTDK = rs.getLong("MaCTDK");
			String MaDonDK = rs.getString("MaDonDK");
			String MaLoaiDK = rs.getString("MaLoaiDK");
			String MaNguoiDuyet = rs.getString("MaNguoiDuyet");
			String MaLoaiCa = rs.getString("MaLoaiCa");
			Date NgayDangKy = rs.getDate("NgayDangKy");
			String LyDo = rs.getString("LyDo");
			ctdkb = new chitietdangkybean(MaCTDK, MaDonDK, MaLoaiDK, MaNguoiDuyet, MaLoaiCa, NgayDangKy, LyDo);
		}
		kn.cn.close();
		rs.close();
		return ctdkb;
	}
}
