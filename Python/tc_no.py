def tc_kimLik_dogruLa(tc_no):

    if type(tc_no) == type(10000000146):
        toplam = 0 #Tek indislerin toplamı
        toplam2 = 0 #Çift indislerin toplamı
        toplam3 = 0 # ilk 10 hanenin toplamı
        for i in range(0, 9, 2):
            toplam += int(str(tc_no)[i])
        for i in range(1, 9, 2):
            toplam2 += int(str(tc_no)[i])
        for i in range(10):
            toplam3 += int(str(tc_no)[i])
        basamak = (7 * toplam) - toplam2
        if basamak % 10 == int(str(tc_no)[9]):
            if toplam3 % 10 == int(str(tc_no)[10]):
                print "Tc kimlik numarasi geçerlidir"
        else:
            print "Tc kimlik numarasi geçerli değildir."
    else:
        print "11 haneli pozitif tamsayi girin!"