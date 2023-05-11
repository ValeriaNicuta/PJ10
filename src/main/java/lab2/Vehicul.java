package lab2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

class Vehicul{
    private String marca;
    private float pret;

    public Vehicul() {}

    public Vehicul(String marca, float pret) {
        this.marca = marca;
        this.pret=pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Marca: "+marca+"\nPret: "+pret;
    }
}

class Autoturism extends Vehicul{
    private int volum_portbagaj;
    private int greutate;

    public Autoturism() {}

    public Autoturism(String marca, float pret, int volum_portbagaj, int greutate) {
        super(marca, pret);
        this.volum_portbagaj = volum_portbagaj;
        this.greutate=greutate;
    }

    public int getVolum_portbagaj() {
        return volum_portbagaj;
    }

    public void setVolum_portbagaj(int volum_portbagaj) {
        this.volum_portbagaj = volum_portbagaj;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVolum portbagaj: "+volum_portbagaj+"\nGreutate: "+greutate;
    }
}

class Motociclete extends Vehicul implements InitializingBean, DisposableBean {
    private int viteza_maxima;

    public Motociclete() {}

    public Motociclete(String marca, float pret, int viteza_maxima) {
        super(marca, pret);
        this.viteza_maxima = viteza_maxima;
    }

    public int getViteza_maxima() {
        return viteza_maxima;
    }

    public void setViteza_maxima(int viteza_maxima) {
        this.viteza_maxima = viteza_maxima;
    }

    @Override
    public String toString() {
        return super.toString()+"\nViteza maxima: "+viteza_maxima +" km/h";
    }

    public void init(){
        System.out.println("init()");
    }
    public void disp(){
        System.out.println("disp()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - destroy()");
    }
}

class Tir extends Vehicul{
    private int incarcatura_maxima;

    public Tir(){}

    public Tir(String marca, float pret, int incarcatura_maxima) {
        super(marca, pret);
        this.incarcatura_maxima = incarcatura_maxima;
    }

    public int getIncarcatura_maxima() {
        return incarcatura_maxima;
    }

    public void setIncarcatura_maxima(int incarcatura_maxima) {
        this.incarcatura_maxima = incarcatura_maxima;
    }

    @Override
    public String toString() {
        return super.toString()+"\nIncarcatura maxima: "+incarcatura_maxima;
    }
}

