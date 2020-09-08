package test.java.yaksha;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.yaksha.LaptopCollectors;
import main.java.yaksha.TestUtils;

class LaptopCollectorsTest {

	@Test
	void testAddLaptopDetails() throws IOException {
		 //assertEquals(true, LaptopCollectors.addLaptopDetails());
		 TestUtils.yakshaAssert(TestUtils.currentTest(),LaptopCollectors.addLaptopDetails()==true==true?"true":"false",TestUtils.businessTestFile);

	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);

	             

	}

	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);

	}

}
