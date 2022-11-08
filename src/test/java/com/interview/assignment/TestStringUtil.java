package com.interview.assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestStringUtil {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddMinutes() {
		
		String isValid1 = StringUtil.isValid("zzooppkkkjjee");
		
		Assert.assertEquals("isValid1 value for zzooppkkkjjee is incorrect: " + isValid1, "YES", isValid1);
		
		String isValid2 = StringUtil.isValid("kkiiiiiee");
		
		Assert.assertEquals("isValid2 value for kkiiiiiee is incorrect: " + isValid2, "NO", isValid2);
		
		String isValid3 = StringUtil.isValid("abcdefghhgfedecba");
		
		Assert.assertEquals("isValid3 value for abcdefghhgfedecba is incorrect: " + isValid3, "YES", isValid3);
		
		String isValid4 = StringUtil.isValid("abccc");
		
		Assert.assertEquals("isValid4 value for abccc is incorrect: " + isValid4, "NO", isValid4);
		
		String isValid5 = StringUtil.isValid("aabbbcd");
		
		Assert.assertEquals("isValid5 value for aabbbcd is incorrect: " + isValid5, "NO", isValid5);
		
		String isValid6 = StringUtil.isValid("aabbcd");
		
		Assert.assertEquals("isValid6 value for aabbcd is incorrect: " + isValid6, "NO", isValid6);
		
		String isValid7 = StringUtil.isValid("aabbcccdddd");
		
		Assert.assertEquals("isValid7 value for aabbcccdddd is incorrect: " + isValid7, "NO", isValid7);
		
		
	}

}
