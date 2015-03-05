package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.Proceedings;

public class JpaProceedingsDao extends JpaDao<String, Proceedings> implements ProceedingsDao {

	@Override
	public Proceedings createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Proceedings findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
