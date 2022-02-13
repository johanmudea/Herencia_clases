package co.com.jm;

public class Television extends Electrodomestico {



    public int resolucion = 20;
    public boolean sintonizadorTDT = false;

    public Television(){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.consumoEnergetico = consumoEnergetico;
        super.basePrice = basePrice;
        super.peso=peso;


    }

    public Television(double basePrice, double peso){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.consumoEnergetico = consumoEnergetico;
        super.basePrice = basePrice;
        super.peso=peso;

    }

    public Television(int resolucion, boolean sintonizadorTDT){

        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;



    }

    public void setResolucion(int resolucion){
        this.resolucion=resolucion;

    }
    public int getResolucion(){
        return this.resolucion;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT){
        this.resolucion=resolucion;

    }
    public boolean getSintonizadorTDT(){
        return this.sintonizadorTDT;
    }

    @Override
    public double precioFinal() {

        double aumentoResolucion = 0;
        double aumentoSintonizador = 0;


        if (resolucion>40){

            super.basePrice = basePrice;
            aumentoResolucion = basePrice*1.3;




        }else if(resolucion<=40) {

            super.basePrice = basePrice;
            aumentoResolucion=basePrice;

        } else if(sintonizadorTDT = true){

            aumentoSintonizador=basePrice+50;



        }

        double temp1 = super.precioFinal();

        double aumentoLocal = super.basePrice+aumentoResolucion+aumentoSintonizador+temp1;

        System.out.println(aumentoLocal);

        return aumentoLocal;

    }



}
