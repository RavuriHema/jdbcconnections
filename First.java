import java.sql.*;
class First{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","hema");
Statement stmt=con.createStatement();
stmt.executeUpdate("insert into students values(67,'phani')");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}