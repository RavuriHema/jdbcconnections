import java.sql.*;
import java.util.*;
class Sqlinjection{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Scanner sc=new Scanner(System.in);
System.out.println("enter the rollnumber");
int number=sc.nextInt();
System.out.println("enter the name");
String name=sc.nextline();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","hema");
statement stmt=con.createStatement();
String ress=insert into students values(number,name);
ResultSet res=stmt.executeUpdate(ress);
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}




