#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#----------第二题----------
# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://news.baidu.com/')
# for i in range(0, 10000, 12):
#     dr.execute_script('document.documentElement.scrollTop=%d' % i)
# dr.quit()

#----------第三题----------
# from selenium import webdriver
# import time
# dr=webdriver.Firefox()
# def login():
#     dr.get('http://39.96.181.61/qftest-ds/')
#     dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a[1]').click()
#     dr.find_element_by_id('username').send_keys('qqq111')
#     dr.find_element_by_id('password').send_keys('123456')
#     dr.find_element_by_xpath('/html/body/div[2]/div/form/div/a').click()
#     time.sleep(8)
#
# def address():
#     from selenium.webdriver.support.select import Select
#     dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[1]/div/ul/li[5]/a').click()
#     time.sleep(2)
#     dr.find_element_by_xpath('//*[@id="newadrbtn"]').click()
#     dr.find_element_by_id('receiver').send_keys('qaq')
#     u=dr.find_element_by_xpath('//*[@id="areaslt-province"]')
#     list=Select(u)
#     list.select_by_visible_text('北京市')
#     v=dr.find_element_by_xpath('//*[@id="areaslt-city"]')
#     list=Select(v)
#     list.select_by_visible_text('市辖区')
#     w=dr.find_element_by_xpath('//*[@id="areaslt-borough"]')
#     list=Select(w)
#     list.select_by_visible_text('东城区')
#     dr.find_element_by_id('address').send_keys('sjfoiajeofja')
#     dr.find_element_by_id('mobile').send_keys('13923212174')
#     dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/button[1]').click()
#
# def logout():
#     from selenium.webdriver.common.action_chains import ActionChains
# # dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div[2]/div[1]/div/ul/li[3]/a').click()
#     e=dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a')
#     ActionChains(dr).move_to_element(e).perform()
#     time.sleep(4)
#     dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/div/ul/li[3]/a').click()
# if __name__=='__main__':
#     login()
#     time.sleep(4)
#     address()
#     time.sleep(8)
#     logout()
#     time.sleep(2)
#     dr.quit()

#----------第四题----------
from selenium import webdriver
import time
dr=webdriver.Firefox()
def register():
    dr.get('http://39.96.181.61/qftest-ds/index.html')
    dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a[2]').click()
    dr.find_element_by_id('username').send_keys('qqq112')
    dr.find_element_by_id('email').send_keys('djfioe19j@qq.com')
    dr.find_element_by_id('password').send_keys('666888')
    dr.find_element_by_id('repassword').send_keys('666888')
    dr.find_element_by_xpath('/html/body/div[2]/div/div/form/div/div[2]/a').click()
if __name__=='__main__':
    register()
    time.sleep(8)
    dr.quit()
