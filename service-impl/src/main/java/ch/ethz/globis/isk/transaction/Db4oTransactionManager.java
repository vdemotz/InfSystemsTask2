package ch.ethz.globis.isk.transaction;

import org.springframework.stereotype.Component;

@Component
public class Db4oTransactionManager extends CacheAwareTransactionManager {

    @Override
    public void rollback() {

    }

    @Override
    public void begin() {
        //no need for explicit begin
    }

    @Override
    public void commit() {

    }
}