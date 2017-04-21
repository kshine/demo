package com.freedom.b_di;

/**
 * Created by kuiyuxiang on 2017/4/12.
 */
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

    public void addBook() {
        this.bookDao.save();
    }

    public BookServiceImpl(){
        //默认加载
        System.out.println("BookServiceImpl 被new了");
    }
}
