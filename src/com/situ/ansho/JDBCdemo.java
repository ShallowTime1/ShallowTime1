package com.situ.ansho;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCdemo {
    public  static <CachedJarFile> void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        File readFile = new File("C:\\GUARANTY_INFO.txt");
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(readFile));
            String line = null;
            while ((line = reader.readLine()) != null){
                String[] array = line.split("|");
                list.add(array);
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader != null){
                try{
                    reader.close();
                }catch(IOException e){
                }
            }
        }

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = connection = DriverManager.getConnection("jdbc:amardase:db1", "username", "password");
            for (String[] array : list) {
                String sql = "insert into GUARANTY_INFO(GUARANTY_ID,GUARANTY_TYPE,GUARANTY_STATUS,GUARANTY_NAME) values(?, ?, ?, ?)";
                statement = connection.prepareStatement(sql);
                statement.setInt(1, Integer.parseInt(array[0]));
                statement.setInt(2,  Integer.parseInt(array[1]));
                statement.setInt(2,  Integer.parseInt(array[2]));
                statement.setString(3, array[3]);
                System.out.println(statement);
                int count = statement.executeUpdate();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            CachedJarFile JDBCUtil;
            JDBCUtil = null;
        }
    }
}
