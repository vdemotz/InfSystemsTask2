package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.School;

public class JpaSchoolDao extends JpaDao<String, School> implements SchoolDao {

	@Override
	public School createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
