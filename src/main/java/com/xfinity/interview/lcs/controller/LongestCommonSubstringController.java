package com.xfinity.interview.lcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xfinity.interview.lcs.model.LongestCommonSubstring;
import com.xfinity.interview.lcs.model.SetOfStrings;
import com.xfinity.interview.lcs.service.LongestCommonSubstringService;

@RestController
public class LongestCommonSubstringController {
	
	@Autowired
	private LongestCommonSubstringService lcsService;
	
	@RequestMapping("/lcs")
	public ResponseEntity<SetOfStrings> displaySetOfStrings() {
		return new ResponseEntity<SetOfStrings>(lcsService.getSetOfStrings(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, value="/lcs")
	public ResponseEntity<LongestCommonSubstring> findLcs(@RequestBody SetOfStrings sos) {
		return new ResponseEntity<LongestCommonSubstring>(lcsService.findLongestCommonSubstring(sos), HttpStatus.OK);
	}
	
}