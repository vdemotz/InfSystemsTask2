package ch.ethz.globis.isk.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Article;
import ch.ethz.globis.isk.domain.JournalEdition;
import ch.ethz.globis.isk.domain.Person;
import ch.ethz.globis.isk.domain.Publication;
import ch.ethz.globis.isk.domain.jpa.JpaArticle;
import ch.ethz.globis.isk.persistence.JpaPublicationDao.SortByYearAscendingComparator;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaArticleDao extends JpaDao<String, Article> implements ArticleDao {
	
	@Autowired
	JournalEditionDao journalDao;

    @Override
    protected Class<JpaArticle> getStoredClass() {
        return JpaArticle.class;
    }

    @Override
    public Article createEntity() {
        return new JpaArticle();
    }

    @Override
    public Article findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO Hard coded string! ? ! O.O
        return findOneByFilter(filterMap);
    }

    @Override
    public List<Article> findByJournalEditionOrderedByYear(String journalEditionId) {
        JournalEdition edition = journalDao.findOne(journalEditionId);
        List<Article> pubs = new ArrayList<Article>(edition.getPublications());
        Collections.sort(pubs, new SortByYearAscendingComparator());
    	return pubs;
    }
}
