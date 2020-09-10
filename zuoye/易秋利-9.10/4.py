#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
"""
四．把注册功能写成模块化
"""
#引入模块
from selenium import webdriver
import time
dr=webdriver.Firefox()

def register(dr,url):
    dr.get(url)
    #获取免费注册元素并点击
    dr.find_element_by_link_text('免费注册').click()
    time.sleep(2)
    #获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys('test05')
    time.sleep(1)
    #获取邮箱输入框,并输入数据
    dr.find_element_by_id('email').send_keys('test05@qq.com')
    time.sleep(1)
    #获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys('123456')
    time.sleep(1)
    #获取确认密码输入框,并输入数据
    dr.find_element_by_id('repassword').send_keys('123456')
    time.sleep(1)
    #获取'立即注册'元素,并点击
    dr.find_element_by_link_text('立即注册').click()
    time.sleep(6)


register(dr,'http://39.96.181.61/qftest-ds/')

#关闭浏览器
dr.quit()



