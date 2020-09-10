#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 三．登入电商系统，然后添加收件地址，然后退出电商系统，每个用例都写成模块化。
from selenium import webdriver
import time
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.select import Select
def login(dr):
    dr.find_element_by_link_text('登陆').click()
    time.sleep(2)
    e = dr.find_element_by_id('username')
    e.send_keys('testabc11111')
    time.sleep(2)
    e2 = dr.find_element_by_id('password')
    e2.send_keys('123456')
    time.sleep(2)
    dr.find_element_by_link_text('登     陆').click()
    time.sleep(4)
def tj(dr):
    # e=dr.find_element_by_class_name('m')
    #     # ActionChains(dr).move_to_element(e).perform()
    #     # time.sleep(2)
    # dr.find_element_by_link_text('进入用户中心').click()
    dr.find_element_by_link_text('收件地址').click()
    dr.find_element_by_id('newadrbtn').click()
    dr.find_element_by_id('receiver').send_keys('zz')
    time.sleep(2)
    e=dr.find_element_by_id('areaslt-province')
    list=Select(e)
    list.select_by_visible_text('广东省')
    time.sleep(2)
    e1=dr.find_element_by_name('city')
    list1=Select(e1)
    list1.select_by_visible_text('深圳市')
    time.sleep(2)
    e2=dr.find_element_by_id('areaslt-borough')
    list2=Select(e2)
    list2.select_by_visible_text('宝安区')
    time.sleep(2)
    dr.find_element_by_id('address').send_keys('后瑞村北三巷欢乐居')
    time.sleep(2)
    dr.find_element_by_id('zip').send_keys('999666')
    time.sleep(2)
    dr.find_element_by_id('mobile').send_keys('15865478996')
    time.sleep(2)
    dr.find_element_by_xpath('//button[@class="sm-green"]').click()
    time.sleep(5)
    a=dr.current_url
    if a=='http://39.96.181.61/qftest-ds/consignee/list.html':
        print('测试用例ok')
    else:
        print('测试失败')
    time.sleep(2)
def logout(dr):
    e=dr.find_element_by_xpath('//*[@id="top-userbar"]/a')
    time.sleep(2)
    ActionChains(dr).move_to_element(e).perform()
    time.sleep(2)
    dr.find_element_by_link_text('退出').click()
if __name__ == '__main__':
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    login(dr)
    time.sleep(3)
    tj(dr)
    time.sleep(2)
    logout(dr)
    time.sleep(2)
    dr.quit()

#有一个问题，第二个函数用过鼠标悬停，在第三个函数想再次用，会报错