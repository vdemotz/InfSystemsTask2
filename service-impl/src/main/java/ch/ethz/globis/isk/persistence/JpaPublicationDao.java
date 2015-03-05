package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.jpa.JpaPublication;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaPublicationDao extends JpaDao<String, Publication> implements PublicationDao {

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
        return queryByReferenceIdOrderByYear("Publication", "publisher", publisherId);
      //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
    }

    @Override
    public List<Publication> findBySchoolOrderedByYear(String schoolId) {
        return queryByReferenceIdOrderByYear("Publication", "school", schoolId);
      //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
    }

    @Override
    public List<Publication> findBySeriesOrderedByYear(String seriesId) {
        return queryByReferenceIdOrderByYear("Publication", "series", seriesId);
      //TODO This is a copied-pasted comment for the whole class. Don't use hard-coded strings!!!
    }

}
