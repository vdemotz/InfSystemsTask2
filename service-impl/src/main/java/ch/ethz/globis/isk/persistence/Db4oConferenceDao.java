package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Conference;
import ch.ethz.globis.isk.domain.DomainConference;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class Db4oConferenceDao extends Db4oDao<String, Conference> implements ConferenceDao {
    @Autowired
    ProceedingsDao proceedingsDao;

    @Override
    protected Class<Conference> getStoredClass() {
        return Conference.class;
    }

    @Override
    public Conference createEntity() {
        return new DomainConference();
    }

    @Override
    public Conference findOneByName(String name) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put(PersistenceAttributes.NAME.toString(), new Filter(Operator.EQUAL, name));
        return findOneByFilter(filterMap);
    }

}
