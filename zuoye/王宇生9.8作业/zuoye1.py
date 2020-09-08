#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver


class Hq():
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




