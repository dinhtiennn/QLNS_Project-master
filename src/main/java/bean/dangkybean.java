package bean;

public class dangkybean {
	private String MaDonDK;
	private String MaNV;
	private Boolean Duyet;
	public dangkybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public dangkybean(String maDonDK, String maNV, Boolean duyet) {
		super();
		MaDonDK = maDonDK;
		MaNV = maNV;
		Duyet = duyet;
	}
	public String getMaDonDK() {
		return MaDonDK;
	}
	public void setMaDonDK(String maDonDK) {
		MaDonDK = maDonDK;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public Boolean getDuyet() {
		return Duyet;
	}
	public void setDuyet(Boolean duyet) {
		Duyet = duyet;
	}
	
	
}
