package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.jpa.JpaBook;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

public class JpaBookDao extends JpaDao<String, Book> implements BookDao {
    @Override
    protected Class<JpaBook> getStoredClass() {
        return JpaBook.class;
    }

    @Override
    public Book createEntity() {
        return new JpaBook();
    }

    @Override
    public Book findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO Seriously? Hard-coded string?
        return findOneByFilter(filterMap);
    }

}
