package bo;

import java.sql.Date;
import java.util.ArrayList;

import bean.bangdangkybean;
import dao.bangdangkydao;

public class bangdangkybo{
	bangdangkydao bdkdao = new bangdangkydao();
	public ArrayList<bangdangkybean> selectAllBangDangKy() throws Exception{
		return bdkdao.getbangdk();
	}
	public ArrayList<bangdangkybean> selectBDKByMaNV(String manv) throws Exception{
		return bdkdao.selectBDCaLamKByMaNV(manv);
	}
	public ArrayList<bangdangkybean> selectBDKByMaNV_Month_Year(String manv,int month,int year) throws Exception{
		return bdkdao.selectBDKByMaN_Month_Year(manv, month, year);
	}
	public void insertDK(String manv) throws Exception{
		bdkdao.insertDK(manv);
	}
	public void insertCTDK(String malk,Date date) throws Exception{
		bdkdao.insertCTDK(malk, date);
	}
	public static void main(String[] args) {
		bangdangkybo bdkbo = new bangdangkybo();
		try {
			ArrayList<bangdangkybean> ds = bdkbo.selectBDKByMaNV_Month_Year("NV001",4,2024);
			for (bangdangkybean bangdangkybean : ds) {
				System.out.println(bangdangkybean.toString());
			}
//			bdkbo.insertDK("NV004");
//			bdkbo.insertCTDK("LC1",Date.valueOf("2024-03-18"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
