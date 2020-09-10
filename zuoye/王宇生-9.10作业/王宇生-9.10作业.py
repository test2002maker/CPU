#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
from time import sleep
import xlrd
# 二．页面滚动条，做成缓慢下拉的动画效果
# def gd(url, sudu):
#     driver = webdriver.Firefox()
#     driver.get(url)
#     for i in range(0, 10000, sudu):
#         driver.execute_script('document.documentElement.scrollTop=%d' % i)
# gd('http://www.qq.com', 10)

# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
# driver = webdriver.Firefox()
#
#
# def login(url):
#     driver.get(url)
#     # 获取登入元素,并点击
#     sleep(6)
#     driver.find_element_by_link_text('登陆').click()
#     sleep(2)
#     # 获取用户名输入框,并输入数据
#     driver.find_element_by_id('username').send_keys('wohaoshuaia')
#     # 获取密码输入框,并输入数据
#     driver.find_element_by_id('password').send_keys('wohaoshuaia')
#     # 获取登入按键元素,并点击
#     sleep(2)
#     driver.find_element_by_link_text('登     陆').click()
#     sleep(10)
#
#
# def add_add():
#     from selenium.webdriver.support.select import Select
#     sleep(3)
#     driver.find_element_by_link_text('收件地址').click()
#     sleep(3)
#     driver.find_element_by_id('newadrbtn').click()
#     sleep(3)
#     driver.find_element_by_id('receiver').send_keys('宫玮泽')
#     u = driver.find_element_by_xpath('//*[@id="areaslt-province"]')
#     Select(u).select_by_visible_text('天津市')
#     v = driver.find_element_by_xpath('//*[@id="areaslt-city"]')
#     Select(v).select_by_visible_text('市辖区')
#     w = driver.find_element_by_xpath('//*[@id="areaslt-borough"]')
#     Select(w).select_by_visible_text('河东区')
#     driver.find_element_by_id('address').send_keys('宫玮泽家')
#     driver.find_element_by_id('zip').send_keys('123123')
#     driver.find_element_by_id('mobile').send_keys('13838381438')
#     driver.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/button[1]').click()
#
#
# def logout():
#     from selenium.webdriver.common.action_chains import ActionChains
#     a = driver.find_element_by_xpath('/html/body/div[1]/div/div[1]/a')
#     ActionChains(driver).move_to_element(a).perform()
#     sleep(2)
#     driver.find_element_by_link_text('退出')
#
#
# if __name__ == '__main__':
#     driver = webdriver.Firefox()
#     # 调用登入函数
#     login('http://39.96.181.61/qftest-ds/')
#     # 调用退出函数
#     sleep(8)
#     add_add()
#     # 关闭浏览器
#     sleep(8)
#     logout()
#     driver.quit()

# 四．把注册功能写成模块化
driver = webdriver.Firefox()


def ds_zc(file):
    a = xlrd.open_workbook(file)
    b = a.sheets()[0]
    mylist = []
    for i in range(b.nrows):
        data = b.row_values(i)
        mylist.append(data[0])
    driver = webdriver.Firefox()
    # 打开网站
    driver.get('http://39.96.181.61/qftest-ds/')
    # 获取免费注册元素并点击
    sleep(2)
    driver.find_element_by_link_text('免费注册').click()
    # 获取用户名输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('username').send_keys(mylist[0])
    # 获取邮箱输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('email').send_keys(mylist[1])
    # 获取密码输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('password').send_keys(mylist[2])
    # 获取确认密码输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('repassword').send_keys(mylist[3])

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

ds_zc('data.xlsx')