package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoiDB {
	public static Connection cn;
	public void ketnoi() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
<<<<<<< HEAD
		String url ="jdbc:sqlserver://DESKTOP-VSQGE62\\TANNGO:1433;databaseName=QLNS; user=sa; password=123";
=======
		String url ="jdbc:sqlserver://LAPTOP-N2S29REU\\SQLEXPRESS03:1433;databaseName=QLNS; user=sa; password=123";
>>>>>>> 70280692b566543b1de55468f2faf4a81deadc8b
		cn = DriverManager.getConnection(url);
		System.out.println("Da Ket Noi");
	}
}
