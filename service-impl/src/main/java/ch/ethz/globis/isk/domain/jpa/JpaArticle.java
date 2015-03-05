package ch.ethz.globis.isk.domain.jpa;

import java.util.Set;

import ch.ethz.globis.isk.domain.Article;
import ch.ethz.globis.isk.domain.JournalEdition;
import ch.ethz.globis.isk.domain.Person;

public class JpaArticle extends JpaPublication implements Article{

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
	public JournalEdition getJournalEdition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setJournalEdition(JournalEdition journalEdition) {
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



}
