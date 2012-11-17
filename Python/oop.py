#!/usr/bin/env python 
#-*- coding:utf-8 -*-

class Dogru:
    def __init__(self):
        self.cvp = raw_input("Doğru mu ?: (E/H) ")

class Secenek(Dogru):
    def __init__(self):
        self.sec = []
        self.durum = []
        for i in range(5):
            print "Secenek%d: "%(i+1),
            self.sec.append(raw_input()) 
            cvp = Dogru() 
            self.durum.append(cvp)               
        
class Soru(Secenek):
    def __init__(self):
        self.soru = raw_input("Soru cümlesi: ")
        self.yanit = ""
        self.yntlr = ["A", "B", "C", "D", "E"] 
        Secenek.__init__(self)
    def sor(self):
        print self.soru
        for j in range(5):
            print self.yntlr[j] + "-) " + self.sec[j]
        self.yanit = raw_input("Cevabınız (A..E): ")

class SoruCTS(Soru):
    def __init__(self):
        Soru.__init__(self)
    def sor(self):
        Soru.sor(self)
        self.dogru_mu()
    def dogru_mu(self):
        dogru_yanit = ""
        for i in self.durum:
            if i.cvp == "E":
                dogru_yanit = self.yntlr[self.durum.index(i)]
        print "Cevabınız: ",self.yanit," Doğru cevap: ", dogru_yanit,
        if self.yanit == dogru_yanit:
            print " Puan = 1"
        else:
            print " Puan = 0"

class SoruCCS(Soru):
    def __init__(self):
        Soru.__init__(self)
        self.yanitlar = self.yanit.split()
    def sor(self):
        Soru.sor(self)
        self.dogru_mu()
    def dogru_mu(self):
        dogru_yanitlar = []
        for i in self.durum:
            if i.cvp == "E":
                dogru_yanitlar.append(self.yntlr[self.durum.index(i)])
        print "Cevablarınız : ",self.yanit," Doğru cevaplar : ", " ".join(dogru_yanitlar),
        sonuc = True
        for i in self.yanitlar:
            if i not in dogru_yanilar:
                sonuc = False
        
        if sonuc:
            print " Puan = 1"
        else:
            print " Puan = 0"

s = SoruCCS()
s.sor()

