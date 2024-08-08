package org.ghosttrio.chap3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadLocalExample {
    private static final String DB_URL = "URL";

    private static ThreadLocal<Connection> connectionHolder = new ThreadLocal<>(){
        public Connection initialValue() {
            try {
                return DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    };

    public static Connection getConnection() {
        return connectionHolder.get();
    }
}
