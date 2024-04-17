package bo;

import java.util.ArrayList;

import bean.nhanvienbean;
import dao.nhanviendao;

public class nhanvienbo {
	ArrayList<nhanvienbean> ds;
	nhanviendao nvd = new nhanviendao();
	public ArrayList<nhanvienbean> getnhanvien() throws Exception{
		ds = nvd.getnhanvien();
		return ds;
	}
	public nhanvienbean getnhanvientheoma(String manv) throws Exception{
		return nvd.getnhanvientheoma(manv);
	}
	public nhanvienbean getNhanVienTheoTKvaMK( String tendangnhap,String matkhau) throws Exception{
		return nvd.getNhanVienTheoTKvaMK(tendangnhap,matkhau);
	}
	public static void main(String[] args) {
		nhanvienbo nvbo = new nhanvienbo();
		try {
			
			System.out.println(nvbo.getNhanVienTheoTKvaMK("Can1212", "121212"));
		} catch (Exception e) {
e.printStackTrace();
		}
	}
}
