package ch.ethz.globis.isk.domain.jpa;

import java.util.Set;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.InCollection;
import ch.ethz.globis.isk.domain.Person;

public class JpaInCollection extends JpaPublication implements InCollection{

	@Override
	public String getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNote(String note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPages(String pages) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getParentPublication() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentPublication(Book book) {
		// TODO Auto-generated method stub
		
	}



}
