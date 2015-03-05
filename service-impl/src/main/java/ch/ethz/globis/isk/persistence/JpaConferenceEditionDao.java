package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.ConferenceEdition;

public class JpaConferenceEditionDao extends JpaDao<String, ConferenceEdition> implements ConferenceEditionDao {

	@Override
	public ConferenceEdition createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ConferenceEdition> findByConferenceOrderedByYear(
			String conferenceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
