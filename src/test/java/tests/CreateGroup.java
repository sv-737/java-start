package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class CreateGroup extends CommonSteps {


    @Test
    public void testGroup() throws Exception {

        app.gotoGroupsPage();
        app.createNewGroup();
        app.fillParametersToNewGroup(new GroupData("test1", "test2", "test3"));
        app.submitNewGroupCreation();
        app.gotoGroups();
        app.logout();
    }


}
