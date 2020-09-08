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
dr=webdriver.Firefox()
dr.get('file:///'+os.path.abspath('html2/zy.html'))
e=dr.find_elements_by_id('11')
f=dr.find_elements_by_id('11')
z1=dr.find_elements_by_name('nn')
z2=dr.find_elements_by_name('nn')
a1=dr.find_elements_by_link_text('baidu')
b1=dr.find_elements_by_partial_link_text('zzzz')
c1=dr.find_elements_by_tag_name('form')
d1=dr.find_elements_by_class_name('z')
f1=dr.find_elements_by_xpath('//input[@name="zz"][@type="text"]')
e1=dr.find_elements_by_css_selector('p.z')
def x():
        for i in e:
            print(i.get_attribute('name'))
        for i in f:
            print(i.get_attribute('class'))
        for i in z1:
            print(i.get_attribute('id'))
        for i in z2:
            print(i.get_attribute('value'))
        for i in a1:
            print(i.get_attribute('href'))
        for i in b1:
            print(i.get_attribute('name'))
        for i in c1:
            print(i.get_attribute('method'))
        for i in d1:
            print(i.get_attribute('id'))
        for i in f1:
            print(i.get_attribute('value'))
        for i in e1:
            print(i.get_attribute('value'))

x()
time.sleep(1)
dr.quit()






