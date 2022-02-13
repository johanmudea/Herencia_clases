package co.com.jm;

public class Lavadora extends Electrodomestico {

    private int CARGA = 5;



    public Lavadora(){

        super();

        String colore=this.comprobarColor("");

        this.CARGA = CARGA;
        super.basePrice = basePrice;
        this.color= colore;
        super.consumoEnergetico = consumoEnergetico;
        super.peso = peso;

    }


    public Lavadora(double basePrice, int peso){

        super();

        this.CARGA = CARGA;
        super.basePrice = basePrice;
        super.peso = peso;

    }

    public Lavadora(double basePrice, String color, char consumoEnergetico, int peso){

        super();

        this.CARGA = CARGA;
        super.basePrice = basePrice;
        super.color= color;
        super.consumoEnergetico = consumoEnergetico;
        super.peso = peso;


    }


    public int getCARGA(){
        return this.CARGA;
    }

    @Override
    public double precioFinal() {

        double incremento1=0;
        double incremento2=0;
        double incrementos = incremento1+incremento2;

        if (CARGA>30){

            super.basePrice = basePrice + 50;
             incremento1 = basePrice + 50;

        }else {
            super.basePrice = basePrice;
             incremento2 = basePrice;

        }

        double temp = super.precioFinal();

         incrementos = super.basePrice+incremento1+incremento2+temp;

        System.out.println(incrementos);


        return incrementos;
    }

    public String toString(){


        return "basePrice "+basePrice+" color "+ color+" consumoEnergetico "+ consumoEnergetico+" peso "+peso+" CARGA "+ CARGA ;

    }









}