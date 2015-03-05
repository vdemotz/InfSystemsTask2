package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.Conference;

public class JpaConferenceDao extends JpaDao<String, Conference> implements ConferenceDao {

	@Override
	public Conference createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conference findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
