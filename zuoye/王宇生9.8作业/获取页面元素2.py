#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
import os
import time
# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('/html/body/form[1]')
# time.sleep(2)
# print(a.get_attribute('id'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//form[1]')
# time.sleep(2)
# print(a.get_attribute('id'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//form[@id="01"]')
# time.sleep(2)
# print(a.get_attribute('method'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//form[input/@name="bu"]')
# time.sleep(2)
# print(a.get_attribute('method'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//input[@name="bu"]')
# time.sleep(2)
# print(a.get_attribute('type'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//form[@id="01"]/input[1]')
# time.sleep(2)
# print(a.get_attribute('type'))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_xpath('//input[@name="bu"]')
# time.sleep(2)
# print(a.get_attribute('type'))
# driver.quit()

# 案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
# driver = webdriver.Firefox()
# driver.get('http://www.baidu.com')
# a = driver.find_element_by_xpath('//*[@id="kw"]')
# time.sleep(2)
# print(a.get_attribute('name'))
# driver.quit()

# 案例:自己写个有超链接的标签,通过class样式,找到该标签的href属性值
# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_element_by_css_selector('a.hahaha')
# time.sleep(2)
# print(a.get_attribute('href'))
# driver.get('http://www.baidu.com')
# b = driver.find_element_by_css_selector('input.s_ipt')
# time.sleep(2)
# print(b.get_attribute('name'))
# driver.quit()

# 自己写一个html文件,定义两个id属性值相同的标签,通过id获取多个元素,然后打印出各自其他的属性
# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_elements_by_id('hh')
# for i in a:
#     print(i.get_attribute('href'))
# driver.quit()

# 案例:自己写一个html文件,定义两个name属性值相同的标签,通过name获取多个元素,然后打印出各自其他的属性
# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_elements_by_name('haha')
# for i in a:
#     print(i.get_attribute('id'))
# time.sleep(2)
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('http://39.96.181.61/qftest-ds/')
# a = driver.find_elements_by_link_text('烧猪')
# print(len(a))
# driver.quit()

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_elements_by_link_text('bi')
# print(len(a))
# for i in a:
#     print(i.get_attribute('href'))
# driver.quit()

# 案例:获取淘宝首页有多少个div,并打印出div里的id属性值


# driver = webdriver.Firefox()
# driver.get('http://www.taobao.com')
# a = driver.find_elements_by_tag_name('div')
# print(len(a))
# for i in a:
#     print(i.get_attribute('id'))
# driver.quit()


# 案例:自己写一个有类样式的html页面,定义段落和链接标签,引用类样式,然后通过本函数获取这两个标签的其他属性
# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h02.html'))
# a = driver.find_elements_by_class_name('css')
# for i in a:
#     print(i.get_attribute('id'))
# driver.quit()

'''
1./html/body/form[1] --该路径下第一个form
2.//form[1] --html下第一个form
4.//form[input/@name='username'] --form里有input,input里的属性name是叫username的,第一个form,找的是form
7.//input[@name='continue'][@type='submit'] --type属性为'submit',name属性为'continue'的第一个input元素
'''

# driver = webdriver.Firefox()
# driver.get('file:///' + os.path.abspath('html02/h03.html'))
# a = driver.find_elements_by_xpath('//form')
# b = driver.find_elements_by_xpath('/html/body/form/input')
# c = driver.find_elements_by_xpath('//form[input/@type="text"]')
# for i in a:
#     print(i.get_attribute('name'))
# for i in b:
#     print(i.get_attribute('name'))
# for i in c:
#     print(i.get_attribute('name'))
# driver.quit()
