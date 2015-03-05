package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.InProceedings;
import ch.ethz.globis.isk.domain.MasterThesis;
import ch.ethz.globis.isk.domain.School;

public class JpaMasterThesis extends JpaPublication implements MasterThesis {

	@Override
	public School getSchool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSchool(School school) {
		// TODO Auto-generated method stub
		
	}

}
