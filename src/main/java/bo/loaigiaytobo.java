package bo;

import java.util.ArrayList;

import bean.loaigiaytobean;
import dao.loaigiaytodao;

public class loaigiaytobo {
	loaigiaytodao lgtd = new loaigiaytodao();
	ArrayList<loaigiaytobean> ds;
	public ArrayList<loaigiaytobean> gethoso() throws Exception{
		ds = lgtd.gethoso();
		return ds;
	}
}
