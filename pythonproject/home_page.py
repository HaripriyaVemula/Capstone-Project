
from base_page import BasePage

class HomePage(BasePage):
    SEARCH_BOX = (By.XPATH, "//input[@name='q']")
    SEARCH_BUTTON = (By.XPATH, "//button[@type='submit']")
    FIRST_PRODUCT = (By.XPATH, "//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div")
    FLIPKART_TITLE = (By.XPATH, "//*[@id='container']//picture/img")

    def search_product(self, product_name):
        self.driver.find_element(*self.SEARCH_BOX).send_keys(product_name)
        self.driver.find_element(*self.SEARCH_BUTTON).click()
        self.click_first_product()

    def click_first_product(self):
        self.driver.find_elements(*self.FIRST_PRODUCT)[0].click()
        self.switch_to_new_window()
        return self

    def assert_page_title(self):
        title = self.driver.find_element(*self.FLIPKART_TITLE).get_attribute("title")
        assert title == "Flipkart", "Page title is not 'Flipkart'"
        return self

