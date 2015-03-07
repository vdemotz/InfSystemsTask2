package ch.ethz.globis.isk.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.db4o.query.Query;

import ch.ethz.globis.isk.domain.JournalEdition;
import ch.ethz.globis.isk.domain.jpa.JpaJournalEdition;

@Repository
public class JpaJournalEditionDao extends JpaDao<String, JournalEdition> implements JournalEditionDao {

    @Override
    protected Class<JpaJournalEdition> getStoredClass() {
        return JpaJournalEdition.class;
    }

    @Override
    public JournalEdition createEntity() {
        return new JpaJournalEdition();
    }

    @Override
    public List<JournalEdition> findByJournalIdOrdered(String journalId) {
    	Query query = oc.query();
    	query.constrain(this.getStoredClass());
    	query.descend("journal").descend("id").constrain(journalId);
    	query.descend("year").orderAscending();
    	query.descend("volume").orderAscending();
    	query.descend("number").orderAscending();
    	List<JournalEdition> result = query.execute();
    	return result;
    }

}
