package com.craftsmanship.creationalPatterns;

import java.sql.Connection;

public class Client {

    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        Connection con = pool.checkOut();
        pool.checkIn(con);
    }
}
