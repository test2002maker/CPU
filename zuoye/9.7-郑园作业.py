#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# 1.简述自动化测试流程？
# 答：1、自动测试流程2、测试工具获取3、自动化测试引入4、指定测试计划5、测试执行与管理6、测试审评和评估
# 2.简述自动化测试的优势和局限性？
# 优势：1、可重复2、可程序化3、可靠4、提高测试的精准度5、提升测试资源的利用率
# 局限性：1、需要依赖脚本和代码的实现。如果脚本和代码没有让程序自动进行判断，工具程序永远不会发现bug
# 2、程序中没有涉及到的测试点，不做测试，因此会漏掉一部分缺陷
# 3.请在电商网站上找10个元素,用id和name方式获取,打印元素除id和name外的其他属性,提交到git上
from selenium import webdriver
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# z=dr.find_element_by_id("cartbar")
# print(z.get_attribute("href"))
# dr.quit()
dr=webdriver.Firefox()
dr.get('http://39.96.181.61/qftest-ds/')
z=dr.find_element_by_name("keywords")
print(z.get_attribute("content"))
dr.quit()
# 4.电商网站上找5个超链接元素,通过超链接文字获取元素,打印链接地址,提交到git上
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# e=dr.find_element_by_link_text('小白')
# print(e.get_attribute('href'))
# dr.quit()

