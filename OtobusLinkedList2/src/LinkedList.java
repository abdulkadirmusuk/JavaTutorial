public class LinkedList {
    Yolcu head;
    public Yolcu yolcuEkle(String adSoyad,String cinsiyet,String telefon){
        //Bir otobüse eklenecek yolcu
        Yolcu yolcuBilgi = new Yolcu();//Yeni bir yolcu oluştur
        yolcuBilgi.adSoyad = adSoyad;
        yolcuBilgi.cinsiyet = cinsiyet;
        yolcuBilgi.telefon = telefon;//Yeni yolcu kişisel bilgileri
        yolcuBilgi.next = null;//Eklenen kişiden sonrası null 'u işaret etsin
        if (head ==null){
            //Eklenen ilk yolcu başa eklenir
            head = yolcuBilgi;
        }
        else{
            //Eğer head dolu ise burası çalışır,sonraki elemanlar eklenir
            Yolcu yolcu = head;
            while (yolcu.next!=null){
                //iterator ile en sona gitme
                yolcu = yolcu.next;
            }
            //yeni yolcuyu en sona ekle
            yolcu.next = yolcuBilgi;
        }
        return yolcuBilgi;
    }
    public void yolcuGöster(){
        Yolcu yolcu = head;//En baştaki yolcudan itibaren iterator ile gezinerek tüm yolcuları listele
        while (yolcu.next!=null){
            System.out.println("-------------YOLCU BİLGİLERİ-------------");//yolcu bilgisi yazdır
            System.out.println("Ad Soyad : "+yolcu.adSoyad);
            System.out.println("Cinsiyet : "+yolcu.cinsiyet);
            System.out.println("Telefon : "+yolcu.telefon);
            yolcu = yolcu.next;
            System.out.println("-----------------------------------------");
        }
        System.out.println("-------------YOLCU BİLGİLERİ-------------");
        System.out.println("Ad Soyad : "+yolcu.adSoyad);
        System.out.println("Cinsiyet : "+yolcu.cinsiyet);
        System.out.println("Telefon : "+yolcu.telefon);
        System.out.println("-----------------------------------------");
    }
    public void yolcuSil(int index){
        if (index==0){
            //İlk baştaki yolcu silinirse burası çalışır
            head = head.next;
        }
        else{
            Yolcu yolcu = head;
            Yolcu y = null;//temp bir Yolcu sınıfı
            for (int i=0;i<index-1;i++){
                yolcu = yolcu.next;
            }
            y = yolcu.next;//Sildiğimiz elemanın yerine bir sonraki işaret edilir
            yolcu.next = y.next;//Silinen elemanın gösterdiği
            System.out.println(index+" indeksine sahip yolcu silindi!!!");
        }
    }
    public int otobusYolcuSay(){
        Yolcu yolcu = head;//İlk elemanı head olarak ata
        int i =0;
        if (head!=null){//eğer head boş değilse i=1 yap
            i=1;
        }
        else return 0;//eğer head null ise eleman yok demektir 0 döndür
        while (yolcu.next!=null){//iterator oluştur tüm elemanları gez ve i yi bir arttır
            yolcu = yolcu.next;
            i++;
        }
        return i;
    }
}
