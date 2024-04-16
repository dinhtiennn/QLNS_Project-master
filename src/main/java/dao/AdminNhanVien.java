package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import bean.chitietdangkybean;
import bean.nhanvienbean;

public class AdminNhanVien {
	public void thayDoiChucVu(String MaCV, String MaNV) throws Exception {
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "update NhanVien set MaCV = ? where MaNV = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1, MaCV);
		cmd.setString(2, MaNV);
		cmd.executeUpdate();
		System.out.println("Da Thang Chuc");
		kn.cn.close();
	}
}
