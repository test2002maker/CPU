#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 二．页面滚动条，做成缓慢下拉的动画效果
from selenium import webdriver
import time
dr=webdriver.Firefox()
dr.get('https://www.qq.com')
dr.set_window_size(400,600)
time.sleep(2)
js='document.documentElement.scrollTop='#把滚动条拖到底部
# dr.execute_script(js)
for i in range(1,10000):
    n=i*1
    js1=js+str(n)
    dr.execute_script(js1)
time.sleep(3)
js="document.documentElement.scrollTop=0"#把滚动条拖到顶部
dr.execute_script(js)
# time.sleep(3)
# js="window.scrollTo(400,1000)"
# dr.execute_script(js)
time.sleep(2)
dr.quit()
