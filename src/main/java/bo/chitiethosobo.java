package bo;

import java.util.ArrayList;

import bean.chitiethosobean;
import dao.chitiethosodao;

public class chitiethosobo {
	chitiethosodao cthsd = new chitiethosodao();
	ArrayList<chitiethosobean> ds;
	public ArrayList<chitiethosobean> getchitiethoso() throws Exception{
		ds = cthsd.getchitiethoso();
		return ds;
	}
}
