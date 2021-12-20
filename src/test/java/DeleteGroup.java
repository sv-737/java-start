import org.testng.annotations.Test;


public class DeleteGroup extends CommonSteps {


  @Test
  public void testDeleteGroup() throws Exception {
    gotoGroupsPage();
    selectGroup();
    deleteGroup();
    gotoGroups();
    logout();
  }

}
