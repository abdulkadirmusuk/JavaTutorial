import java.util.Scanner;
public class Runner {
    public static void main(String[]args) {
        Otobus ankara = new Otobus();
        Otobus bartin = new Otobus();
        Otobus istanbul = new Otobus();
        Otobus izmir = new Otobus();
        LinkedList ankaraListe = new LinkedList();
        LinkedList bartinListe = new LinkedList();
        LinkedList istanbulListe = new LinkedList();
        LinkedList izmirListe = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        //Buraya kadar olan kısımda 5 adet boş otobüs ve 5 adet otobüsün içindeki yolcu bilgisini
        //tutacak sınıf oluşturuldu...
        boolean program = true;
        while (program) {
            System.out.print("Bir işlem Seçiniz(1-6) : " +
                    "\n1-Bir kişiyi bir otobüse ekle" +
                    "\n2-Bir kişiyi bir otobusten sil" +
                    "\n3-Bir otobüste bulunan tüm kişileri listele" +
                    "\n4-Bir otobüste bulunan kişi sayısı" +
                    "\n5 Otobüste hareket edecek olan yolcu sayısı" +
                    "\n6-Çıkış" +
                    "\nİşlem Bekleniyor... : ");
            int secim = scanner.nextInt();
            if (secim>6) System.out.println("Geçersiz bir işlem numarası girdiniz.Tekrar Deneyiniz...");
            scanner.nextLine();
            switch (secim) {
                case 1:
                    System.out.print("Hangi şehre giden otobüse yolcu eklemek istiyorsunuz?\n1-Ankara\n2-Bartın\n3-İstanbul\n4-İzmir\nSeçim bekleniyor : ");
                    int sehirNo = scanner.nextInt();
                    if (sehirNo > 4) { System.out.println("Geçersiz bir şehir numarası girdiniz.Tekrar Deneyiniz....");break;}
                    scanner.nextLine();
                    System.out.print("Ad soyad gir : ");
                    String adSoyad = scanner.nextLine();
                    System.out.print("Cinsiyet gir(Erkek/Kadın) : ");
                    String cinsiyet = scanner.nextLine();
                    System.out.print("Telefon gir : ");
                    String telefon = scanner.nextLine();
                    if (sehirNo==1) ankara.yolcu = ankaraListe.yolcuEkle(adSoyad,cinsiyet,telefon);
                    else if (sehirNo==2) bartin.yolcu = bartinListe.yolcuEkle(adSoyad,cinsiyet,telefon);
                    else if (sehirNo==3) istanbul.yolcu = istanbulListe.yolcuEkle(adSoyad,cinsiyet,telefon);
                    else if (sehirNo==4) izmir.yolcu = izmirListe.yolcuEkle(adSoyad,cinsiyet,telefon);
                    break;
                case 2:
                    System.out.print("Hangi otobüsten yolcu silmek istersiniz ?\n1-Ankara\n2-Bartın\n3-İstanbul\n4-İzmir\nSeçim bekleniyor : ");
                    int sehirNo2 = scanner.nextInt();
                    if (sehirNo2>5) {System.out.println("Geçersiz bir şehir numarası girdiniz.Tekrar Deneyiniz");break;}
                    scanner.nextLine();
                    System.out.println("Silmek istediğiniz yolcunun indeksini giriniz(0,1,2,3....) ?");
                    int index = scanner.nextInt();
                    if (sehirNo2==1) ankaraListe.yolcuSil(index);
                    else if (sehirNo2==2) bartinListe.yolcuSil(index);
                    else if (sehirNo2==3) istanbulListe.yolcuSil(index);
                    else if (sehirNo2==4) izmirListe.yolcuSil(index);
                    break;
                case 3:
                    System.out.print("Hangi otobüsteki yolcuları listelemek istersiniz?\n1-Ankara\n2-Bartın\n3-İstanbul\n4-İzmir\nSeçim bekleniyor : ");
                    int sehirSecim = scanner.nextInt();
                    if (sehirSecim==1) ankaraListe.yolcuGöster();
                    else if (sehirSecim==2) bartinListe.yolcuGöster();
                    else if (sehirSecim==3) istanbulListe.yolcuGöster();
                    else if (sehirSecim==4) izmirListe.yolcuGöster();
                    else System.out.println("Geçersiz şehir numarası girdiniz.Tekrar deneyiniz");
                    break;
                case 4:
                    System.out.print("Hangi otobüsteki yolcuların sayısını istersiniz?\n1-Ankara\n2-Bartın\n3-İstanbul\n4-İzmir\nSeçim bekleniyor : ");
                    int sehirSecim2 = scanner.nextInt();
                    if (sehirSecim2==1) System.out.println("Ankara otobüsü yolcu sayısı : "+ankaraListe.otobusYolcuSay());
                    else if (sehirSecim2==2) System.out.println("Bartın otobüsü yolcu sayısı : "+bartinListe.otobusYolcuSay());
                    else if (sehirSecim2==3) System.out.println("İstanbul otobüsü yolcu sayısı : "+istanbulListe.otobusYolcuSay());
                    else if (sehirSecim2==4) System.out.println("İzmir otobüsü yolcu sayısı : "+izmirListe.otobusYolcuSay());
                    else System.out.println("Geçersiz şehir numarası girdiniz.Tekrar deneyiniz");
                    break;
                case 5:
                    int count = ankaraListe.otobusYolcuSay()+bartinListe.otobusYolcuSay()+istanbulListe.otobusYolcuSay()+izmirListe.otobusYolcuSay();
                    System.out.println("Tüm otobüslerdeki yolcu sayısı(5 Otobüs) : "+count);
                    break;
                case 6:
                    System.out.println("Programdan çıkılıyor....");
                    program = false;
                    break;
            }
        }

    }
}
