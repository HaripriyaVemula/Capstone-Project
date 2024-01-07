import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

@pytest.fixture(scope="session")
def driver():
    driver = webdriver.Chrome()  # Replace with your preferred browser driver
    driver.maximize_window()
    driver.get("https://www.flipkart.com/")
    yield driver
    driver.quit()
