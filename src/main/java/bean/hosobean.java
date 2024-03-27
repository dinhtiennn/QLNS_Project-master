package bean;

public class hosobean {
	private String MaHS;
	private String MaNV;
	private String DaNop;
	public hosobean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hosobean(String maHS, String maNV, String daNop) {
		super();
		MaHS = maHS;
		MaNV = maNV;
		DaNop = daNop;
	}
	public String getMaHS() {
		return MaHS;
	}
	public void setMaHS(String maHS) {
		MaHS = maHS;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getDaNop() {
		return DaNop;
	}
	public void setDaNop(String daNop) {
		DaNop = daNop;
	}
	
}
