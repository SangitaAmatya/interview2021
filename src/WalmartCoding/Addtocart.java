package WalmartCoding;

import java.util.Set;

import org.testng.annotations.BeforeTest;

public class Addtocart {

	
	mport java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class Amazon {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in");
	        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("soap");
	        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
	        driver.findElement(By.xpath("//*[contains(text(),'Park Avenue Soap')]")).click();
	        Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        driver.findElement(By.id("add-to-cart-button")).click();
	    }

	}
	public class AmazonTestCase {
	    static ChromeDriver driver = null;
	    static WebDriverWait wait = null;
	    
	    /**
	     * @throws java.lang.Exception
	     */
	    @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	        // Replace the path of chrome driver according to your setup
	        System.setProperty("webdriver.chrome.driver", "/Users/Niranjan/My Briefcase/My Development/eclipse_learning/SeleniumLearning/lib/webdrivers/chromedriver");
	        
	        driver = new ChromeDriver();
	    }
	    /**
	     * @throws java.lang.Exception
	     */
	    @Before
	    public void setUp() throws Exception {
	        driver.get("http://wwww.amazon.com");
	    }
	    @Test
	    public void testAddToCart() {
	        driver.get("http://wwww.amazon.com");
	        driver.findElementByLinkText("Today's Deals").click();
	        wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Today's Deals")));
	        
	        // Test
	        Assert.assertTrue(driver.getTitle().equals("Gold Box Deals | Today's Deals - Amazon.com"));
	        
	        driver.findElementById("a-autoid-1-announce").click();
	        wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));
	        
	        driver.findElementById("nav-cart").click();
	        wait = new WebDriverWait(driver, 2);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sc-active-cart")));
	        
	        // Test
	        Assert.assertTrue(driver.getTitle().equals("Amazon.com Shopping Cart"));
	    }
	    
	    @AfterClass
	    public static void CleanUp(){
	        driver.quit();
	    }
	}