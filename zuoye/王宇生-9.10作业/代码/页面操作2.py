#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# from selenium import webdriver
# from time import sleep
# driver = webdriver.Firefox()
#
 # 页面内frame切换
# # 打开qq的首页
# driver.get('https://www.qq.com')
# # 点击邮件图标
# driver.find_element_by_link_text('Qmail').click()
# # 切换到邮箱页面
# sleep(2)
# hs = driver.window_handles
# driver.switch_to.window(hs[1])
# # 获取邮箱页面里的小窗口
# sleep(2)
# b = driver.find_element_by_xpath('//*[@id="login_frame"]')
# driver.switch_to.frame(b)
# sleep(5)
# if driver.find_element_by_id('switcher_plogin'):
#     driver.find_element_by_id('switcher_plogin').click()
#     sleep(5)
# # 获取输入框元素并输入qq号码
# driver.find_element_by_id('u').send_keys('37863454')
# # 获取密码框元素并输入密码
# driver.find_element_by_id('p').send_keys('37863454')
# # 点击登入
# driver.find_element_by_id('login_button').click()
# # 切换回主体
# sleep(3)
# driver.switch_to.default_content()
# # 点击邮箱页面的基本版
# driver.find_element_by_link_text('基本版').click()
# sleep(3)
# driver.quit()

# 警告框处理
# from selenium import webdriver
# from selenium.webdriver.common.action_chains import ActionChains
# from time import sleep
#
# driver = webdriver.Firefox()
# driver.get('http://www.baidu.com')
# sleep(2)
# a = driver.find_element_by_id('s-usersetting-top')
# sleep(2)
# ActionChains(driver).move_to_element(a).perform()
# driver.find_element_by_link_text('搜索设置').click()
# sleep(2)
# driver.find_element_by_id('nr_2').click()
# sleep(2)
# driver.find_element_by_link_text('保存设置').click()
# sleep(2)
# ale = driver.switch_to.alert
# print(ale.text)
# sleep(2)
# # ale.accept()
# # sleep(2)
# ale.dismiss()
# sleep(2)
# driver.quit()

# 元素等待
from selenium import webdriver
from time import sleep

# 隐式等待
# driver = webdriver.Firefox()
# driver.get('http://www.baidu.com')
# driver.implicitly_wait(10)
# driver.find_element_by_id('kw').send_keys('hahaha')
# driver.implicitly_wait(10)
# driver.find_element_by_id('su').click()
# sleep(2)
# driver.quit()

# 显式等待
# from selenium.webdriver.support.ui import WebDriverWait
# import sys
#
# driver = webdriver.Firefox()
# driver.get('https://www.baidu.com')
# driver.find_element_by_id('kw')
# try:
#     dd = WebDriverWait(driver, 5, 0.5, ignored_exceptions=None).until()

# 页面滚动条操作
# from selenium import webdriver
# from time import sleep
#
# driver = webdriver.Firefox()
# driver.get('https://www.hao123.com')
# sleep(3)
# driver.execute_script('document.documentElement.scrollTop=10000')
# sleep(3)
# driver.execute_script('document.documentElement.scrollTop=0')
# sleep(3)
# driver.set_window_size(400, 600)
# sleep(2)
# driver.execute_script('window.scrollTo(200,300)')
# sleep(3)
# driver.quit()





