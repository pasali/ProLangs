#include <stdio.h>
#include <stdlib.h>

//tam sayı dizisi

struct dizi{
    int deger;
    struct dizi *sonraki;
};

void ekle (struct dizi *ptr, int sayi)
{
    struct dizi *yeni;
    yeni = malloc ( sizeof( struct dizi ) );
    
    //yer var mı kenks ? 
    if ( yeni == NULL ){
        printf("yer yok ayakta gitmen lazım");
        exit(-1);
    }
        
    //yeni elemanı ekleyek
    yeni -> deger = sayi;
    yeni -> sonraki = NULL;
    
    //ilk düğümmü
    if ( ptr -> sonraki == NULL ){
        ptr -> sonraki = yeni;
        
    }
    else {
        struct dizi *gezgin = ptr;
        while (gezgin -> sonraki != NULL) {
            gezgin = gezgin -> sonraki;
        }
        gezgin -> sonraki = yeni;
        
    }
}

void yazdir(struct dizi *ptr)
{
    struct dizi *gezgin;
    gezgin = ptr;
    while ( gezgin != NULL ){
        printf("%d\n", gezgin -> deger );
        gezgin = gezgin -> sonraki;
    }
}

int main()
{
    struct dizi  *basi;
    basi = malloc( sizeof(struct dizi) );
    basi -> deger = 4;
    basi -> sonraki = NULL;
    ekle(basi, 3);
    ekle(basi, 5);
    yazdir(basi);
    return 0;
}
