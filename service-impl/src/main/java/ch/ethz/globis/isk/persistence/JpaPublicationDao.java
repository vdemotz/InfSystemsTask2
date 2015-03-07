package ch.ethz.globis.isk.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.db4o.query.Query;

import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.Publisher;
import ch.ethz.globis.isk.domain.School;
import ch.ethz.globis.isk.domain.Series;
import ch.ethz.globis.isk.domain.jpa.JpaPublication;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaPublicationDao extends JpaDao<String, Publication> implements PublicationDao {
	
	@Autowired
	JpaSchoolDao schoolDao;
	
	@Autowired
	JpaSeriesDao seriesDao;
	
	@Autowired
	JpaPublisherDao publisherDao;

    @Override
    protected Class<JpaPublication> getStoredClass() {
        return JpaPublication.class;
    }

    @Override
    public Publication createEntity() {
        return new JpaPublication();
    }

    @Override
    public Publication findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
        return findOneByFilter(filterMap);
    }

    @Override
    public List<Publication> findByAuthorIdOrderedByYear(String authorId) {
        return queryByReferenceIdOrderByYear("Publication", "authors", authorId);
      //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
    }

    @Override
    public List<Publication> findByEditorIdOrderedByYear(String editorId) {
        return queryByReferenceIdOrderByYear("Publication", "editors", editorId);
      //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
    }

    @Override
    public List<Publication> findByPublisherOrderedByYear(String publisherId) {
    	Publisher publisher = publisherDao.findOne(publisherId);
        List<Publication> pubs = new ArrayList<Publication>(publisher.getPublications());
        Collections.sort(pubs, new SortByYearAscendingComparator());
    	return pubs;
    }

    @Override
    public List<Publication> findBySchoolOrderedByYear(String schoolId) {
        School school = schoolDao.findOne(schoolId);
        List<Publication> pubs = new ArrayList<Publication>(school.getPublications());
        Collections.sort(pubs, new SortByYearAscendingComparator());
    	return pubs;
    }

    @Override
    public List<Publication> findBySeriesOrderedByYear(String seriesId) {
    	Series series = seriesDao.findOne(seriesId);
        List<Publication> pubs = new ArrayList<Publication>(series.getPublications());
        Collections.sort(pubs, new SortByYearAscendingComparator());
    	return pubs;
    }
    
    private class SortByYearAscendingComparator implements Comparator<Publication>{
    	@Override
		public int compare(Publication o1, Publication o2) {
			return o1.getYear().compareTo(o2.getYear());
		}
    }

}
