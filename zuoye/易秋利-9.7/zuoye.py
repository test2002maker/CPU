#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#后台登录名-id
# from selenium import webdriver
# d=webdriver.Firefox()
# d.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
# e=d.find_element_by_id('username')
# print(e.get_attribute('name'))
# print(e.get_attribute('type'))

#后台登录密-id
# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
# e1=d1.find_element_by_id('password')
# print(e1.get_attribute('name'))
# print(e1.get_attribute('type'))
# d1.quit()

#后台-商品列表-id
# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e1=d1.find_element_by_id('cate_id')
# print(e1.get_attribute('class'))
# d1.quit()
#
# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e1=d1.find_element_by_id('brand_id')
# print(e1.get_attribute('class'))
# d1.quit()
#
# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e1=d1.find_element_by_id('sort_id')
# print(e1.get_attribute('class'))
# d1.quit()

#通过name获取
# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
# e1=d1.find_element_by_name('username')
# print(e1.get_attribute('type'))
# d1.quit()

# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
# e1=d1.find_element_by_name('password')
# print(e1.get_attribute('type'))
# d1.quit()

# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/')
# e1=d1.find_element_by_name('kw')
# print(e1.get_attribute('type'))
# d1.quit()

# from selenium import webdriver
# d1=webdriver.Firefox()
# d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e1=d1.find_element_by_name('verydows-baseurl')
# print(e1.get_attribute('content'))
# d1.quit()

from selenium import webdriver
d1=webdriver.Firefox()
d1.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
e1=d1.find_element_by_name('old_password')
print(e1.get_attribute('id'))
print(e1.get_attribute('type'))
d1.quit()



#后台-超链接
# from selenium import webdriver
# d2=webdriver.Firefox()
# d2.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e2=d2.find_element_by_link_text('Verydows Panel')
# print(e2.get_attribute('href'))

# from selenium import webdriver
# d2=webdriver.Firefox()
# d2.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
# e2=d2.find_element_by_link_text('Verydows')
# print(e2.get_attribute('href'))


# from selenium import webdriver
# d2=webdriver.Firefox()
# d2.get('http://39.96.181.61/qftest-ds/')
# e2=d2.find_element_by_link_text('首页')
# print(e2.get_attribute('href'))


# from selenium import webdriver
# d2=webdriver.Firefox()
# d2.get('http://39.96.181.61/qftest-ds/')
# e2=d2.find_element_by_link_text('最新资讯')
# print(e2.get_attribute('href'))


# from selenium import webdriver
# d2=webdriver.Firefox()
# d2.get('http://39.96.181.61/qftest-ds/')
# e2=d2.find_element_by_link_text('dsfs')
# print(e2.get_attribute('href'))