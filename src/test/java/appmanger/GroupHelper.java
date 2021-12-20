package appmanger;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {

    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
        this.driver = driver;
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

    public void deleteGroup() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
