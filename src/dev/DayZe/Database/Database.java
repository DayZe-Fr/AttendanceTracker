package dev.DayZe.Database;

import dev.DayZe.tools;

import java.sql.*;

public class Database {
    public static Connection connection;
    private tools _tools;



    public Database(tools tools) {
        _tools = tools;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/attendance_tracker", "root", "");
            _tools.print("connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
