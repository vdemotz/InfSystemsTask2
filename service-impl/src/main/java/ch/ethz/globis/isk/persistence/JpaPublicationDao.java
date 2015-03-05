package ch.ethz.globis.isk.persistence;

import java.util.List;

import ch.ethz.globis.isk.domain.Publication;

public class JpaPublicationDao extends JpaDao<String, Publication> implements PublicationDao {

	@Override
	public Publication createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Publication findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findByAuthorIdOrderedByYear(String authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findByEditorIdOrderedByYear(String editorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findByPublisherOrderedByYear(String publisherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findBySchoolOrderedByYear(String schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Publication> findBySeriesOrderedByYear(String seriesId) {
		// TODO Auto-generated method stub
		return null;
	}

}
