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


def login(url):
    driver.get(url)
    # 获取登入元素,并点击
    sleep(6)
    driver.find_element_by_link_text('登陆').click()
    sleep(2)
    # 获取用户名输入框,并输入数据
    driver.find_element_by_id('username').send_keys('wohaoshuaia')
    # 获取密码输入框,并输入数据
    driver.find_element_by_id('password').send_keys('wohaoshuaia')
    # 获取登入按键元素,并点击
    sleep(2)
    driver.find_element_by_link_text('登     陆').click()
    sleep(10)


def logout():
    from selenium.webdriver.common.action_chains import ActionChains
    a = driver.find_element_by_xpath('//*[@id="top-userbar"]/a')
    ActionChains(driver).move_to_element(a).perform()
    sleep(2)
    driver.find_element_by_link_text('退出')


if __name__ == '__main__':
    driver = webdriver.Firefox()
    # 调用登入函数
    login('http://39.96.181.61/qftest-ds/')
    sleep(2)
    # 调用退出函数
    logout()
    # 关闭浏览器
    sleep(2)
    driver.quit()
