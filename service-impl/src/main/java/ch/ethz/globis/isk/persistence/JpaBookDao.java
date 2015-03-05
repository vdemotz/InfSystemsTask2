package ch.ethz.globis.isk.persistence;

import ch.ethz.globis.isk.domain.Book;

public class JpaBookDao extends JpaDao<String, Book> implements BookDao {

	@Override
	public Book createEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findOneByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
