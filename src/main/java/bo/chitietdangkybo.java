package bo;

import java.util.ArrayList;

import bean.chitietdangkybean;
import dao.chitietdangkydao;

public class chitietdangkybo {
	chitietdangkydao ctdkd = new chitietdangkydao();
	ArrayList<chitietdangkybean> ds;
	public ArrayList<chitietdangkybean> getchitietdangky() throws Exception{
		ds = ctdkd.getchitietdangky();
		return ds;
	}
	public static void main(String[] args) {
		chitietdangkybo ctdkbo = new chitietdangkybo();
		try {
			ArrayList<chitietdangkybean> ctdk = ctdkbo.getchitietdangky();
			for (chitietdangkybean chitietdangkybean : ctdk) {
				System.out.println(chitietdangkybean.getNgayDangKy());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
