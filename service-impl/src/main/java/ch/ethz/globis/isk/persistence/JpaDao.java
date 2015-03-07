package ch.ethz.globis.isk.persistence;

import java.io.Serializable;
import java.util.Comparator;
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
import com.db4o.query.QueryComparator;

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
    	List<T> result =  queryByFilter(filterMap, null);
    	return result != null ? result.size() : null;
    }

    @Override
    public long count() {
    	List<T> result = queryByFilter(null, null);
    	return result != null ? result.size() : null;
    }

    @Override
    public Iterable<T> findAll() {
    	return queryByFilter(null, null);
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
    	List<T> result = queryByFilter(filterMap, null);
    	return result != null ? result.get(0) : null;
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap) {
    	return queryByFilter(filterMap, null);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap, int start, int size) {
    	return queryByFilter(filterMap, null, start, size);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList,
                                       int start, int size) {
    	return queryByFilter(filterMap, orderList, start, size);
    }

    @Override
    public Iterable<T> findAllByFilter(Map<String, Filter> filterMap,
                                       List<OrderFilter> orderList) {
    	return queryByFilter(filterMap, orderList);
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
    
    private List<T> queryByFilter(Map<String, Filter> filterMap, List<OrderFilter> orderList){
    	Query query = oc.query();
    	query.constrain(this.getStoredClass());
    	if (filterMap != null){
	    	for (String attribute : filterMap.keySet()){
	    		Constraint constraint = query.descend(attribute).constrain(filterMap.get(attribute).getValue());
	    		switch (filterMap.get(attribute).getOperator()){
		    		case STRING_MATCH:
		    			constraint.like();
		    			break;
		    		case EQUAL:
		    			constraint.equal();
		    			break;
	    		}
	    	}
    	}
    	if (orderList != null){
    		for (OrderFilter filter : orderList){
    			switch (filter.getOrder()){
	    			case ASC:
	    				query.descend(filter.getField()).orderAscending();
	    				break;
	    			case DESC:
	    				query.descend(filter.getField()).orderDescending();
	    				break;
    			}
    		}
    	}
    	List<T> result = query.execute();
    	return result;
    }
    
    private List<T> queryByFilter(Map<String, Filter> filterMap, List<OrderFilter> orderList,
            int start, int size){
    	List<T> result = queryByFilter(filterMap, orderList);
    	return result != null ? result.subList(start, Math.min(start + size, result.size())) : null;
    }
    
    ///;
    //Private methods
    ////
   
}
