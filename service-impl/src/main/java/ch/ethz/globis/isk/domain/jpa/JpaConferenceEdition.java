package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.Conference;
import ch.ethz.globis.isk.domain.ConferenceEdition;
import ch.ethz.globis.isk.domain.Proceedings;

public class JpaConferenceEdition implements ConferenceEdition {

    private String id;

    private Integer year;

    private Conference conference;

    private Proceedings proceedings;

    public JpaConferenceEdition() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Proceedings getProceedings() {
        return proceedings;
    }

    public void setProceedings(Proceedings proceedings) {
        this.proceedings = proceedings;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ConferenceEdition{" +
                "id='" + getId() + '\'' +
                ", year=" + getYear() +
                '}';
    }
}
