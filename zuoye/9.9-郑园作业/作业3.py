#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
with open('文件/11.txt', 'r', encoding='gbk') as a:
    b=a.read().split()[7]
    print(b)
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time
dr=webdriver.Firefox()
dr.get(b)
e=dr.find_element_by_name('kw')
e.send_keys('苹果')
e1=dr.find_element_by_class_name('fr')
e.send_keys(Keys.ENTER)
time.sleep(3)
e2=dr.find_element_by_link_text('苹果')
e2.click()
time.sleep(3)
e3=dr.find_element_by_link_text('加入购物车')
e3.click()
dr.get_screenshot_as_file('b.png')
dr.quit()