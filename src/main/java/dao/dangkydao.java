package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.dangkybean;

public class dangkydao {
	public ArrayList<dangkybean> getdangky() throws Exception{
		ArrayList<dangkybean> ds = new ArrayList<dangkybean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from DangKy";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaDonDK = rs.getString("MaDonDK");
			String MaNV = rs.getString("MaNV");
			Boolean Duyet = rs.getBoolean("Duyet");
			ds.add(new dangkybean(MaDonDK, MaNV, Duyet));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
}
