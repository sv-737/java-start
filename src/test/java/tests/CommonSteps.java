package tests;

import appmanger.ApplicationManger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CommonSteps {

    protected final ApplicationManger app = new ApplicationManger();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
