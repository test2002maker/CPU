#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
"""
二．页面滚动条，做成缓慢下拉的动画效果
"""
from selenium import webdriver
import time
dr=webdriver.Firefox()
dr.get('http://news.baidu.com/')
dr.set_window_size(450,800)
time.sleep(3)
for i in range(70):
    dr.execute_script('window.scrollBy(0,100)')
    time.sleep(0.5)
time.sleep(3)
dr.quit()

