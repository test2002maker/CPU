
#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
dr=webdriver.Firefox()

#通过id获取
# dr.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e=dr.find_elements_by_id('cate_id')
# for i in e:
#     print(i.get_attribute('class))

#通过name获取
# dr.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e=dr.find_elements_by_name('id')
# for i in e:
#     print(i.get_attribute('type'))
#     print(i.get_attribute('value'))

#通过超链接获取
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_elements_by_link_text('小白')
# for i in e:
#     print(i.get_attribute('href'))

#通过子链接获取
dr.get('http://39.96.181.61/qftest-ds/')
e=dr.find_elements_by_partial_link_text('[美食专栏]诗词')
for i in e:
    print(i.get_attribute('href'))

#通过标签名获取
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_elements_by_tag_name('div')
# for i in e:
#     print(i.get_attribute('class'))

#通过class获取
# dr.get('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=panel')
# e=dr.find_elements_by_class_name('blue')
# for i in e:
#     print(i.get_attribute('href'))

#通过xpath获取
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_elements_by_xpath(//div[font/@class='topper-userbar f1'])
# for i in e:
#     print(i.get_attribute('id'))

dr.quit()