#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====

# 案例:用xls存储数据的方式驱动脚本开发
# excel存储数据进行数据驱动（熟练使用）：
#     先安装xlrd模块：cmd  ->  pip3 install xlrd
# 从excel文件中读入数据：
#     1、导包，import xlrd
#     2、使用xlrd的方法打开excel文件（创建一个文件对象）
#     3、获取excel文件的sheet页
#     4、获取sheet页中的行数据、列数据、单元格数据
#     5、需要遍历数据，你先要直到文件中有多少行、多少列数据
#     6、使用for循环遍历
import xlrd
from selenium import webdriver
from time import sleep


def login(file):
    a = xlrd.open_workbook(file)
    b = a.sheets()[0]
    mylist = []
    for i in range(b.nrows):
        data = b.row_values(i)
        mylist.append(data[0])
    driver = webdriver.Firefox()
    # 打开网站
    driver.get('http://39.96.181.61/qftest-ds/')
    # 获取免费注册元素并点击
    sleep(2)
    driver.find_element_by_link_text('免费注册').click()
    # 获取用户名输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('username').send_keys(mylist[0])
    # 获取邮箱输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('email').send_keys(mylist[1])
    # 获取密码输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('password').send_keys(mylist[2])
    # 获取确认密码输入框,并输入数据
    sleep(2)
    driver.find_element_by_id('repassword').send_keys(mylist[3])

    # 获取'立即注册'元素,并点击
    driver.find_element_by_link_text('立即注册').click()
    # 获取当前页面的url
    sleep(10)
    a = driver.current_url
    # 进行判断http://39.96.181.61/qftest-ds/user/index.html
    if a == 'http://39.96.181.61/qftest-ds/user/index.html':
        print('测试用例通过')
    else:
        print('测试用例未通过')
    # 关闭浏览器
    sleep(2)
    driver.quit()


login('data/shuai.xls')










