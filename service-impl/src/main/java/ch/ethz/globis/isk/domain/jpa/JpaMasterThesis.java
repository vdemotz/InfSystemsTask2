package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.MasterThesis;
import ch.ethz.globis.isk.domain.School;

public class JpaMasterThesis extends JpaPublication implements MasterThesis {

    private School school;

    public JpaMasterThesis() { }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}