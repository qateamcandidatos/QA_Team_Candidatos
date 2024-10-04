
package Tests;

import Common.commonSetup;
import Common.screenShot;
import Data.validLoginDataProvider;
import Pages.loginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends commonSetup {
    private static final Logger logger = LogManager.getLogger(commonSetup.class);
    loginPage login;
   @Test(dataProvider="Datos Login",dataProviderClass= validLoginDataProvider.class)
    public void loginValid(String user, String pass) throws Exception {
        try {
            login= new loginPage(driver);
            login.Credential(user, pass);
            Assert.assertTrue(loginPage.Visible());
            login.clickLogin();

            // Login
            logger.info("LOGGING INTO SITE");


         } catch (Exception e) {
              logger.error("lOGGING INTO SITE", e);
              screenShot.takeScreenShot(driver, "BTN_LOGIN");
              Assert.fail("Exception: " + e.getMessage());
        }
    }

}
