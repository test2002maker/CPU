#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 引入模块
from selenium import webdriver
from time import sleep
# 获取浏览器
driver = webdriver.Firefox()
# 打开网站
driver.get('http://39.96.181.61/qftest-ds/')
# 获取免费注册元素并点击
sleep(2)
driver.find_element_by_link_text('免费注册').click()
# 获取用户名输入框,并输入数据
sleep(2)
driver.find_element_by_id('username').send_keys('wohaoshuaia')
# 获取邮箱输入框,并输入数据
sleep(2)
driver.find_element_by_id('email').send_keys('wohaoshuaia@163.com')
# 获取密码输入框,并输入数据
sleep(2)
driver.find_element_by_id('password').send_keys('wohaoshuaia')
# 获取确认密码输入框,并输入数据
sleep(2)
driver.find_element_by_id('repassword').send_keys('wohaoshuaia')

# 获取'立即注册'元素,并点击
driver.find_element_by_link_text('立即注册').click()
# 获取当前页面的url
sleep(10)
a = driver.current_url
# 进行判断http://39.96.181.61/qftest-ds/user/index.html
if a == 'http://39.96.181.61/qftest-ds/user/index.html':
    print('测试用例通过')
else:
    print('测试用例未通过')
# 关闭浏览器
sleep(2)
driver.quit()


