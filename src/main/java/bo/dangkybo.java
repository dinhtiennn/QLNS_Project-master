package bo;

import java.util.ArrayList;

import bean.dangkybean;
import dao.dangkydao;

public class dangkybo {
	dangkydao dkd = new dangkydao();
	ArrayList<dangkybean> ds;
	public ArrayList<dangkybean> getdangky() throws Exception{
		ds = dkd.getdangky();
		return ds;
	}
}
