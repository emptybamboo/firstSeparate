package app.service.implement;

import app.entity.BookVO;
import app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.service.BookService;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    private Integer limit = 10;

    @Override
    public BookVO findByPage(Integer page) {
        Integer index = (page-1)*limit;
        BookVO bookVO = new BookVO();
        bookVO.setData(bookRepository.find(index,limit));
        bookVO.setTotal(bookRepository.count());
        bookVO.setPageSize(limit);
        return bookVO;
    }
}
