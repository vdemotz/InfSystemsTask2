package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.InCollection;

public class JpaInCollectionDao extends JpaDao<String, InCollection> implements InCollectionDao  {

	@Override
	public InCollection createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InCollection findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InCollection> findByBookIdOrderByYear(String bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
