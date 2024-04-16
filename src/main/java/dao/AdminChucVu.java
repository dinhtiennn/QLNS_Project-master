package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.chucvubean;

public class AdminChucVu {
	public ArrayList<chucvubean> getAllCV() throws Exception{
		ArrayList<chucvubean> ds = new ArrayList<chucvubean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ChucVu";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaCV = rs.getString("MaCV");
			String TenCV = rs.getString("TenCV");
			ds.add(new chucvubean(MaCV, TenCV));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public void ThemChucVu(String macv, String tencv) throws Exception{
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql="insert into ChucVu(MaCV,TenCV) values(?,?) ";
		PreparedStatement cmd= kn.cn.prepareStatement(sql);
		cmd.setString(1, macv);
		cmd.setString(2, tencv);
		cmd.executeUpdate();
		cmd.close();
		kn.cn.close();
	}
}
