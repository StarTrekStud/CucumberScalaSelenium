package star.trek.stud.test.cucumber.stepdefs

import cucumber.api.scala.{ScalaDsl, EN}
import org.openqa.selenium.firefox.FirefoxDriver
import cucumber.runtime.Runtime

/**
 * User: Dave
 * Date: 06/12/13
 */
class SetUpAndTearDown extends ScalaDsl with EN {

  Before() {
    driver = new FirefoxDriver()
  }

  After() {
    driver.close()
  }

}