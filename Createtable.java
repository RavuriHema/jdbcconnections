import java.sql.*;
import java.util.*;
class Createtable{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","hema");
Statement stmt=con.createStatement();
stmt.executeUpdate("create table userdet(name varchar(13),useadd varchar(67),bankno int(64))");
System.out.println("the table created");
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}