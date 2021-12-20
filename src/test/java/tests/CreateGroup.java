package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class CreateGroup extends CommonSteps {


    @Test
    public void testGroup() throws Exception {

        app.getNavigationHelper().gotoGroupsPage();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillParametersToNewGroup(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitNewGroupCreation();
        app.getGroupHelper().gotoGroups();
        app.logout();
    }


}
