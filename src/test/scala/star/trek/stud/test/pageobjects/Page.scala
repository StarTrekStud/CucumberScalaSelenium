package star.trek.stud.test.pageobjects

import org.openqa.selenium.WebDriver

/**
 * User: Dave
 * Date: 06/12/13
 */
abstract class Page(val driver: WebDriver) {
  def navigateToPage(url: String) {
    driver.get(url)
  }
}