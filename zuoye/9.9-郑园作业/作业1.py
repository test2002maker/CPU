#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
#鼠标键盘
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
import os
import time
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# e=dr.find_element_by_name('q')
# e.send_keys('软件测试')
# time.sleep(2)
# e.clear()
# dr.quit()
# e=dr.find_element_by_link_text('天猫')
# e.click()
# time.sleep(2)
# dr.quit()
#获取元素的属性值
# dr=webdriver.Firefox()
# dr.get('http:www.taobao.com')
# e=dr.find_element_by_name('q')
# print(e.get_attribute('name'))
# print(e.get_property('name'))#自定义的属性值无法打印
#获取元素的属性信息
# dr=webdriver.Firefox()
# dr.get('http://www.taobao.com')
# e=dr.find_element_by_name('q')
# print(e.text)#获取标签对之间的文字
# e1=dr.find_element_by_name('q')
# print(e1.get_attribute('name'))
# print(e1.size)
# e1.screenshot('./c.png')#拍照
#获取元素的基本信息
# dr=webdriver.Firefox()
# dr.get("file:///"+os.path.abspath('03HTML/04HTML.html'))
# e=dr.find_element_by_name('c1')
# ee=dr.find_element_by_name('c3')
# print(e.is_selected())#判断元素是否被选择 True
# print(ee.is_selected())#False
# e2=dr.find_element_by_name('c88')
# print(ee.is_enabled())#False
# print(e2.is_displayed())#False
#其他操作
#案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# e=dr.find_element_by_id('q')
# e.send_keys('软件测试')
# time.sleep(2)
# e.submit()#回车
# print(dr.title)#获取标题并打印
# print(dr.current_url)#获取页面地址并打印
# time.sleep(2)
# dr.quit()
#鼠标
# dr=webdriver.Firefox()
# dr.get('file:///'+os.path.abspath('03HTML/06HTML.html'))
# e=dr.find_element_by_xpath('//input[@value="按键2"]')
# ActionChains(dr).double_click(e).perform()
#鼠标悬停
# dr=webdriver.Firefox()
# dr.get('https://www.baidu.com')
# e=dr.find_element_by_link_text('更多')
# #3鼠标悬停:move_to_element()
# ActionChains(dr).move_to_element(e).perform()
#鼠标拖动
# dr=webdriver.Firefox()
# url='http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable'
# dr.get(url)
# #切换到目标元素的窗口iframeResult
# dr.switch_to.frame('iframeResult')
# #确定要拖拽的目标元素
# s=dr.find_element_by_id('draggable')
# #要拖入的目标元素
# e=dr.find_element_by_id('droppable')
# #执行拖拽动作
# ActionChains(dr).drag_and_drop(s,e).perform()
#下拉列表
# dr=webdriver.Firefox()
# # dr.get("file:///"+os.path.abspath('html3/h01.html'))
# # e=dr.find_element_by_name('z')
# # time.sleep(2)
# # # 把元素转换为列表
# # listobj=Select(e)
# # # 通过下标选择选项
# # # listobj.select_by_isndex(1)
# # # 通过value值来选择选项
# # # listobj.select_by_value('x')
# # # 通过文本获取选项
# # listobj.select_by_visible_text('rb')
#键盘的操作
#案例:在百度搜索栏中,进行输入,删除,全选,剪切,粘贴功能
# dr=webdriver.Firefox()
# dr.get("https://www.baidu.com")
# e=dr.find_element_by_id('kw')
# time.sleep(2)
# e.send_keys('丰田车')#往元素输入内容
# time.sleep(2)
# e.send_keys(Keys.BACK_SPACE)#删除一个字符
# time.sleep(2)
# e.send_keys(Keys.CONTROL,'a')
# time.sleep(2)
# e.send_keys(Keys.CONTROL,'x')
# time.sleep(2)
# e.send_keys(Keys.CONTROL,'v')
# time.sleep(2)
# e.send_keys(Keys.ENTER)#回车
#浏览器的控制
#案例:打开淘宝,刷新页面,点击天猫超市,然后截图,然后关闭淘宝首页,最后退出浏览器
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# time.sleep(2)
# dr.refresh()#刷新
# time.sleep(2)
# dr.find_element_by_link_text('天猫超市').click()#点击天猫超市
# time.sleep(2)
# dr.get_screenshot_as_file('1.png')#截图
# time.sleep(2)
# dr.close()#关闭最前的窗口
# time.sleep(2)
# dr.quit()
#多窗口处理
#案例：打开百度首页，点击新闻，点击地图，点击视频，
# 然后关闭地图页面,截取视频页面的图像，退出浏览器
# from selenium import webdriver
# import time
# dr=webdriver.Firefox()
# dr.get('http://www.baidu.com')
# h2=dr.current_window_handle#获取百度首页的句柄
# time.sleep(2)
# dr.find_element_by_link_text('新闻').click()
# time.sleep(2)
# dr.find_element_by_link_text('地图').click()
# time.sleep(2)
# dr.find_element_by_link_text('视频').click()
# time.sleep(2)
# hh=dr.window_handles#获取浏览器中所有窗口的句柄
# dr.switch_to.window(hh[1])#把视频窗口绑定给浏览器
# dr.get_screenshot_as_file('2.png')
# time.sleep(2)
# hh=dr.window_handles#获取浏览器中所有窗口的句柄
# dr.switch_to.window(hh[2])#把地图窗口绑定给浏览器
# dr.close()
# time.sleep(2)
# dr.quit()