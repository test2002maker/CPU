#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#案例:在百度首页上用xpath随便找一个元素,并打印这个元素的其他属性值
# from selenium import webdriver
# d=webdriver.Firefox()
# d.get('http://www.baidu.com')
# e=d.find_element_by_xpath('//textarea[1]')
# print(e.get_attribute('id'))

#案例:在百度上找一个元素,用css方式
# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# # e=dr.find_element_by_css_selector('a.mnav')
# e=dr.find_element_by_css_selector('a.mnav.c-font-normal.c-color-t')
# print(e.get_attribute('href'))
# dr.quit()

#自己写一个html文件,定义两个id属性值相同的标签,通过id获取多个元素,然后打印出各自其他的属性
# from selenium import webdriver
# import os
# import time
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html1/02.html'))
# e=dr.find_elements_by_id('d1')
# print(type(e))
# print(e[0].get_attribute('name'))
# print(e[1].get_attribute('name'))
# time.sleep(3)
# dr.quit()

#案例:自己写一个html文件,定义两个name属性值相同的标签,通过name获取多个元素,然后打印出各自其他的属性
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html1/03.html'))
# e=dr.find_elements_by_name('div1')
# print(e[0].get_attribute('id'))

#超链接
# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_elements_by_link_text('苹果')
# print(len(e))
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#子链接
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html/06.html'))
# e=dr.find_elements_by_partial_link_text('aaaa')
# for i in e:
#     print(i.get_attribute('href'))
# dr.quit()

#标签名
#案例:获取淘宝首页有多少个div,并打印出div里的id属性值
# from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# e=dr.find_elements_by_tag_name('div')
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()

#案例:自己写一个有类样式的html页面,定义段落和链接标签,引用类样式,然后通过本函数获取这两个标签的其他属性
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html1/04.html'))
# e=dr.find_elements_by_class_name('s1')
# print(len(e))
# for i in e:
#     print(i.get_attribute('id'))
# dr.quit()

#xpath获取
# from selenium import webdriver
# import os
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('html1/04.html'))
# # e=dr.find_elements_by_xpath('/html/body/div/span[1]')
# # e=dr.find_elements_by_xpath('//span[1]')
# e=dr.find_elements_by_xpath('//div[span/@class="s1"]')
# # e=dr.find_elements_by_xpath('//span[@id="p1"]')
# for i in e:
#     print(i.get_attribute('name'))
#
# dr.quit()


