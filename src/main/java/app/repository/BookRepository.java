package app.repository;

import app.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    public List<Book> find(Integer index,Integer limit);
    public Integer count();
}
