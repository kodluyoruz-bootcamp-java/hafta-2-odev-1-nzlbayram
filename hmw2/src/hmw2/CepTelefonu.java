package hmw2;

class CepTelefonu {

    protected String modelAdi;
    protected String imeiNo;
    protected String versiyonNo;
    protected int bellekKapasitesi;
    protected int ekranBoyutu;


    public CepTelefonu() {
        this.modelAdi = "";
        this.imeiNo = "";
        this.versiyonNo = "";
        this.bellekKapasitesi = 0;
        this.ekranBoyutu = 0;

    }

    public String getModelAdi() {
        return modelAdi;
    }

    public void setModelAdi(String modelAdi) {
        this.modelAdi = modelAdi;
    }

    public String getImeiNo() {
        return imeiNo;
    }

    public void setImeiNo(String imeiNo) {
        this.imeiNo = imeiNo;
    }

    public String getVersiyonNo() {
        return versiyonNo;
    }

    public void setVersiyonNo(String versiyonNo) {
        this.versiyonNo = versiyonNo;
    }

    public int getBellekKapasitesi() {
        return bellekKapasitesi;
    }

    public void setBellekKapasitesi(int bellekKapasitesi) {
        this.bellekKapasitesi = bellekKapasitesi;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(int ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public void getTelefonBilgi() {
        System.out.printf("Modelin adı: %s, " + "IMEI No: %s, " + "Versiyon Numarası: %s, " + "Bellek Kapasitesi: %d, " + "Ekran Boyutu: %d\n"
                , getModelAdi(), getImeiNo(), getVersiyonNo(), getBellekKapasitesi(), getEkranBoyutu());
    }

    public void telefonuAc() {
        System.out.println("Telefon açılıyor...");
    }

    public void telefonuKapat() {
        System.out.println("Telefon kapatılıyor...");
    }

    public void aramaYap() {
        System.out.println("Arama yapılıyor...");
    }

    public void smsGonder() {
        System.out.println("SMS gönderiliyor...");
    }

}

