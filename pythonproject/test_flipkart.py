import pytest
from pages import HomePage, ProductPage, CartPage

@pytest.mark.usefixtures("driver")  
class TestFlipkart:
    def test_add_to_cart(self, driver):
        home_page = HomePage(driver)
        home_page.search_product("Macbook air m2")
        product_page = home_page.click_first_product().assert_page_title()
        cart_page = product_page.add_to_cart()
        cart_page.verify_item_added()
