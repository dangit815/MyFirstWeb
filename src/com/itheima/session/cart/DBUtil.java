package com.itheima.session.cart;

import java.util.HashMap;
import java.util.Map;

public class DBUtil {
    private static Map<String,Book> books = new HashMap<String, Book>();

    static {
        books.put("1",new Book("1","金瓶梅",20,"王瑞鑫"));
        books.put("2",new Book("2","葵花宝典",20,"杨成毅"));
        books.put("3",new Book("3","九阴真经",30,"陈光"));
        books.put("4",new Book("4","玉女心经",10,"陈志家"));
    }

    /**
     * 得到所有书
     * @return
     */
    //方便其他函数调用books变量，比直接使用变量好
    public static Map<String,Book> findAllBooks(){
        return books;
    }

    /**
     * 根据id查找指定的书
     * @param id
     * @return
     */
    public static Book findBookById(String id){
        return books.get(id);
    }
}
