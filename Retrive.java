import java.sql.*;
class Retrive{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306:/school","root","hema");
Statement stmt=con.CreateStatement();
ResultSet res=stmt.executeQuery("select*from students");
while(res.next()){
System.out.println(res.getInt());
System.out.println(res.getString());
System.out.println(res.gerString());
}
catch(Exception e){
System.out.println(e);
}
}
}