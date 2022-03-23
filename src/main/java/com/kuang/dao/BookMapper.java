package com.kuang.dao;
import com.kuang.pojo.Books;
import java.util.List;
public interface BookMapper {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //根据id查询Book数量
    int queryBookValueById(int id);
}