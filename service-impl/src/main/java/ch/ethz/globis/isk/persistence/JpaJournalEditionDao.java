package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.JournalEdition;
import ch.ethz.globis.isk.domain.jpa.JpaJournalEdition;

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
//        String findAuthorsQuery = "Select je from JournalEdition je JOIN je.journal j " +
//                "WHERE j.id = :journalId ORDER BY je.year, je.volume, je.number ASC";
//        Query query = em.createQuery(findAuthorsQuery);
//        query.setParameter("journalId", journalId);
//        return query.getResultList();
    	//TODO sql into query by example
    	return null;
    }

}
