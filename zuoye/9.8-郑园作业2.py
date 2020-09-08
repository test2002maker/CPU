#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 二．	在电商网上通过路径和css各找一个元素，并打印其他属性值
from selenium import webdriver
import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html2/zy.html'))
# e=dr.find_elements_by_xpath('//input[@name="cc"]')
# print(e[0].get_attribute('id'))
# dr.quit()

dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html2/zy.html'))
e=dr.find_elements_by_css_selector('p.z')
for i in e:
    print(i.get_attribute('id'))
dr.quit()
