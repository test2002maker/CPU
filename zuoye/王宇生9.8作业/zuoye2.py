#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
import os
from zuoye1 import Hq
import time
# 第二题
m = Hq('http://39.96.181.61/qftest-ds/index.php?m=backend&c=main&a=index')
a1 = m.xpath('//*[@id="username"]', 'id')
print(a1)
a2 = m.css('a.btn', 'onclick')
print(a2)
m.quit()
# 第三题
n = Hq('file:///' + os.path.abspath('wy.html'))
print(n.ids('01', 'name'))
print(n.names('haha', 'type'))
print(n.links('lianjie', 'href'))
print(n.p_links('lainjie', 'href'))
print(n.tags('div', 'id'))
print(n.cls('a', 'id'))
print(n.xpaths('//form', 'id'))
print(n.cs_s('div.a', 'id'))
time.sleep(5)
n.quit()


