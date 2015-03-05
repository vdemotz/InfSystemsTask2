package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.Person;

public class JpaPersonDao extends JpaDao<String, Person> implements PersonDao  {

	@Override
	public Person createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
