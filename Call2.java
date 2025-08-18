import java.sql.*;
import java.util.*;
class Call2{
public static void main(String args[]){
try{
Scanner sc=new Scanner(System.in);
System.out.println("enter the password");
String password=sc.nextLine();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlinjection","root","hema");
CallableStatement stmt=con.prepareCall("{call getpwd(?)}");
stmt.setString(1,"password");
ResultSet res=stmt.executeQuery();
if(res.next()){
System.out.println(res.getString(1));
}
else{
System.out.println("the user does not exit");
}
con.close();
}
catch(Exception e){
System.out.println(e);
}
}
}



