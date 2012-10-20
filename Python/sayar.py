#!/usr/bin/env python
#-*-coding:utf-8-*-
#Verilen dizindeki klasör ve dosya sayısını hesaplayan program 

import os

class sayici:
	
	def __init__(self):
	    self.klasor = 0
     	self.dosya = 0
	
	def sayar(self, yol):
	    try:
            liste = os.listdir(yol)
		    for i in liste:
		        dizin = os.path.join(yol, i)
       		    if os.path.isdir(dizin):
			        self.klasor += 1
			        sayici.sayar(dizin)
		        else:
			        self.dosya += 1
       	except OSError:
		    print "Böyle bir dizin yok !"
	
	def goster(self):
	    print"Dosya sayısı :", self.dosya, "\nKlasör sayısı :",self.klasor
sayici = sayici()
sayici.sayar("/usr/bin")
sayici.goster()
