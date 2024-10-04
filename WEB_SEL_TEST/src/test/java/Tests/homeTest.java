
package Tests;

import Common.screenShot;
import Common.commonSetup;
import Data.validLoginDataProvider;
import Pages.homePage;
import Pages.loginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homeTest extends commonSetup {
    private static final Logger logger = LogManager.getLogger(commonSetup.class);
    loginPage login;
    homePage home;
    @Test(dataProvider="Datos Login",dataProviderClass= validLoginDataProvider.class)
    public void accountValid(String user, String pass) throws Exception {

    }

}
