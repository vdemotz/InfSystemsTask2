package ch.ethz.globis.isk.domain.jpa;

import ch.ethz.globis.isk.domain.DomainObject;

public class JpaDomainObject implements DomainObject {

	protected String id;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

}
