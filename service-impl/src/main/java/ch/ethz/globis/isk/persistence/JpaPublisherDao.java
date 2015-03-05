package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ch.ethz.globis.isk.domain.Publisher;
import ch.ethz.globis.isk.domain.jpa.JpaPublisher;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

@Repository
public class JpaPublisherDao extends JpaDao<String, Publisher> implements PublisherDao {

    @Override
    protected Class<JpaPublisher> getStoredClass() {
        return JpaPublisher.class;
    }

    @Override
    public Publisher createEntity() {
        return new JpaPublisher();
    }

    @Override
    public Publisher findOneByName(String name) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("name", new Filter(Operator.EQUAL, name));
        //TODO YAAAAWN...
        return findOneByFilter(filterMap);
    }

}
