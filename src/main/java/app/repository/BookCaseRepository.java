package app.repository;

import app.entity.BookCase;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCaseRepository {
    public BookCase findById(Integer id);
}
