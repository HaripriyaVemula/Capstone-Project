from base_page import BasePage

class CartPage(BasePage):
    ITEM_ADDED_MESSAGE = (By.XPATH, "//div[text()='Item added to cart']")

    def verify_item_added(self):
        assert self.driver.find_element(*self.ITEM_ADDED_MESSAGE).is_displayed(), "Item added message is not displayed"



