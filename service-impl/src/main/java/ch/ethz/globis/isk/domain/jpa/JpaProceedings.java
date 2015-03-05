package ch.ethz.globis.isk.domain.jpa;

import java.util.Set;

import ch.ethz.globis.isk.domain.ConferenceEdition;
import ch.ethz.globis.isk.domain.InProceedings;
import ch.ethz.globis.isk.domain.Proceedings;
import ch.ethz.globis.isk.domain.Publisher;
import ch.ethz.globis.isk.domain.Series;

public class JpaProceedings extends JpaPublication implements Proceedings {

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
	public Integer getNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNumber(Integer number) {
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
	public String getVolume() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVolume(String volume) {
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
	public Series getSeries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSeries(Series series) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConferenceEdition getConferenceEdition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConferenceEdition(ConferenceEdition conferenceEdition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<InProceedings> getPublications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPublications(Set<InProceedings> publications) {
		// TODO Auto-generated method stub
		
	}

}
