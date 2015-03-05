package ch.ethz.globis.isk.domain.jpa;

import java.util.Set;

import ch.ethz.globis.isk.domain.Book;
import ch.ethz.globis.isk.domain.InCollection;
import ch.ethz.globis.isk.domain.Person;
import ch.ethz.globis.isk.domain.Publisher;
import ch.ethz.globis.isk.domain.Series;

public class JpaBook extends JpaPublication implements Book{

	@Override
	public String getCdrom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCdrom(String cdrom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIsbn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIsbn(String isbn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getMonth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMonth(Integer month) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<InCollection> getPublications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublications(Set<InCollection> publications) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Publisher getPublisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublisher(Publisher publisher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Series getSeries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSeries(Series series) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVolume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVolume(String volume) {
		// TODO Auto-generated method stub
		
	}



}
