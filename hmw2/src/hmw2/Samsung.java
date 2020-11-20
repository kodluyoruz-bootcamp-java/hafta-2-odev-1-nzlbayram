package hmw2;

class Samsung extends CepTelefonu {

    public TusluKlavye klavye = new TusluKlavye();

    public Samsung(){

        super();
    }

        public void dosyaPaylasimiYap() {
            System.out.println("Dosya paylaşılıyor...");
        }

        public void muzikDinle() {
            System.out.println("MP3 çalınıyor...");
        }

        @Override
        public void getTelefonBilgi() {
            super.getTelefonBilgi();
            System.out.println("Klavye türü: "+klavye.getKlavyeTuru());
        }

}
