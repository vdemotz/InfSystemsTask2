package ch.ethz.globis.isk.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.db4o.query.Query;

import ch.ethz.globis.isk.domain.ConferenceEdition;
import ch.ethz.globis.isk.domain.JournalEdition;
import ch.ethz.globis.isk.domain.jpa.JpaConferenceEdition;

@Repository
public class JpaConferenceEditionDao extends JpaDao<String, ConferenceEdition> implements ConferenceEditionDao {

    @Override
    protected Class<JpaConferenceEdition> getStoredClass() {
        return JpaConferenceEdition.class;
    }

    @Override
    public ConferenceEdition createEntity() {
        return new JpaConferenceEdition();
    }

    @Override
    public List<ConferenceEdition> findByConferenceOrderedByYear(String conferenceId) {
    	Query query = oc.query();
    	query.constrain(this.getStoredClass());
    	query.descend("conference").descend("id").constrain(conferenceId);
    	query.descend("year").orderAscending();
    	List<ConferenceEdition> result = query.execute();
    	return result;
    }

}
