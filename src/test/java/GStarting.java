import Data.GroupData;
import org.testng.annotations.Test;

public class GStarting extends CommonSteps {


    @Test
    public void testGroup() throws Exception {

        gotoGroupsPage();
        createNewGroup();
        fillParametersToNewGroup(new GroupData("test1", "test2", "test3"));
        submitNewGroupCreation();
        gotoGroups();
        logout();
    }


}
