package hmw2;

class Apple extends CepTelefonu {

    public DokunmatikKlavye klavye = new DokunmatikKlavye();

    public Apple(){

        super();
    }


    public void goruntuluGorusmeYap() {
        System.out.println("Görüntülü aranıyor...");
    }

    public void ekranPaylasimiYap() {
        System.out.println("Ekranınız paylaşılıyor...");
    }

    @Override
    public void getTelefonBilgi() {
        super.getTelefonBilgi();
        System.out.println("Klavye türü: "+klavye.getKlavyeTuru());
    }

}