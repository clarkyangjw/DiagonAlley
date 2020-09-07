package com.clark.service;

import com.clark.mapper.UsedBookMapper;
import com.clark.mapper.UserMapper;
import com.clark.pojo.UsedBook;
import com.clark.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsedBookServiceImpl implements UsedBookService {

    @Autowired
    private UsedBookMapper usedBookMapper;

    @Override
    public List<UsedBook> getUsedBook() {
        return usedBookMapper.getUsedBook();
    }

    @Override
    public UsedBook getUsedBookById(int id) {
        return usedBookMapper.getUsedBookById(id);
    }

    @Override
    public List<UsedBook> getUsedBookByUsedItemCategoryId(int id) {
        return usedBookMapper.getUsedBookByUsedItemCategoryId(id);
    }

    @Override
    public List<UsedBook> getUsedBookByBookName(String bookName) {
        return usedBookMapper.getUsedBookByBookName(bookName);
    }

    @Override
    public List<UsedBook> getUsedBookByAuthor(String author) {
        return usedBookMapper.getUsedBookByAuthor(author);
    }

    @Override
    public List<UsedBook> getUsedBookByPublisher(String publisher) {
        return usedBookMapper.getUsedBookByPublisher(publisher);
    }

    @Override
    public List<UsedBook> getUsedBookBySchool(String school) {
        return usedBookMapper.getUsedBookBySchool(school);
    }

    @Override
    public List<UsedBook> getUsedBookByCourseCode(String courseCode) {
        return usedBookMapper.getUsedBookByCourseCode(courseCode);
    }

    @Override
    public int addUsedBook(UsedBook usedBook) {
        return usedBookMapper.addUsedBook(usedBook);
    }

    @Override
    public int updateUsedBook(UsedBook usedBook) {
        return usedBookMapper.updateUsedBook(usedBook);
    }

    @Override
    public int deleteUsedBook(int id) {
        return usedBookMapper.deleteUsedBook(id);
    }
}
