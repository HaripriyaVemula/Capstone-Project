from base_page import BasePage

class ProductPage(BasePage):
    ADD_TO_CART_BUTTON = (By.XPATH, "//button[text()='Add to cart']")

    def add_to_cart(self):
        self.driver.find_element(*self.ADD_TO_CART_BUTTON).click()
        self.switch_to_new_window()
        return CartPage(self.driver)  # Return CartPage instance
