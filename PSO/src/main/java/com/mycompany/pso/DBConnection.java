/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ederw
 */
public class DBConnection {
    private static final String URL =
            "jdbc:ucanaccess://C:/Users/ederw/OneDrive/Documents/Student_DB.accdb";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
