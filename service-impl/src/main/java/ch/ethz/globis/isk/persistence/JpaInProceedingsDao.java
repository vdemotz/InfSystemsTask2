package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.InProceedings;

public class JpaInProceedingsDao extends JpaDao<String, InProceedings> implements InProceedingsDao {

	@Override
	public InProceedings createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InProceedings findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InProceedings> findByProceedingsIdOrderByYear(
			String proceedingsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
