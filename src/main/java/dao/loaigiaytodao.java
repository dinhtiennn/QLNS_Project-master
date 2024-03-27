package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bean.loaigiaytobean;

public class loaigiaytodao {
	public ArrayList<loaigiaytobean> gethoso() throws Exception{
		ArrayList<loaigiaytobean> ds = new ArrayList<loaigiaytobean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from LoaiGiayto";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String MaGiayTo = rs.getString("MaGiayTo");
			String TenGiayTo = rs.getString("TenGiayTo");
			ds.add(new loaigiaytobean(MaGiayTo, TenGiayTo) );
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
}
