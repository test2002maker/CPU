#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver


class Hq():
    def __init__(self, add):
        self.driver = webdriver.Firefox()
        self.driver.get(add)

    def xpath(self, lj, value):
        a = self.driver.find_element_by_xpath(lj)
        return a.get_attribute(value)

    def css(self, cla, value):
        b = self.driver.find_element_by_css_selector(cla)
        return b.get_attribute(value)

    def quit(self):
        self.driver.quit()


m = Hq('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
a1 = m.xpath('//*[@id="username"]', 'id')
print(a1)
a2 = m.css('a.btn', 'onclick')
print(a2)
m.quit()