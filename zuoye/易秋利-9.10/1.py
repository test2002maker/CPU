#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#多个窗口的切换

from selenium import webdriver
import time
dr=webdriver.Firefox()
#打开QQ首页
dr.get('http://www.qq.com/')
time.sleep(3)
#点击页面右上角邮箱图标
dr.find_element_by_link_text('Qmail').click()
time.sleep(2)
#切换到邮箱页面
hs=dr.window_handles #获取浏览器所有的句柄
dr.switch_to.window(hs[1]) #切换到邮箱页面
#获取邮箱页面的小窗口
iframeObj=dr.find_element_by_xpath('//*[@id="login_frame"]')
# print(iframeObj.get_attribute('name'))
# #切换到小窗口
dr.switch_to.frame(iframeObj)
time.sleep(2)
#获取QQ号码
dr.find_element_by_xpath('//*[@id="u"]').send_keys('1649270246')
#获取密码
dr.find_element_by_xpath('//*[@id="p"]').send_keys('182730759')
time.sleep(2)
#点击登录按钮
dr.find_element_by_xpath('//*[@id="login_button"]').click()
time.sleep(3)
#切换至主体页面
dr.switch_to.default_content()
#切换至邮箱页面基本版
dr.find_element_by_link_text('基本版').click()
time.sleep(5)
dr.quit()

#警告框的处理
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
dr=webdriver.Firefox()
dr.get('http://www.baidu.com')
dr.maximize_window() #最大化
#获取元素----设置
e=dr.find_element_by_tag_name('span')
#鼠标悬停
ActionChains(dr).move_to_element(e).perform()
time.sleep(3)

#获取元素----搜索设置
dr.find_element_by_link_text('搜索设置').click()
time.sleep(3)
# #选择显示20条
# e=dr.find_element_by_id('nr_2')
# e.click()
# print(e.get_attribute('name'))
# time.sleep(4)
#点击保存设置按键
dr.find_element_by_link_text('保存设置').click()
time.sleep(3)
# 暂时将浏览器对象driver交给alter用
d1=dr.switch_to.alert
#获取警告框的文本信息
print(d1.text)
time.sleep(3)
# ：放弃现有警告框，取消
d1.dismiss()

#页面滚动
from selenium import webdriver
import time
dr=webdriver.Firefox()
dr.get('http://news.baidu.com/')
dr.set_window_size(450,800)
time.sleep(3)

#滚动到底部
js="document.documentElement.scrollTop=10000"
dr.execute_script(js)
time.sleep(3)

#滚动到顶部
js="document.documentElement.scrollTop=0"
dr.execute_script(js)
time.sleep(3)

#左右滚动
js="window.scrollTo(200,800)"
dr.execute_script(js)
time.sleep(3)


#线性脚本开发
#引入模块
from selenium import webdriver
import time
#获取浏览器
dr=webdriver.Firefox()

#打开网站
dr.get('http://39.96.181.61/qftest-ds/')

#获取免费注册元素并点击
dr.find_element_by_link_text('免费注册').click()

#获取用户名输入框,并输入数据
dr.find_element_by_id('username').send_keys('test04')
time.sleep(1)

#获取邮箱输入框,并输入数据
dr.find_element_by_id('email').send_keys('test04@qq.com')
time.sleep(1)

#获取密码输入框,并输入数据
dr.find_element_by_id('password').send_keys('123456')
time.sleep(1)

#获取确认密码输入框,并输入数据
dr.find_element_by_id('repassword').send_keys('123456')
time.sleep(1)

#获取'立即注册'元素,并点击
dr.find_element_by_link_text('立即注册').click()
time.sleep(6)

#获取当前页面的url
addr1=dr.current_url
#进行判断http://39.96.181.61/qftest-ds/user/index.html
addr2='http://39.96.181.61/qftest-ds/user/index.html'
if addr1 == addr2:
    print("测试用例通过")
else:
    print("测试用例失败")

#关闭浏览器
dr.quit()



#模块化驱动测试开发
# 引入模块
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
# 获取浏览器
dr=webdriver.Firefox()
# 打开网站

# 登入系统用例
def login(dr,url):
    dr.get(url)
    # 获取登入元素,并点击
    dr.find_element_by_link_text('登陆').click()
    time.sleep(2)
    # 获取用户名输入框,并输入数据
    dr.find_element_by_id('username').send_keys('test04')
    time.sleep(2)
    # 获取密码输入框,并输入数据
    dr.find_element_by_id('password').send_keys('123456')
    time.sleep(2)
    # 获取登入按键元素,并点击
    dr.find_element_by_link_text('登     陆').click()
    time.sleep(8)

login(dr,'http://39.96.181.61/qftest-ds/')

def logout(dr):
    # 获取退出登入元素,并点击
    # dr.find_element_by_link_text('退出登录').click()
    # 获取用户名元素,并进行鼠标悬停,然后获取退出元素,并进行点击
    e=dr.find_element_by_class_name('m')
    ActionChains(dr).move_to_element(e).perform()
    time.sleep(3)
    dr.find_element_by_link_text('退出').click()
    time.sleep(3)
logout(dr)






