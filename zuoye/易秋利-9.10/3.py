#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
"""
三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
"""
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.select import Select
import time
dr=webdriver.Firefox()
#登录
def login(dr,url):
    dr.get(url)
    # 获取登入元素,并点击
    dr.find_element_by_link_text('登陆').click()
    time.sleep(2)
    # 获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys('test04')
    time.sleep(2)
    # 获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys('123456')
    time.sleep(2)
    # 获取登入按键元素,并点击
    dr.find_element_by_link_text('登     陆').click()
    time.sleep(8)

login(dr,'http://39.96.181.61/qftest-ds/')



#添加收件地址
def addr(dr):
    dr.find_element_by_link_text('收件地址').click()
    time.sleep(2)
    dr.find_element_by_id('newadrbtn').click()
    time.sleep(2)
    dr.find_element_by_id('receiver').send_keys('test004a')
    time.sleep(2)
    list1('areaslt-province','广东省')#省
    time.sleep(2)
    list1('areaslt-city','深圳市')#市
    list1('areaslt-borough', '南山区')  # 区
    time.sleep(2)
    dr.find_element_by_id('address').send_keys('花园小区')
    time.sleep(2)
    dr.find_element_by_id('zip').send_keys('000000')
    time.sleep(2)
    dr.find_element_by_id('mobile').send_keys('13187659096')
    time.sleep(2)
    dr.find_element_by_class_name('sm-green').click()
    time.sleep(6)

def list1(id,text):
    e=dr.find_element_by_id(id)
    listobj = Select(e)
    listobj.select_by_visible_text(text)

addr(dr)


# 退出电商系统
def logout(dr):
    # 获取退出登入元素,并点击
    # dr.find_element_by_link_text('退出登录').click()
    # 获取用户名元素,并进行鼠标悬停,然后获取退出元素,并进行点击
    e=dr.find_element_by_class_name('m')
    ActionChains(dr).move_to_element(e).perform()
    time.sleep(3)
    dr.find_element_by_link_text('退出').click()
    time.sleep(3)
logout(dr)