package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.Series;

public class JpaSeriesDao extends JpaDao<String, Series> implements SeriesDao {

	@Override
	public Series createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Series findOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
