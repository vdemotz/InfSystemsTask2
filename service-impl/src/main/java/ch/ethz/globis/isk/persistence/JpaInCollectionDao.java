package ch.ethz.globis.isk.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.InCollection;
import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.Series;
import ch.ethz.globis.isk.domain.jpa.JpaInCollection;
import ch.ethz.globis.isk.domain.jpa.JpaPublication;
import ch.ethz.globis.isk.persistence.JpaPublicationDao.SortByYearAscendingComparator;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaInCollectionDao extends JpaDao<String, InCollection> implements InCollectionDao  {
	
	@Autowired
	BookDao bookDao;

    @Override
    public InCollection findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO Yes, I will put a comment at each hard-coded string
        return findOneByFilter(filterMap);
    }

    @Override
    public List<InCollection> findByBookIdOrderByYear(String bookId) {
        Book book = bookDao.findOne(bookId);
        List<InCollection> pubs = new ArrayList<InCollection>(book.getPublications());
        Collections.sort(pubs, new JpaPublicationDao.SortByYearAscendingComparator());
    	return pubs;
    }

    @Override
    protected Class<JpaInCollection> getStoredClass() {
        return JpaInCollection.class;
    }

    @Override
    public InCollection createEntity() {
        return new JpaInCollection();
    }

}
