#!/usr/bin/env python 
#-*-coding:utf-8-*-
#coded by Pasali

from Tkinter import *
from random import shuffle
from xlutils.copy import copy 
from xlrd import open_workbook 
from xlwt import *
import os

pen = Tk()
pen.geometry("250x250+400+100")
pen.resizable(width = False , height = False)
pen.title("Notmatik v0.1")
giris = Entry(pen)
giris.config(width = 10)
giris.place(relx = 0.5, rely = 0.17)

giris1 = Entry(pen)
giris1.config(width = 10)
giris1.place(relx = 0.5, rely = 0.3)

giris2 = Entry(pen)
giris2.config(width = 10)
giris2.place(relx = 0.5, rely = 0.43)

puan = Label(text = "Puan :")
puan.place(relx = 0.2, rely = 0.17)

dosya = Label(text = "Dosya adı :")
dosya.place(relx = 0.2, rely = 0.3)

ogr_no = Label(text = "Satır No:")
ogr_no.place(relx = 0.2, rely = 0.43)

def bol(sayi, dosya_adi, no):
    
    liste = [0]*20
    sayac = 0
    while sayi > 0:
        if sayac == 20:
            sayac = 0
        liste[sayac] += 1
        sayi -= 1
        sayac += 1
    shuffle(liste)
    style0 = easyxf('font: name Times New Roman; align: vert centre, horiz center; borders: right thin')
    style1 = easyxf('font: name Times New Roman, bold on; align: vert centre, horiz center; borders: right thin')
    rb = open_workbook(dosya_adi,formatting_info=True)
    r_sheet = rb.sheet_by_index(0)
    wb = copy(rb)
    w_sheet = wb.get_sheet(0) 
    satir = no - 1 
    sutun = 4
    for i in liste:
        w_sheet.write(satir, sutun, i, style0)
        sutun += 1
    w_sheet.write(satir, sutun, sum(liste), style1)
    wb.save(dosya_adi)

def onay():

        try:
            integer = int(giris.get())
            uyari = Label(text = "                                       ")
            uyari.place(relx = 0.0, rely = 0.0)
            bol(integer,giris1.get(), int(giris2.get()))
        
        except ValueError:
            uyari = Label(text = "Pozitif sayi girmelisin!!!")
            uyari.place(relx = 0.0, rely = 0.0)
            giris.delete(0, END)


btn = Button(text = "İşlemi bitir !!", command = onay)
btn.place(relx = 0.29, rely = 0.65)

mainloop()
