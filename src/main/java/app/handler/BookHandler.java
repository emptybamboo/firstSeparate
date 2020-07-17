package app.handler;

import app.entity.BookVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.service.BookService;

@RestController
@RequestMapping("/book")
public class BookHandler {
    @Autowired
    private BookService bookService;

    @GetMapping("/findByPage/{page}")
    public BookVO findByPage(@PathVariable("page") Integer page){
        BookVO vo = bookService.findByPage(page);
        return vo;
    }
}
