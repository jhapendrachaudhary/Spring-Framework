package com.api.book.book;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.book;
import com.api.book.services.BookServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class BookController{

    @Autowired
    private BookServices bookServices;
  
    
// @RequestMapping(value="/books", method=RequestMethod.GET)
// @ResponseBody

// @GetMapping("/books")
// public book getBook() {
//     book book1 = new book();
//     book1.setBookId("1");
//     book1.setBookName("zbc");
//     book1.setBookAuthor("xyz");
//     return book1;
// }
@GetMapping("/books")
public ResponseEntity<List<book>> getBooks() {
    List<book> list =  this.bookServices.getAllBook();
    if (list.size()<=0) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    return ResponseEntity.of(Optional.of(list));
}
@GetMapping("/books/{id}")
public ResponseEntity<book> getBook(@PathVariable("id") int id) {
    book book1 =  bookServices.getBookById(id);
    if (book1 == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    return ResponseEntity.of(Optional.of(book1));
}

@PostMapping("/books")
public book postMethodName(@RequestBody book book1) {
    book b= this.bookServices.addBook(book1); 
    return b ;
}

@DeleteMapping("/books/{bookId}")
public void deleteBook(@PathVariable("bookId") int bookId){
    this.bookServices.deleteBook(bookId);
}

@PutMapping("/books/{bookId}")
public book putMethodName( @RequestBody book book1, @PathVariable("bookId") int bookId) {
    this.bookServices.updateBook(book1,bookId);
    return book1;
}

}