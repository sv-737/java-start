package tests;

import org.testng.annotations.Test;


public class DeleteGroup extends CommonSteps {


  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().gotoGroupsPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().gotoGroups();
    app.logout();
  }

}
