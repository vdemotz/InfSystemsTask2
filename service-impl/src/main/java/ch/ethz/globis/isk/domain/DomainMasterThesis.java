package ch.ethz.globis.isk.domain;

import ch.ethz.globis.isk.domain.MasterThesis;
import ch.ethz.globis.isk.domain.School;

public class DomainMasterThesis extends DomainPublication implements MasterThesis {

    private School school;

    public DomainMasterThesis() { }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}