#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 四．	把注册功能写成模块化
from selenium import webdriver
import time
def zc():
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    dr.find_element_by_link_text('免费注册').click()
    time.sleep(2)
    e=dr.find_element_by_id('username')
    e.send_keys('testabc1111111')
    time.sleep(2)
    e1=dr.find_element_by_id('email')
    e1.send_keys('12345321552@qq.com')
    time.sleep(2)
    e2=dr.find_element_by_id('password')
    e2.send_keys('123456')
    time.sleep(2)
    e3=dr.find_element_by_id('repassword')
    e3.send_keys('123456')
    time.sleep(2)
    dr.find_element_by_link_text('立即注册').click()
    #获取当前页面的url
    a=dr.current_url
    if a=='http://39.96.181.61/qftest-ds/user/register.html?step=submit':
        print('测试用例ok')
    else:
        print('测试用例没通过')
zc()
# dr.quit()
