package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.DomainBook;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class Db4oBookDao extends Db4oDao<String, Book> implements BookDao {
    @Override
    protected Class<Book> getStoredClass() {
        return Book.class;
    }

    @Override
    public Book createEntity() {
        return new DomainBook();
    }

    @Override
    public Book findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put(PersistenceAttributes.TITLE.toString(), new Filter(Operator.EQUAL, title));
        return findOneByFilter(filterMap);
    }

}
