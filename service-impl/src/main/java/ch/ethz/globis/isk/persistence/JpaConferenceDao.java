package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ch.ethz.globis.isk.domain.Conference;
import ch.ethz.globis.isk.domain.jpa.JpaConference;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

public class JpaConferenceDao extends JpaDao<String, Conference> implements ConferenceDao {
    @Autowired
    ProceedingsDao proceedingsDao;

    @Override
    protected Class<JpaConference> getStoredClass() {
        return JpaConference.class;
    }

    @Override
    public Conference createEntity() {
        return new JpaConference();
    }

    @Override
    public Conference findOneByName(String name) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("name", new Filter(Operator.EQUAL, name));
        //TODO Nooo... Is it a joke? (see todo point in JpaBookDao)
        return findOneByFilter(filterMap);
    }

}
