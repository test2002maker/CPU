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

class ZY():
    def __init__(self, add):
        self.driver = webdriver.Firefox()
        self.driver.get(add)

    def xpath(self, lj, value):
        a = self.driver.find_element_by_xpath(lj)
        return a.get_attribute(value)

    def css(self, cla, value):
        b = self.driver.find_element_by_css_selector(cla)
        return b.get_attribute(value)

    def quit(self):
        self.driver.quit()

    def ids(self, id, value):
        c = self.driver.find_elements_by_id(id)
        mylist = []
        for i in c:
            mylist.append(i.get_attribute(value))
        return mylist

    def names(self, name, value):
        d = self.driver.find_elements_by_name(name)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def links(self, link_t, value):
        d = self.driver.find_elements_by_link_text(link_t)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def p_links(self, p_link_t, value):
        d = self.driver.find_elements_by_partial_link_text(p_link_t)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def tags(self, tag_name, value):
        d = self.driver.find_elements_by_tag_name(tag_name)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def cls(self, cla, value):
        d = self.driver.find_elements_by_class_name(cla)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def xpaths(self, lj, value):
        d = self.driver.find_elements_by_xpath(lj)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist

    def cs_s(self, css, value):
        d = self.driver.find_elements_by_css_selector(css)
        mylist = []
        for i in d:
            mylist.append(i.get_attribute(value))
        return mylist
# 第二题
a=ZY('http://39.96.181.61/qftest-ds/')
print(a.xpath('//*[@id="top-userbar"]','class'))
print(a.css('a.red','href'))
a.quit()
# 第三题
n = ZY('file:///' + os.path.abspath('z2.html'))
print(n.ids('1', 'name'))
print(n.names('aaaaaa', 'type'))
print(n.links('abaaba', 'href'))
print(n.p_links('abaaba', 'href'))
print(n.tags('div', 'id'))
print(n.cls('a', 'id'))
print(n.xpaths('//form', 'id'))
print(n.cs_s('div.a', 'id'))
time.sleep(2)
n.quit()

