#!/usr/bin/env python
# -*- coding:utf-8 -*-  
# ====#====#====#====
# Author:
# CreatDate:
# Version:
# ====#====#====#====
from selenium import webdriver
from time import sleep


def ds_ht(file):  # 第二题
    driver = webdriver.Firefox()
    with open(file, 'r') as f:
        xx = f.read().splitlines()
    xx = xx
    driver.get(xx[1])
    a = driver.find_element_by_id('username')
    a.send_keys(xx[3])
    b = driver.find_element_by_id('password')
    b.send_keys(xx[5])
    driver.find_element_by_xpath('/html/body/div/form/div/div/div[1]/a').click()
    sleep(10)
    driver.get_screenshot_as_file('jt.png')
    sleep(1)
    driver.quit()


def ds_gw(file, shangpin):  # 第三题
    driver = webdriver.Firefox()
    with open(file, 'r') as f:
        xx = f.read().splitlines()
    xx = xx
    driver.get(xx[-1])
    a = driver.find_element_by_name('kw')
    a.send_keys(shangpin)
    b = driver.find_element_by_xpath('/html/body/div[2]/div/div[1]/div[2]/form/div/button')
    b.click()
    c = driver.find_element_by_xpath('/html/body/div[4]/div[1]/div[1]/div[2]/div[2]/ul/li[4]/div/a/img')
    c.click()
    d = driver.find_element_by_xpath('/html/body/div[4]/div[1]/div[2]/div[4]/a[1]')
    d.click()
    sleep(5)
    driver.quit()


ds_ht('ds.txt')
sleep(5)
ds_gw('ds.txt', '苹果')
