#!/usr/bin/env python
#-*-coding:utf-8-*-
#mhmtbsl@gmail.com
from queue import Queue

noktalar = Queue()
def komsuBul(a,b):
    durum = 0
    liste = []
    while durum < 4:
        if durum== 0:
            x = a + 1
            y = b
            liste.append([x,y])
        if durum== 1:
            y = b - 1
            x = a
            liste.append([x,y])
        if durum== 2:
            x = a - 1
            y = b
            liste.append([x,y])
        if durum == 3:
            y = b + 1
            x = a
            liste.append([x,y])
        x, y = 0, 0
        durum += 1
    return liste
mat = [[12,34,52,99,23],
       [12,1,14,21,23],
       [12,18,22,23,19],
       [16,28,24,44,23],
       [8,12,23,46,34]]
x ,y = 2,2
noktalar.enq([x,y])
gezilen =[]
while not  noktalar.isEmpty() and y<3:
    nokta = noktalar.deq()
    x, y = nokta[0], nokta[1]
    komsular = komsuBul(x,y)
    for i in komsular:
        if mat[x][y] - 5 <= mat[i[0]][i[1]] <= mat[x][y] + 5 :
            if [i[0], i[1]] not in gezilen:
                gezilen.append([i[0], i[1]])
                noktalar.enq([i[0], i[1]])

for i in gezilen:
    mat[i[0]][i[1]]= 0


for i in range(5):
    print mat[i]
