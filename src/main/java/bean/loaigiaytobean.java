package bean;

public class loaigiaytobean {
	private String MaGiayTo;
	private String TenGiayTo;
	public loaigiaytobean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public loaigiaytobean(String maGiayTo, String tenGiayTo) {
		super();
		MaGiayTo = maGiayTo;
		TenGiayTo = tenGiayTo;
	}
	public String getMaGiayTo() {
		return MaGiayTo;
	}
	public void setMaGiayTo(String maGiayTo) {
		MaGiayTo = maGiayTo;
	}
	public String getTenGiayTo() {
		return TenGiayTo;
	}
	public void setTenGiayTo(String tenGiayTo) {
		TenGiayTo = tenGiayTo;
	}
	
}
