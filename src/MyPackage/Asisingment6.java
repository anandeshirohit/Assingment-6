package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Asisingment6 {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Varalaxmi1265");
			Statement st=con.createStatement();
			/*st.execute("create table employee(empid number(3),empname varchar(10),salary number(5))");
			System.out.println("table created");*/
			st.executeUpdate("insert into employee values (111,'java',500)");
			st.executeUpdate("insert into employee values(222,'servlet',600)");
			st.executeUpdate("insert into employee values(333,'xml',700)");
			System.out.println("inserted");
			st.close();
			con.close();

			
			
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
