#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
with open('文件/11.txt', 'r', encoding='gbk') as a:
    b=a.read().split()[1]
    print(b)
with open('文件/11.txt', 'r', encoding='gbk') as a:
    b1=a.read().split()[3]
    print(b1)
with open('文件/11.txt', 'r', encoding='gbk') as a:
    b2=a.read().split()[5]
    print(b2)
from selenium import webdriver
import time
dr=webdriver.Firefox()
dr.get(b)
e=dr.find_element_by_name('username')
e.send_keys(b1)
e=dr.find_element_by_name('password')
e.send_keys(b2)
e=dr.find_element_by_class_name('btn.unslt')
e.click()
time.sleep(7)
dr.get_screenshot_as_file('a.png')
dr.quit()




