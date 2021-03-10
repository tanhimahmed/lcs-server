package com.xfinity.interview.lcs.model;

import java.util.Collections;
import java.util.Set;

public class LongestCommonSubstring {

	private Set<StringNode> lcs;
	
	public LongestCommonSubstring() {
		super();
		this.lcs = Collections.emptySet();
	}
	
	public LongestCommonSubstring(Set<StringNode> lcs) {
		super();
		this.lcs = lcs;
	}
	
	public Set<StringNode> getLcs() {
		return lcs;
	}
	
	public void setLcs(Set<StringNode> lcs) {
		this.lcs = lcs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lcs == null) ? 0 : lcs.hashCode());
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
		LongestCommonSubstring other = (LongestCommonSubstring) obj;
		if (lcs == null) {
			if (other.lcs != null)
				return false;
		} else if (!lcs.equals(other.lcs))
			return false;
		return true;
	}
}