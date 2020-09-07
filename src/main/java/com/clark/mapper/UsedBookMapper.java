package com.clark.mapper;

import com.clark.pojo.UsedBook;
import com.clark.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsedBookMapper {

    List<UsedBook> getUsedBook();

    UsedBook getUsedBookById(int id);

    List<UsedBook> getUsedBookByUsedItemCategoryId(int id);

    List<UsedBook> getUsedBookByBookName(String bookName);

    List<UsedBook> getUsedBookByAuthor(String author);

    List<UsedBook> getUsedBookByPublisher(String publisher);

    List<UsedBook> getUsedBookBySchool(String school);

    List<UsedBook> getUsedBookByCourseCode(String courseCode);

    int addUsedBook(UsedBook usedBook);

    int updateUsedBook(UsedBook usedBook);

    int deleteUsedBook(int id);

}
