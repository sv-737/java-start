import Data.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GStarting {
    private WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/viktorsergienko/Downloads/chromedriver");
        driver = new ChromeDriver();
        //baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //js = (JavascriptExecutor) driver;
        login("admin", "secret");
    }

    public void login(String login, String password){
        driver.get("http://localhost/addressbook/index.php");
        //driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(login);
        //driver.findElement(By.name("pass")).click();
        //driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }


    @Test
    public void testGrup() throws Exception {

        gotoGroupsPage();
        createNewGroup();
        fillParametersToNewGroup(new GroupData("test1", "test2", "test3"));
        submitNewGroupCreation();
        gotoGroups();
        logout();
    }

    private void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    private void gotoGroups() {
        driver.findElement(By.linkText("group page")).click();
    }

    private void submitNewGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }


    private void fillParametersToNewGroup(GroupData groupData) {
        //driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.groupName());
        //driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.groupTitle());
        //driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.groupDescription());
    }

    private void createNewGroup() {
        driver.findElement(By.name("new")).click();
    }

    private void gotoGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        // String verificationErrorString = verificationErrors.toString();
        // if (!"".equals(verificationErrorString)) {
        //   fail(verificationErrorString);
        //}
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
