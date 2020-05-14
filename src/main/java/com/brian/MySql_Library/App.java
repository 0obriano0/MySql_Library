package com.brian.MySql_Library;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //宣告初始 MySql 資料 
        //MySQL DB = new MySQL("root","password","jdbc:mysql://127.0.0.1/?useSSL=false&useUnicode=true&characterEncoding=utf8","default_database");
        MySQL DB = new MySQL("root","password","jdbc:mysql://127.0.0.1/","default_database",false,true,"utf8");
        
        //嘗試連街資料庫(如果連接資料庫時發現沒有數據庫，且有連接成功時會自動創建數據庫)
        DB.open();
        
    }
}
