package co.com.jm;

public class Main {

    public static void main(String[] args) {



        Electrodomestico arrayObjetos[] = new Electrodomestico[10];

        arrayObjetos[0] = new Television(150, 50);

        arrayObjetos[1] = new Lavadora(222, 99);
        arrayObjetos[2] = new Television(120, 40);

        arrayObjetos[3] = new Lavadora(200,100);

        arrayObjetos[4] = new Television(800, 20);

        arrayObjetos[5] = new Lavadora(220, 44);
        arrayObjetos[6] = new Television(500, 500);

        arrayObjetos[7] = new Lavadora(10000,100000);

        arrayObjetos[8] = new Television(-1,-15);

        arrayObjetos[9] = new Lavadora(9999999, 999999);

        System.out.println("La suma de los precios finales  es ");

        int suma=0;
        for (int i=0;i<arrayObjetos.length;i++){
            suma+=arrayObjetos[i].precioFinal();
        }
        System.out.println("La suma de los precios finales  es "+suma);














        //Lavadora lav = new Lavadora();
        //lav.precioFinal();

        //System.out.println(lav.precioFinal());



        //lav.comprobarConsumoEnergetico('a');


        //System.out.println(lav.precioFinal());


        //Television tv = new Television();
        //tv.precioFinal();



    }











}
