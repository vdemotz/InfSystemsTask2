package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.JournalEdition;

public class JpaJournalEditionDao extends JpaDao<String, JournalEdition> implements JournalEditionDao {

	@Override
	public JournalEdition createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JournalEdition> findByJournalIdOrdered(String journalId) {
		// TODO Auto-generated method stub
		return null;
	}

}
