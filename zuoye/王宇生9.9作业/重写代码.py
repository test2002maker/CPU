#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
import os
driver = webdriver.Firefox()

# driver.get('http://www.baidu.com')
# a = driver.find_element_by_id('kw')
# a.clear()
# a.send_keys('淘宝')
# b = driver.find_element_by_id('su')
# b.click()
# time.sleep(2)
# driver.quit()

# 案例:淘宝首页搜索栏上面点击天猫,然后在搜索栏写'软件测试',之后再清除
# driver.get('https://www.taobao.com')
# b = driver.find_element_by_id('q')
# a = driver.find_element_by_xpath('//ul[@class="ks-switchable-nav"]/li[2]')
# time.sleep(2)
# a.click()
# b.send_keys('软件测试')
# time.sleep(2)
# b.clear()
# time.sleep(2)
# driver.quit()

# 元素截图
# driver.get('https://www.taobao.com')
# a = driver.find_element_by_xpath('/html/body/div[4]/div[1]/div/div[1]/div/ul/li[1]/a[2]')
# b = driver.find_element_by_id('q')
# print(a.text)
# print(b.size)
# print(b.id)
# b.screenshot('./png/aa.png')
# driver.quit()

# 案例:在淘宝首页上的搜索栏中输入软件测试,然后按回车,之后打印本页的标题和url
# driver.get('https://www.taobao.com')
# a = driver.find_element_by_id('q')
# a.send_keys('软件测试')
# time.sleep(1)
# a.submit()
# time.sleep(1)
# print(driver.title)
# print(driver.current_url)
# driver.quit()

# 鼠标右键
# driver.get('https://www.baidu.com')
# b = driver.find_element_by_xpath('')
# a = driver.find_element_by_tag_name('body')
# ActionChains(driver).context_click(a).perform()
# time.sleep(3)
# driver.quit()

# 鼠标悬停
# driver.get('http://www.baidu.com')
# a = driver.find_element_by_link_text('更多')
# ActionChains(driver).move_to_element(a).perform()
# time.sleep(3)
# driver.quit()

# 鼠标拖动
# url = 'http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable'
# driver.get(url)
# driver.switch_to.frame('iframeResult')
# a = driver.find_element_by_id('draggable')
# b = driver.find_element_by_id('droppable')
# ActionChains(driver).drag_and_drop(a, b).perform()
# time.sleep(5)
# driver.quit()

# 下拉列表
# from selenium.webdriver.support.select import Select
# driver.get('file:///' + os.path.abspath('png/h04.html'))
# a = driver.find_elements_by_xpath('//form')
# list = Select(a)
# list.select_by_visible_text('北京烤鸭')
# time.sleep(2)
# driver.quit()

# 键盘操作
# 案例:在百度搜索栏中,进行输入,删除,全选,剪切,粘贴功能
# from selenium.webdriver.common.keys import Keys
# driver.get('https://www.baidu.com')
# a = driver.find_element_by_id('kw')
# a.send_keys('我帅吗')
# time.sleep(2)
# a.send_keys(Keys.CONTROL, 'a')
# time.sleep(2)
# a.send_keys(Keys.BACK_SPACE)
# time.sleep(2)
# a.send_keys('你好帅')
# time.sleep(2)
# a.send_keys(Keys.CONTROL, 'a')
# a.send_keys(Keys.CONTROL, 'x')
# time.sleep(2)
# a.send_keys(Keys.CONTROL, 'v')
# time.sleep(2)
# a.send_keys(Keys.ENTER)
# time.sleep(2)
# driver.quit()

# 浏览器操作
# driver.get('https://www.baidu.com')
# driver.set_window_size(600, 800)
# time.sleep(3)
# driver.minimize_window()
# time.sleep(3)
# driver.maximize_window()
# time.sleep(3)
# driver.get('https://www.taobao.com')
# time.sleep(3)
# driver.back()
# time.sleep(3)
# driver.forward()
# time.sleep(3)
# driver.quit()

# 案例:进入淘宝,然后设置浏览器的大小400,500,然后最大,最小,再最大,转入到百度,然后后退,再前进
# driver.get('http://www.taobao.com')
# driver.set_window_size(400, 500)
# time.sleep(2)
# driver.maximize_window()
# time.sleep(2)
# driver.minimize_window()
# time.sleep(2)
# driver.maximize_window()
# time.sleep(2)
# driver.get('http://www.baidu.com')
# time.sleep(2)
# driver.back()
# time.sleep(2)
# driver.forward()
# time.sleep(2)
# driver.quit()

# driver.get('http://www.taobao.com')
# time.sleep(2)
# driver.refresh()
# time.sleep(2)
# driver.get_screenshot_as_file('./png/bb.png')
# time.sleep(2)
# driver.find_element_by_link_text('聚划算').click()
# time.sleep(2)
# driver.close()# 关闭当前句柄窗口
# time.sleep(2)
# driver.quit()

# 案例:打开淘宝,刷新页面,点击天猫超市,然后截图,然后关闭淘宝首页,最后退出浏览器
# driver.get('http://www.taobao.com')
# time.sleep(2)
# driver.refresh()
# time.sleep(2)
# driver.find_element_by_link_text('天猫超市').click()
# time.sleep(2)
# driver.get_screenshot_as_file('./png/cc.png')
# time.sleep(2)
# driver.close()
# time.sleep(2)
# driver.quit()

# driver.get('http://www.taobao.com')
# a = driver.find_element_by_link_text('聚划算')
# a.click()
# time.sleep(2)
# b = driver.find_element_by_link_text('天猫超市')
# b.click()
# time.sleep(2)
# h1 = driver.window_handles
# driver.switch_to.window(h1[1])
# time.sleep(2)
# driver.get_screenshot_as_file('./png/dd.png')
# driver.quit()

# 案例：打开百度首页，点击新闻，点击地图，点击视频，然后关闭地图页面,截取视频页面的图像，退出浏览器
# driver.get('http://www.baidu.com')
# a = driver.find_element_by_link_text('新闻')
# a.click()
# time.sleep(2)
# b = driver.find_element_by_link_text('地图')
# b.click()
# time.sleep(2)
# c = driver.find_element_by_link_text('视频')
# c.click()
# time.sleep(2)
# h1 = driver.window_handles
# time.sleep(2)
# driver.switch_to.window(h1[2])
# time.sleep(2)
# driver.close()
# time.sleep(2)
# driver.switch_to.window(h1[1])
# time.sleep(2)
# driver.get_screenshot_as_file('./png/ee.png')
# time.sleep(2)
# driver.quit()




