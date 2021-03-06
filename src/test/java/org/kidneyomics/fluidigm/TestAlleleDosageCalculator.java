package org.kidneyomics.fluidigm;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.kidneyomics.fluidigm.AlleleDosageCalculator;

public class TestAlleleDosageCalculator {

	Logger logger = Logger.getLogger(TestAlleleDosageCalculator.class);
	
	@Test
	public void test() {
		logger.info(AlleleDosageCalculator.getPValue(1000, 1000));
	}
	
	@Test
	public void test2() {
		logger.info(AlleleDosageCalculator.getPhredScaledPvalue(1900, 1000));
	}
	
	
	@Test
	public void test3() {
		logger.info(AlleleDosageCalculator.getPhredScaledPvalue(1,1));
		logger.info(AlleleDosageCalculator.getPValue(1,1));
	}

	@Test
	public void test4() {
		logger.info(AlleleDosageCalculator.getPhredScaledPvalue(1,2));
		logger.info(AlleleDosageCalculator.getPValue(1,2));
	}

}
