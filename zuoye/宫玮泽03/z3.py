#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
from selenium import webdriver
from time import sleep
from selenium.webdriver.common.keys import Keys

def aa(file):
    dr=webdriver.Firefox()
    with open(file,'r') as f:
        xx=f.read().splitlines()
    dr.get(xx[1])
    p=dr.find_element_by_id('username')
    p.send_keys(xx[3])
    p=dr.find_element_by_id('password')
    p.send_keys(xx[5])
    dr.find_element_by_xpath('/html/body/div/form/div/div/div[1]/a').click()
    sleep(4)
    dr.get_screenshot_as_file('aa.png')
    sleep(2)
    dr.quit()


def bb(file):
    dr=webdriver.Firefox()
    with open(file, 'r') as f:
        aab=f.read().splitlines()
    dr.get(aab[-1])
    q=dr.find_element_by_name('kw')
    q.send_keys('苹果')
    q.send_keys(Keys.ENTER)
    sleep(4)
    dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[1]/div[2]/div[2]/ul/li[1]/h3/a').click()
    sleep(4)
    dr.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div[4]/a[1]').click()
    sleep(4)
    dr.quit()


aa('电商系统-阿里云环境.txt')
sleep(4)
bb('电商系统-阿里云环境.txt')
