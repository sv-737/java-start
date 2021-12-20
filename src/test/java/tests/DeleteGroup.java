package tests;

import org.testng.annotations.Test;


public class DeleteGroup extends CommonSteps {


  @Test
  public void testDeleteGroup() throws Exception {
    app.gotoGroupsPage();
    app.selectGroup();
    app.deleteGroup();
    app.gotoGroups();
    app.logout();
  }

}
