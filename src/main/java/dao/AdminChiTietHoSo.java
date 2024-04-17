package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.chitiethosobean;

public class AdminChiTietHoSo {
	public ArrayList<chitiethosobean> GetAllCTHS() throws Exception{
		ArrayList<chitiethosobean> ds = new ArrayList<chitiethosobean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ChiTietHoSo";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			Long MaCTHS = rs.getLong("MaCTHS");
			String SLPhaiNop = rs.getString("SLPhaiNop");
			String BatBuoc = rs.getString("BatBuoc");
			String SLDaNop =  rs.getString("SLDaNop");
			String GhiChu = rs.getString("GhiChu");
			String MaGiayTo = rs.getString("MaGiayTo");
			String MaHS = rs.getString("MaHS");
			ds.add(new chitiethosobean(MaCTHS, SLPhaiNop, BatBuoc, SLDaNop, GhiChu, MaGiayTo, MaHS));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	public ArrayList<chitiethosobean> GetCTHStheoMHS(String mahs) throws Exception{
		ArrayList<chitiethosobean> ds = new ArrayList<chitiethosobean>();
		ketnoiDB kn = new ketnoiDB();
		kn.ketnoi();
		String sql = "select * from ChiTietHoSo where MaHS = ?";
		PreparedStatement cmd = kn.cn.prepareStatement(sql);
		cmd.setString(1,mahs);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			Long MaCTHS = rs.getLong("MaCTHS");
			String SLPhaiNop = rs.getString("SLPhaiNop");
			String BatBuoc = rs.getString("BatBuoc");
			String SLDaNop =  rs.getString("SLDaNop");
			String GhiChu = rs.getString("GhiChu");
			String MaGiayTo = rs.getString("MaGiayTo");
			String MaHS = rs.getString("MaHS");
			ds.add(new chitiethosobean(MaCTHS, SLPhaiNop, BatBuoc, SLDaNop, GhiChu, MaGiayTo, MaHS));
		}
		rs.close();
		kn.cn.close();
		return ds;
	}
	
}

