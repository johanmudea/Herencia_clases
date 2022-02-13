package co.com.jm;

public class Electrodomestico {

     public double basePrice = 101;
     public String color = "blanco";
     public char consumoEnergetico='f';
     public double peso = 5;


    public void comprobarConsumoEnergetico(char consumoEnergetico){

        if(consumoEnergetico == 'f'){
            consumoEnergetico = 'f';
        }else if(consumoEnergetico == 'a'){
            consumoEnergetico = 'a';

        }else if(consumoEnergetico == 'b'){
            consumoEnergetico='b';

        }else if(consumoEnergetico == 'c'){
            consumoEnergetico = 'c';

        }else if(consumoEnergetico == 'd'){
            consumoEnergetico = 'd';

        }else if(consumoEnergetico == 'e'){
            consumoEnergetico = 'e';
        }else {
            consumoEnergetico = 'f';

        }
        //System.out.println(consumoEnergetico);

    }



    public Electrodomestico(){

         this.basePrice = getBasePrice();
         this.color = "blanco";
         this.consumoEnergetico = consumoEnergetico;
         this.peso = 5;


     }

    public Electrodomestico(double basePrice, int peso){
         this.basePrice = basePrice;
         this.peso = peso;

    }

    public Electrodomestico(double basePrice, String color, char consumoEnergetico, int peso){
        this.basePrice = basePrice;
        this.color= color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;




    }

    public void setBasePrice(int basePrice){
         this.basePrice=basePrice;
    }
    public double getBasePrice() {
        return this.basePrice;
    }


    public void setColor(String color){
        this.color=color;
    }
    public String getColor(String color) {
        return this.color;
    }

    public void setConsumoEnergetico(char consumoEnergetico){
        this.consumoEnergetico=consumoEnergetico;
    }
    public char getConsumoEnergetico(char consumoEnergetico) {
        return this.consumoEnergetico;
    }

    public void setPeso(int peso){
        this.peso=peso;
    }
    public double getPeso() {
        return this.peso;
    }


    public String comprobarColor(String color){

        color = color.toLowerCase();

         switch (color){


             case "blanco":
                 color="blanco";
                 break;

             case "negro":
                 color="negro";
                 break;

             case "rojo":
                 color="rojo";
                 break;

             case "azul":
                 color="azul";
                 break;

             case "gris":
                 color="gris";
                 break;

             default:
                 color="blanco";

         }

    return color;

    }

    public double precioFinal(){

        this.basePrice = basePrice;
        this.comprobarConsumoEnergetico('u');
        double aumentoConsumo = 0;
        double aumentoPeso =0;
        int finalPrice=0;
        this.peso = peso;

        if(consumoEnergetico == 'f'){
            aumentoConsumo = 10;
        }else if(consumoEnergetico == 'a'){
            aumentoConsumo = 100;

        }else if(consumoEnergetico == 'b'){
            aumentoConsumo=80;

        }else if(consumoEnergetico == 'c'){
            aumentoConsumo = 60;

        }else if(consumoEnergetico == 'd'){
            aumentoConsumo = 50;

        }else if(consumoEnergetico == 'e'){
            aumentoConsumo = 30;
        }else {
            consumoEnergetico = 10;

        }

        for (int peso=0;peso<=19;peso++ ){
            aumentoPeso=10;
        }
        for (int peso=20;peso<=49;peso++ ){
            aumentoPeso=50;
        }
        for (int peso=50;peso<=79;peso++ ){
            aumentoPeso=80;
        }

        for (int peso=80;peso>80;peso++ ){
            aumentoPeso=100;
        }



        double finalPrice1 = basePrice+aumentoConsumo+aumentoPeso;


    return finalPrice1;

    }

















}
