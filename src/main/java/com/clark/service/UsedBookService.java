package com.clark.service;

import com.clark.pojo.UsedBook;

import java.util.List;

public interface UsedBookService {

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
