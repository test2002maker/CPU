#!/usr/bin/env python
# -*- coding:utf-8 -*-  
#====#====#====#====   
#Author:
#CreatDate:
#Version: 
#====#====#====#====
# import xlrd
# a = xlrd.open_workbook('data/shuai.xls')
# b = a.sheets()[0]
# for i in range(b.nrows):
#     row_data = b.row_values(i)
#     print(i)

import xlrd


# def dq(file_path, index):
#     a = xlrd.open_workbook(file_path)
#     b = a.sheets()[index]
#     return b
#
#
# s = dq('data/shuai.xls', 0)
# for i in range(s.nrows):
#     row_data = s.row_values(i)
#     print(row_data)

a = xlrd.open_workbook('data/shuai.xls')
b = a.sheets()[0]
mylist = []
for i in range(b.nrows):
    data = b.row_values(i)
    mylist.append(data[0])
print(mylist)