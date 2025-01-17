package com.zaremba.databases;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static DatabaseHandler handler;
    public static void addMember(String id, String name, String email, String nickName){
        String qu = "INSERT INTO MEMBER VALUES (" +
                "'" + id + "'," +
                "'" + name + "'," +
                "'" + email + "'," +
                "'" + nickName + "')";
        handler.execAction(qu);
    }
    public static void main(String[] args) {
        handler = DatabaseHandler.getHandler();
       //addMember("32434","sgfdsg","sdfsdfsgf","sdffdsgs");
        String qu = "SELECT * FROM MEMBER WHERE NAME = 'John'";
        ResultSet resultSet = handler.execQuery(qu);
        try{
            while(resultSet.next()){
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                System.out.println("Entry: ID" + id + "\tName: " + name);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
