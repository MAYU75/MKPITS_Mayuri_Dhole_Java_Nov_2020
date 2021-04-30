//Java program having Register Class to demonstrate how to create a registration form with
// Username, password, gender, course and city using Swing.

package src.com.mkpits.java.jdbcexamples;

import java.sql.*;

public class RegisterClassForRegistrationForm {
    private String username, pwd, gender, course, city;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public void setcourse(String course) {
        this.course = course;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String saveregister() {
        Connection con = null;
        Statement st = null;
        String str = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/mkpits1", "postgres", "SA");
            //System.out.println("connected");
            st = con.createStatement();

            String sql = "insert into register(username,pwd,gender,course,city) values('" + username + "','" + pwd + "','" + gender + "','" + course + "','" + city + "')";
            st.executeUpdate(sql);
            str = "registered successfully";
            st.close();
            con.close();
        } catch (Exception ee) {
            str = ee.toString();
        } finally {

        }
        return str;
    }

}
