#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
import sys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions as EC
from selenium import webdriver
import time
import csv
# dr=webdriver.Firefox()
# #1、页面中多个窗口切换操作
# #打开qq的首页
# dr.get('https://www.qq.com')
# #点击邮件图标
# dr.find_element_by_link_text('Qmail').click()
# #切换到邮箱页面
# hs=dr.window_handles#获取浏览器中所有页面的句柄
# dr.switch_to.window(hs[1])#切换到邮箱页面
# time.sleep(2)
# #获取邮箱页面里的小窗口
# iframeObj=dr.find_element_by_xpath('//*[@id="login_frame"]')
# # print(iframeObj.get_attribute('name'))
# #切换到frame
# dr.switch_to.frame(iframeObj)
# time.sleep(2)
# #获取输入框元素并输入qq号码
# dr.find_element_by_xpath('//*[@id="u"]').send_keys("76754438")
# time.sleep(2)
# #获取密码框元素并输入密码
# dr.find_element_by_xpath('//*[@id="p"]').send_keys("12345678")
# time.sleep(2)
# #点击登入
# dr.find_element_by_xpath('//*[@id="login_button"]').click()
# time.sleep(2)
# #切换回主体
# dr.switch_to.default_content()
# #点击邮箱页面的基本版
# dr.find_element_by_link_text('基本版').click()
# time.sleep(2)
# dr.quit()
#
# #2、警告框处理
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# dr.maximize_window()#最大化
# #获取元素
# e=dr.find_element_by_tag_name('span')
# #控制鼠标悬停到设置元素
# ActionChains(dr).move_to_element(e).perform()
# time.sleep(3)
# #点击搜索设置
# dr.find_element_by_link_text('搜索设置').click()
# time.sleep(3)
# #选择显示20条
# e=dr.find_element_by_id('nr_2')
# e.click()
# # print(e.get_attribute('name'))
# time.sleep(4)
# #点击保存设置按键
# dr.find_element_by_link_text('保存设置').click()
# time.sleep(3)
# # 暂时将浏览器对象driver交给alter用
# dd=dr.switch_to.alert
# #获取警告框的文本信息
# print(dd.text)
# # accept()：接受现有警告框，就是点他的确定按钮
# # dd.accept()
# time.sleep(3)
# # ：放弃现有警告框，取消
# dd.dismiss()
# # dr.quit()
#
# #3元素等待
# dr = webdriver.Firefox()
# time.sleep(3)  #强制等待
# # 隐式等待
# # 在使用隐式等待的时候，实际上浏览器会在你自己设定的时间内部不断的刷新页面去寻找我们需要
# # dr.implicitly_wait(10)
# dr.get('https://www.baidu.com')
# dr.find_element_by_id('kw')
# # 显示等待
# try:
#     ele = WebDriverWait(dr, 5, 0.5, ignored_exceptions=None).until(EC.presence_of_element_located((By.ID, "kw")), "找不到")
#     ele.send_keys("selenium")
#     time.sleep(3)
# except:
#     print(sys.exc_info())
#
# #4、页面滚动条操作
# dr=webdriver.Firefox()
# dr.get('https://www.hao123.com/')
# dr.set_window_size(400,800)
# time.sleep(3)
# #把滚动条拖到底部
# js="document.documentElement.scrollTop=10000"
# dr.execute_script(js)
# time.sleep(2)
# #把滚动条拖到顶部
# js="document.documentElement.scrollTop=0"
# dr.execute_script(js)
# time.sleep(2)
# js="window.scrollTo(100,200)"
# dr.execute_script(js)
# time.sleep(2)
#
# # 5、线性脚本开发
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# time.sleep(2)
# dr.find_element_by_link_text('免费注册').click()
# time.sleep(3)
# dr.find_element_by_id('username').send_keys('test2')
# time.sleep(2)
# dr.find_element_by_id('email').send_keys('test2@qq.com')
# time.sleep(2)
# dr.find_element_by_id('password').send_keys('123456')
# time.sleep(2)
# dr.find_element_by_id('repassword').send_keys('123456')
# time.sleep(2)
# dr.find_element_by_link_text('立即注册').click()
# time.sleep(8)
# #获取当前页面的url
# url=dr.current_url
# print(url)
# #进行判断http://39.96.181.61/qftest-ds/user/index.html
# if url=='http://39.96.181.61/qftest-ds/user/index.html':
#     print("测试用例ok")
# else:
#     print("测试用例错误")
# time.sleep(5)
# dr.quit()
#
# # 6、模块化驱动测试开发
# def login(dr):
#     dr.find_element_by_link_text('登陆').click()
#     time.sleep(2)
#     dr.find_element_by_id('username').send_keys('test2')
#     dr.find_element_by_id('password').send_keys('123456')
#     dr.find_element_by_link_text('登     陆').click()
#
# def logout(dr):
#     #获取用户名元素,并进行鼠标悬停,然后获取退出元素,并进行点击
#     e=dr.find_element_by_xpath('//*[@id="top-userbar"]/a')
#     ActionChains(dr).move_to_element(e).perform()
#     dr.find_element_by_link_text('退出').click()
#
# if __name__=='__main__':
#     dr=webdriver.Firefox()
#     dr.get('http://39.96.181.61/qftest-ds/')
#     time.sleep(2)
#     #调用登入函数
#     login(dr)
#     time.sleep(5)
#     #调用退出函数
#     logout(dr)
#     time.sleep(5)
#     dr.quit()

# 7、数据驱动测试开发
with open('data.csv','r',encoding='utf-8') as f:
    data=csv.reader(f)
    mylist = []
    for d in data:
        mylist.append(d[0])
    print(mylist)
    dr=webdriver.Firefox()
    dr.get('http://39.96.181.61/qftest-ds/')
    time.sleep(2)
    dr.find_element_by_link_text('免费注册').click()
    time.sleep(3)
    dr.find_element_by_id('username').send_keys(mylist[0])
    time.sleep(2)
    dr.find_element_by_id('email').send_keys(mylist[1])
    time.sleep(2)
    dr.find_element_by_id('password').send_keys(mylist[2])
    time.sleep(2)
    dr.find_element_by_id('repassword').send_keys(mylist[3])
    time.sleep(2)
    dr.find_element_by_link_text('立即注册').click()
    time.sleep(9)
    #获取断言的url
    myurl=mylist[4]
    if dr.current_url==myurl:
        print("测试用例ok")
    else:
        print("测试用例错误")
    time.sleep(2)
    dr.quit()
