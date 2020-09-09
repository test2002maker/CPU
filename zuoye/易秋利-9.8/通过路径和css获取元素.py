#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')

#通过xpath获取元素
# e=dr.find_element_by_xpath("//input[@name='kw']")
# print(e.get_attribute('placeholder'))
# print(e.get_attribute('type'))

#通过css获取元素
e=dr.find_element_by_css_selector('a.red')
print(e.get_attribute('href'))

dr.quit()

