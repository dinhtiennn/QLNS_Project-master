package bo;

import java.util.ArrayList;

import bean.hosobean;
import dao.hosodao;

public class hosobo {
	hosodao hsd = new hosodao();
	ArrayList<hosobean> ds;
	public ArrayList<hosobean> gethoso() throws Exception{
		ds = hsd.gethoso();
		return ds;
	}
}
