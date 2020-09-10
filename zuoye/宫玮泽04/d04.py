#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# from selenium import webdriver
# import time
# dr=webdriver.Firefox()
# dr.get('https://www.qq.com')
# dr.find_element_by_link_text('Qmail').click()
# hs=dr.window_handles
# dr.switch_to.window(hs[1])
# time.sleep(2)
# iframeObj=dr.find_element_by_xpath('//*[@id="login_frame"]')
# print(iframeObj.get_attribute('name'))
# dr.switch_to.frame(iframeObj)
# time.sleep(2)
# dr.find_element_by_xpath('//*[@id="u"]').send_keys("76754438")
# time.sleep(2)
# #获取密码框元素并输入密码
# dr.find_element_by_xpath('//*[@id="p"]').send_keys("12345678")
# time.sleep(2)
# #点击登入
# dr.find_element_by_xpath('//*[@id="login_button"]').click()
# time.sleep(2)
#
# #切换回主体
# dr.switch_to.default_content()
#
# dr.find_element_by_link_text('基本版').click()
#
# time.sleep(2)
#
# dr.quit()

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

# def test01():
#     with open('1.txt', 'r', encoding='gbk') as f:
#         mylist = f.read().splitlines()
#         b=mylist[1]#后台地址
#         b1=mylist[3]#账号
#         b2=mylist[5]#密码
#     dr=webdriver.Firefox()
#     dr.get(b)
#     time.sleep(3)
#     e=dr.find_element_by_name('username')
#     e.send_keys(b1)
#     e=dr.find_element_by_name('password')
#     e.send_keys(b2)
#     e=dr.find_element_by_class_name('btn.unslt')
#     e.click()
#     time.sleep(7)
#     dr.get_screenshot_as_file('a.png')
#     dr.quit()
#
# # test01()
#
# def test02():
#     with open('1.txt', 'r', encoding='gbk') as f:
#         mylist = f.read().splitlines()
#         b = mylist[7]
#     dr = webdriver.Firefox()
#     dr.get(b)
#     time.sleep(2)
#     e = dr.find_element_by_name('kw')
#     e.send_keys('苹果')
#     time.sleep(3)
#     e.send_keys(Keys.ENTER)
#     time.sleep(3)
#     dr.find_element_by_link_text('苹果').click()
#     time.sleep(3)
#     dr.find_element_by_link_text('加入购物车').click()
#     dr.get_screenshot_as_file('b.png')
#     dr.quit()
#
# test02()
# from selenium import webdriver
# from selenium.webdriver.common.action_chains import ActionChains
# import time
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# dr.maximize_window()#最大化
#
# #获取元素
# e=dr.find_element_by_tag_name('span')
# # print(e.get_attribute('id'))
#
# #控制鼠标悬停到设置元素
# ActionChains(dr).move_to_element(e).perform()
# time.sleep(3)
#
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
#
# # 暂时将浏览器对象driver交给alter用
# dd=dr.switch_to.alert
# #获取警告框的文本信息
# print(dd.text)
# # accept()：接受现有警告框，就是点他的确定按钮
# # dd.accept()
# time.sleep(3)
#
# time.sleep(5)
# # ：放弃现有警告框，取消
# dd.dismiss()
# #
#
# # dr.quit()
# from selenium import webdriver
# import time
# dr=webdriver.Firefox()
# dr.get('https://www.hao123.com')
# dr.set_window_size(400,800)
# time.sleep(4)
# js='document.documentElement.scrollTop=10000'
# dr.execute_script(js)
# time.sleep(2)
# js='document.documentElement.scrollTop=0'
# dr.execute_script(js)
# time.sleep(2)
# js='window.scrollTo(100,0)'
# dr.execute_script(js)
# time.sleep(2)
# dr.quit()
# from selenium import webdriver
# import time
# from selenium.webdriver.common.keys import Keys
# dr=webdriver.Firefox()
# dr.get('http://39.96.181.61/qftest-ds/')
# dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a[2]').click()
# time.sleep(2)
# e=dr.find_element_by_id('username')
# e.send_keys('qqq111')
# a=dr.find_element_by_id('email')
# a.send_keys('qftycgv123@qq.com')
# b=dr.find_element_by_id('password')
# b.send_keys('123456')
# c=dr.find_element_by_id('repassword')
# c.send_keys('123456')
# dr.find_element_by_xpath('/html/body/div[2]/div/div/form/div/div[2]/a').click()
# time.sleep(10)
# d=dr.current_url
# if d=='http://39.96.181.61/qftest-ds/user/index.html':
#     print('成功')
# else:
#     print('不成功')
# time.sleep(2)
# dr.quit()
from selenium import webdriver
import time
dr=webdriver.Firefox()
def login():
    dr.get('http://39.96.181.61/qftest-ds/')
    dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a[1]').click()
    dr.find_element_by_id('username').send_keys('qqq111')
    dr.find_element_by_id('password').send_keys('123456')
    dr.find_element_by_xpath('/html/body/div[2]/div/form/div/a').click()
    time.sleep(8)
def logout():
    from selenium.webdriver.common.action_chains import ActionChains
# dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div[2]/div[1]/div/ul/li[3]/a').click()
    e=dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/a')
    ActionChains(dr).move_to_element(e).perform()
    time.sleep(4)
    dr.find_element_by_xpath('/html/body/div[1]/div/div[1]/div/ul/li[3]/a').click()
if __name__=='__main__':
    pass
    login()
    time.sleep(4)
    logout()
    time.sleep(2)
    dr.quit()
