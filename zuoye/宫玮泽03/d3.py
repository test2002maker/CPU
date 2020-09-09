#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
import time
# dr=webdriver.Firefox()
# dr.get('https://www.taobao.com')
# e=dr.find_element_by_id("kw")
#在元素中输入文字
# e.send_keys('软件测试')
# time.sleep(2)
#清空
# e.clear()
# time.sleep(2)
# dr.quit()
# e=dr.find_element_by_xpath("//ul[@class='ks-switchable-nav']/li[2]")
# time.sleep(2)
# e.click()
# a=dr.find_element_by_id('q')
# a.send_keys('软件测试')
# time.sleep(2)
# a.clear()
# time.sleep(2)
# dr.quit()
# e=dr.find_element_by_xpath('/html/body/div[4]/div[1]/div/div[1]/div/ul/li[5]/a[2]')
# print(e.text)
# ee=dr.find_element_by_id('q')
# print(ee.size)
# print(ee.id)
# ee.screenshot('./pz.png')
# dr.quit()
# e=dr.find_element_by_xpath('//*[@id="q"]')
# e.send_keys('软件测试')
# time.sleep(2)
# e.submit()
# print(dr.title)
# print(dr.current_url)
# time.sleep(2)
# dr.quit()
# from selenium.webdriver.common.action_chains import ActionChains
# e=dr.find_element_by_xpath('/html/body/div[3]/div/ul[1]/li[2]/a')
# ActionChains(dr).move_to_element(e).perform()
# time.sleep(3)
# dr.quit()
# from selenium.webdriver.common.action_chains import ActionChains
# url='http://www.runoob.com/try/try.php?filename=jqueryui-api-droppable'
# dr.get(url)
# dr.switch_to.frame('iframeResult')
# s=dr.find_element_by_id('draggable')
# e=dr.find_element_by_id('droppable')
# ActionChains(dr).drag_and_drop(s,e).perform()
from selenium.webdriver.common.keys import Keys
from time import sleep
import os
dr=webdriver.Firefox()
dr.get('https://www.baidu.com')
# e=dr.find_element_by_xpath('//*[@id="kw"]')
# sleep(2)
# e.send_keys('maker')
# sleep(2)
# e.send_keys(Keys.BACK_SPACE)
# sleep(2)
# e.send_keys(Keys.CONTROL,'a')
# sleep(2)
# e.send_keys(Keys.CONTROL,'x')
# sleep(2)
# e.send_keys(Keys.CONTROL,'v')
# sleep(2)
# e.send_keys(Keys.ENTER)
# sleep(2)
# dr.quit()
# dr.refresh()
# sleep(2)
# dr.get_screenshot_as_file('11.png')
# sleep(2)
# dr.find_element_by_link_text('天猫超市').click()
# sleep(2)
# dr.close()
# sleep(2)
# dr.quit()
dr.find_element_by_link_text('新闻').click()
dr.find_element_by_link_text('地图').click()
dr.find_element_by_link_text('视频').click()
sleep(2)
h1=dr.window_handles
sleep(2)
dr.switch_to.window(h1[2])
sleep(2)
dr.close()
dr.switch_to.window(h1[1])
sleep(2)
dr.get_screenshot_as_file('111.png')
sleep(1)
dr.quit()


