//Java program having Student Class to demonstrate how to create Student form having
// student name, address, gender, hobby and course using swing.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;

public class StudentClassForStudentForm {
    private String StudentName, Address, Gender, Course, Hobby;

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }

    public String saveregister() {
        Connection con = null;
        Statement st = null;
        String str = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/mkpits1", "postgres", "SA");
            System.out.println("connected");
            st = con.createStatement();

           // String sql = "insert into student(Student_Name,Address,Gender,Course,Hobby) values('" + StudentName + "','" + Address + "','" + Gender + "','" + Course + "','" + Hobby + "')";
            String sql = "insert into registerstud(sname,address,gender,course,hobby) values('"+StudentName+"', '"+Address+"' , '"+Gender+"' , '"+Course+"' , '"+Hobby+"')";
            st.executeUpdate(sql);
            str = "registered successfully";
            st.close();
            con.close();
        } catch (Exception ee) {
            str = ee.toString();
            System.out.println(str);
        } finally {

        }
        return str;
    }
}
