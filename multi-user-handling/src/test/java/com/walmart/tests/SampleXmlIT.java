package com.walmart.tests;









import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;

/**
 * This is a sample Citrus integration test for loading XML syntax test case.
 *
 * @author Citrus
 */

public class SampleXmlIT extends TestNGCitrusTestRunner {
	
	
	@Test
    @CitrusXmlTest(packageScan = "com.walmart.resources")
    public void sampleXml() {}
}
