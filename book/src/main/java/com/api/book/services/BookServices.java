package com.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.Dao.BookRepository;
import com.api.book.entities.book;

@Component
public class BookServices {
    @Autowired
    private BookRepository bookRepository;
    // private static List<book> list = new ArrayList<>();

    // static {
        
    //     list.add(new book(2000, "head to java", "xyz"));
    //     list.add(new book(1000, "Java References", "abc"));
    //     list.add(new book(9000, "Effective java", "psq"));
    // }

    public List<book> getAllBook() {
        
        List<book> list = (List<book>)this.bookRepository.findAll();
        return list;
    }

    public book getBookById(int id) {
        book book1 = null;
        try{
        // book1 = list.stream().filter(e -> e.getBookId() == id).findFirst().get();
        book1 = this.bookRepository.findByBookId(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return book1;
    }

    public book addBook(book b) {
        // list.add(b);
        book result = bookRepository.save(b);
        return result;
    }

    public void deleteBook(int bid) {
        // list = list.stream().filter(book -> book.getBookId() != bid).collect(Collectors.toList());
        bookRepository.deleteById(bid);
    }

    public void updateBook(book book1, int bookId){
        // list = list.stream().map(e-> { if(e.getBookId() == bookId){
        //     e.setBookName(book1.getBookName());
        //     e.setBookAuthor(book1.getBookAuthor());
        // } return e;}).collect(Collectors.toList());
        book1.setBookId(bookId);
        bookRepository.save(book1);
    }
}
