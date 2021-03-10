package com.xfinity.interview.lcs.model;

import java.util.Collections;
import java.util.Set;

public class SetOfStrings {

	private Set<StringNode> setOfStrings;
	
	public SetOfStrings() {
		super();
		this.setOfStrings = Collections.emptySet();
	}
	
	public SetOfStrings(Set<StringNode> setOfStrings) {
		super();
		this.setOfStrings = setOfStrings;
	}
	
	public Set<StringNode> getSetOfStrings() {
		return setOfStrings;
	}
	
	public void setSetOfStrings(Set<StringNode> setOfStrings) {
		this.setOfStrings = setOfStrings;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((setOfStrings == null) ? 0 : setOfStrings.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetOfStrings other = (SetOfStrings) obj;
		if (setOfStrings == null) {
			if (other.setOfStrings != null)
				return false;
		} else if (!setOfStrings.equals(other.setOfStrings))
			return false;
		return true;
	}
}