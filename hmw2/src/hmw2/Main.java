package hmw2;

class Main {

    public static void main(String[] args) {

        Samsung samsungTelefon1 = new Samsung();

        samsungTelefon1.setModelAdi("Samsung Galaxy A50");
        samsungTelefon1.setImeiNo("ab12345");
        samsungTelefon1.setVersiyonNo("ab12");
        samsungTelefon1.setBellekKapasitesi(32);
        samsungTelefon1.setEkranBoyutu(6);

        samsungTelefon1.getTelefonBilgi();
        samsungTelefon1.telefonuAc();
        samsungTelefon1.telefonuKapat();
        samsungTelefon1.aramaYap();
        samsungTelefon1.smsGonder();
        samsungTelefon1.dosyaPaylasimiYap();
        samsungTelefon1.muzikDinle();

        Apple appleTelefon1 = new Apple();

        appleTelefon1.setModelAdi("iPhone 8");
        appleTelefon1.setImeiNo("xy67890");
        appleTelefon1.setVersiyonNo("xy15");
        appleTelefon1.setBellekKapasitesi(64);
        appleTelefon1.setEkranBoyutu(7);

        appleTelefon1.getTelefonBilgi();
        appleTelefon1.telefonuAc();
        appleTelefon1.telefonuKapat();
        appleTelefon1.aramaYap();
        appleTelefon1.smsGonder();
        appleTelefon1.goruntuluGorusmeYap();
        appleTelefon1.ekranPaylasimiYap();

    }

}
