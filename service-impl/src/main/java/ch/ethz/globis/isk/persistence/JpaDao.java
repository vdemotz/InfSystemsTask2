package ch.ethz.globis.isk.persistence;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Constraint;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

import ch.ethz.globis.isk.config.PersistenceConfig;
import ch.ethz.globis.isk.domain.DomainObject;
import ch.ethz.globis.isk.domain.jpa.JpaDomainObject;
import ch.ethz.globis.isk.util.Filter;
import ch.ethz.globis.isk.util.OrderFilter;

@Repository
public abstract class JpaDao<K extends Serializable, T extends DomainObject> implements Dao<K, T> {
	
    @Autowired
    @Qualifier(PersistenceConfig.OC_QUALIFIER)
    ObjectContainer oc;

    @Override
    public long countAllByFilter(Map<String, Filter> filterMap) {
    	return queryByFilter(filterMap).size();
    }

    @Override
    public long count() {
    	return queryByFilter(new HashMap<String, Filter>()).size();
    }

    @Override
    public Iterable<T> findAll() {
    	return queryByFilter(new HashMap<String, Filter>());
    }

    @Override
    public T findOne(K id) {
    	Query query = oc.query();
    	query.constrain(this.getStoredClass());
    	query.descend("id").constrain(id);
    	ObjectSet<T> os = query.execute();
    	return os.get(0);
    }

    @Override
    public T findOneByFilter(Map<String, Filter> filterMap) {
    	return queryByFilter(filterMap).get(0);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap) {
    	return queryByFilter(filterMap);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap, int start, int size) {
    	//return null;
    	return queryByFilter(filterMap);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList,
                                       int start, int size) {
    	//return null;
    	return queryByFilter(filterMap);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList) {
    	//return null;
    	return queryByFilter(filterMap);
    }

    @Override
    public <S extends T> Iterable<S> insert(Iterable<S> entities) {
    	for (S entity : entities){
    		insert(entity);
    	}
    	return entities;
    }

    @Override
    public <S extends T> S insert(S entity) {
    	oc.store(entity);
    	return entity;
    }

    protected abstract <S extends T> Class<S> getStoredClass();

    protected List<T> queryByReferenceIdOrderByYear(String entity, String referenceName, String referenceId) {
    	if (! this.getStoredClass().getName().toLowerCase().contains(entity.toLowerCase())){
    		throw new IllegalArgumentException();
    	}
    	Query query = oc.query();
    	query.constrain(this.getStoredClass());
    	query.descend(referenceName).descend("id").constrain(referenceId);
    	return query.execute();
    }
    
    private List<T> queryByFilter(Map<String, Filter> filterMap){
    	Query query = oc.query();
    	Constraint constraints = query.constrain(this.getStoredClass());
    	if (filterMap != null){
	    	for (String attribute : filterMap.keySet()){
	    		 constraints.and(query.descend(attribute).constrain(filterMap.get(attribute).getValue()));
	    	}
    	}
    	List<T> result = query.execute();
    	return result.subList(0, 5);
    	//TODO: make this return all, add sublist shit to other parts
    }
    
    ////
    //Private methods
    ////
   
}
