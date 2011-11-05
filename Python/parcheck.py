#!/usr/bin/env python
#-*-coding:utf-8-*-

class Stack:
    def __init__(self):
        self.items = list()
    def isEmpty(self):
        return self.items == []
    def push(self, item):
        self.items.append(item)
    def pop(self):
        return self.items.pop()
    def peek(self):
        return self.items[-1]
    def length(self):
        return len(self.items)


def parChecker(string):
    s = Stack()
    denge = True
    index = 0
    sira = 0
    while index < len(string) and denge:
        if string[index] in "({[<":
            s.push(string[index])
            sira += 1

        else:
            if s.isEmpty():
                denge = False
                print "%d.sıradaki parantezi açamadan kapattınız!"%(index + 1)
            else:
                son = s.peek()
                gelen = string[index]
                if son == "(" and gelen != ")":
                    print "('yi %s ile kapatamazsınız!!"%(gelen)
                    break
                elif son == "{" and gelen != "}":
                    print "{'yi %s ile kapatamazsınız!!"%(gelen)
                    break
                elif son == "[" and gelen != "]":
                    print "['yi %s ile kapatamazsınız!!"%(gelen)
                    break
                elif son == "<" and gelen != ">":
                    print "<'yi %s ile kapatamazsınız!!"%(gelen)
                    break
                s.pop()
                print sira , "-", index + 1
                if s.length() == 0:
                    sira = index + 2
                sira -= 1

        index += 1
    if denge and s.isEmpty():
        return True
    elif not s.isEmpty():
        print "%d.sıradaki parantezi kapatmayı unuttunuz!"%index

a = "(())[[}]"

parChecker(a)
