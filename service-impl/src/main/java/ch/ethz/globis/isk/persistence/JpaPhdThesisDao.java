package ch.ethz.globis.isk.persistence;

import java.util.HashMap;
import java.util.Map;

import ch.ethz.globis.isk.domain.PhdThesis;
import ch.ethz.globis.isk.domain.jpa.JpaPhdThesis;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.Operator;

public class JpaPhdThesisDao extends JpaDao<String, PhdThesis> implements PhdThesisDao  {

    @Override
    protected Class<JpaPhdThesis> getStoredClass() {
        return JpaPhdThesis.class;
    }

    @Override
    public PhdThesis findOneByTitle(String title) {
        Map<String, Filter> filterMap = new HashMap<>();
        filterMap.put("title", new Filter(Operator.EQUAL, title));
        //TODO and I would save time to not write all theses todo points
        return findOneByFilter(filterMap);
    }

    @Override
    public PhdThesis createEntity() {
        return new JpaPhdThesis();
    }

}
