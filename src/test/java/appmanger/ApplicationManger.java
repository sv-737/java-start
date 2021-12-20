package appmanger;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManger {
    private WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/viktorsergienko/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    public void login(String login, String password){
        driver.get("http://localhost/addressbook/index.php");
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    public void gotoGroups() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitNewGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillParametersToNewGroup(GroupData groupData) {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.groupName());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.groupTitle());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.groupDescription());
    }

    public void createNewGroup() {
        driver.findElement(By.name("new")).click();
    }

    public void gotoGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        driver.quit();
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

    public void deleteGroup() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
