
package bookStore;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;

public class BookStore {
public static Connection getConnection(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
        return con;
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getGenre(){
    try{
        String query="select type from book order by type";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            result[i]=rs.getString("type");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static void excuteUpdate(String sql){
    try{
        PreparedStatement st=getConnection().prepareStatement(sql);
        st.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
    }
}
public static String getNameById(int id){
    try{
        String query="select name from lecture where id='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        while(rs.next())
            return rs.getString("name");
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String getDepartmentById(int id){
    try{
        String query="select department from lecture where id='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        while(rs.next())
            return rs.getString("department");
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static int getAgeById(int id){
    try{
        String query="select age from lecture where id='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        while(rs.next())
            return rs.getInt("age");
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}

public static String getSexById(int id){
    try{
        String query="select sex from lecture where id='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        while(rs.next())
            return rs.getString("sex");
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getLectureListById(String id){
    try{
        String query="select name,department from lecture where id='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[5];
        while(rs.next()){
            result[0]=rs.getString("name");
            result[1]=rs.getString("department");
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getBookListById(){
    try{
        String query="select isbn from book";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            result[i]=rs.getString("isbn");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getListByType(String type){
    try{
        String query="select isbn from book where type='"+type+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] list=new String[40];
        int i=0;
        while(rs.next()){
            list[i]=String.valueOf(rs.getInt("isbn"));
            i++;
        }  
        return list;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String getTitleById(String id){
    try{
        String query="select title from book where isbn='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String result=new String();
        while(rs.next())
            result=rs.getString("title");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] bookList(){
    try{
        String query="select title from book where copyLeft='0'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            result[i]=rs.getString("title");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static int getNumberOfCopiesLeft(String isbn){
    try{
        String query="select copyLeft from book where isbn='"+Integer.parseInt(isbn)+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int x=0;
        while(rs.next())
            x=rs.getInt("copyleft");
        return x;
    }catch(Exception e){
        e.printStackTrace();
        
    }
    return 0;
}
public static boolean hasCopies(String isbn){
    try{
        String id=isbn;
        String query="select copyLeft from book where isbn='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int x=0;
        while(rs.next())
            x=rs.getInt("copyleft");
        if(x>0)
            return true;
        return false;
    }catch(Exception e){
        e.printStackTrace();
        
    }
    return false;
}
public static String getAuthorById(String id){
    try{
        int isbn=Integer.parseInt(id);
        String query="select author from book where isbn='"+isbn+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String result=new String();
        while(rs.next())
            result=rs.getString("author");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static int getQuantityById(String id){
    try{
        String query="select quantity from book where isbn='"+id+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int result=0;
        while(rs.next())
            result=rs.getInt("quantity");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static int getPriceById(String id){
    try{
        int isbn=Integer.parseInt(id);
        String query="select price from book where isbn='"+isbn+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int result=0;
        while(rs.next())
            result=rs.getInt("price");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static int getNumberOfPagesById(String id){
    try{
        int isbn=Integer.parseInt(id);
        String query="select numberOfPages from book where isbn='"+isbn+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int result=0;
        while(rs.next())
            result=rs.getInt("numberOfPages");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static String getTypeById(String id){
    try{
        int isbn=Integer.parseInt(id);
        String query="select type from book where isbn='"+isbn+"'";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String result=new String();
        while(rs.next())
            result=rs.getString("type");
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getTitleList(){
    try{
        String query="select title from book";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            result[i]=rs.getString("title");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}

public static String[] getIllegalUsers(){
    try{
        String query="select id,name from lecture";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            String subQuery="select lectureId from borrow where lectureId='"+rs.getString("id")+"'";
            PreparedStatement st2=getConnection().prepareStatement(subQuery);
            ResultSet rs2=st2.executeQuery();
            int x=0;
            while(rs2.next())
                x++;
            if(x>2)
                result[i]=rs.getString("name");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[][] getBookDetails(){
    try{
        String query="select isbn,title,author,price,quantity,copyLeft,numberOfPages from book";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[][] result=new String[40][7];
        int i=0;
        while(rs.next()){
            result[i][0]=rs.getString("isbn");
            result[i][1]=rs.getString("title");
            result[i][2]=rs.getString("author");
            result[i][3]=rs.getString("price");
            result[i][4]=rs.getString("quantity");
            result[i][5]=rs.getString("copyLeft");
            result[i][6]=rs.getString("numberOfPages");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[][] getBorrowList(){
    try{
        String query="select name,title,borrowDate,returnDate from book inner join borrow on book.isbn=borrow.isbn inner join lecture on lectureId=lecture.id";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[][] result=new String[20][4];
        int i=0;
        while(rs.next()){
            result[i][0]=rs.getString("name");
            result[i][1]=rs.getString("title");
            result[i][2]=rs.getString("borrowDate");
            result[i][3]=rs.getString("returnDate");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static String[] getLectureId(){
 try{
        String query="select id from lecture";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        String[] result=new String[20];
        int i=0;
        while(rs.next()){
            result[i]=rs.getString("id");
            i++;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
public static int getTotalNumberOfLectures(){
    try{
        String query="select lectureid from book inner join borrow on book.isbn=borrow.isbn inner join lecture on lectureId=lecture.id";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int a=0;
        while(rs.next()){
            a=rs.getRow();
        }
        return a;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static int getTotalNumberBooksBorrowed(){
    try{
        String query="select id from lecture";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int a=0;
        while(rs.next()){
            a=rs.getRow();
        }
        return a;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static int getNumberofBooks(){
    try{
        String query="select isbn from book";
        PreparedStatement st=getConnection().prepareStatement(query);
        ResultSet rs=st.executeQuery();
        int a=0;
        while(rs.next()){
            a=rs.getRow();
        }
        return a;
    }catch(Exception e){
        e.printStackTrace();
    }
    return 0;
}
public static ArrayList<String> getAcountDetails(String name,String pwd){
    try{
        String query="select * from\"admin\" where \"username\"='"+name+"' AND \"password\"='"+pwd+"'";
        ArrayList<String> result=new ArrayList();
        PreparedStatement p=getConnection().prepareStatement(query);
        ResultSet rs=p.executeQuery();
        int i=0;
        while(rs.next()){
            result.add(rs.getString("username"));
            result.add(rs.getString("password"));
            i=i+2;
        }
        return result;
    }catch(Exception e){
        e.printStackTrace();
    }
    return null;
}
    public static void main(String[] args) {
        loginWindow window=new loginWindow();
        window.setTitle("Login");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        window.setVisible(true);
    }
    
}
