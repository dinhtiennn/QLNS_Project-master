package bo;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.AdminChiTietDangKy;
import dao.AdminChiTietHoSo;
import dao.AdminHoSo;

public class maintest {
	public static void main(String[] args) {
		try {
			AdminHoSo adhs = new AdminHoSo();
			AdminChiTietHoSo adcths = new AdminChiTietHoSo();
			System.out.println(adhs.getMaHS("NV001"));
			System.out.println(adcths.GetCTHStheoMHS(adhs.getMaHS("NV001")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
