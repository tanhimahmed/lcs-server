package com.xfinity.interview.lcs.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.xfinity.interview.lcs.exception.SetContainsDuplicateException;
import com.xfinity.interview.lcs.model.LongestCommonSubstring;
import com.xfinity.interview.lcs.model.SetOfStrings;
import com.xfinity.interview.lcs.model.StringNode;

@Service
public class LongestCommonSubstringService {

	private SetOfStrings setOfStrings = new SetOfStrings(Stream.of(
			new StringNode("comcast"),
			new StringNode("communicate"),
			new StringNode("commutation")).collect(Collectors.toSet()));
	
	public SetOfStrings getSetOfStrings() {
		return setOfStrings;
	}
	
	public LongestCommonSubstring findLongestCommonSubstring(SetOfStrings sos) {
				
		LongestCommonSubstring result = new LongestCommonSubstring();
		
		// get number of words from set of strings
		int n = sos.getSetOfStrings().size();
				
		// generate a list of Strings from the set of StringNodes
		List<String> stringList = new ArrayList<String>(n);
		for(StringNode node : sos.getSetOfStrings()) {
			stringList.add(node.getValue());
		}
		
		// convert list of Strings to set of Strings, compare size to check for duplicate entries
		// throw an exception to handle input with duplicate values
		Set<String> stringSet = new HashSet<>(stringList);
		if(stringList.size() != stringSet.size())
			throw new SetContainsDuplicateException();
		
		// start with the first word in set
		String s = stringList.get(0);
		int stringLength = s.length(); 
		
		String lcs = "";		
		
		for (int i = 0; i < stringLength; i++) {
			for (int j = i + 1; j <= stringLength; j++) {
				
				// generate possible substrings from reference word
				String commonSubstring = s.substring(i, j);
				int k = 1;
				for (k = 1; k < n; k++) {
					// check if generated substring is common to all words in set
					if (!stringList.get(k).contains(commonSubstring))
						break;
				}
				
				// update lcs result if substring is present in all words and greater than the current result
				if (k == n && lcs.length() < commonSubstring.length())
					lcs = commonSubstring;
			}
		}
		
		result.setLcs(Stream.of(new StringNode(lcs)).collect(Collectors.toSet()));
		
		return result;
	}
	
}