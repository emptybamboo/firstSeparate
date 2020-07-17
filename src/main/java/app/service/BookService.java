package app.service;

import app.entity.BookVO;

public interface BookService {
    public BookVO findByPage(Integer page);
}
