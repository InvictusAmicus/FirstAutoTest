package testingweek;


import org.junit.*;

public class JUnitExample
{
	// runs as the first thing in the class
	@BeforeClass
	public static void init()
	{
		System.out.println("Before class");
	}

	@Before // runs before every test method
	public void setUp()
	{
		System.out.println("Before");
	}

	@Test //specifies that this is a method to be tested
	public void printTest()
	{
		System.out.println("Test");
	}

	@After // runs after every test method
	public void cleanUp()
	{
		System.out.println("After");
	}

	@AfterClass // runs as the last thing in the class
	public static void tearDown()
	{
		System.out.println("After class");
	}
}
