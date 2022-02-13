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
        arrayObjetos[7] = new Lavadora(100,100);
        arrayObjetos[8] = new Television(9999999,9999999);
        arrayObjetos[9] = new Lavadora(9999999, 999999);


        int sumaLavadoras=0;
        int sumaTelevisores=0;
        int suma=0;
        for (int i=0;i<arrayObjetos.length;i++){

            if (arrayObjetos[i] instanceof Lavadora){
                sumaLavadoras+=arrayObjetos[i].precioFinal();

            } else if(arrayObjetos[i] instanceof Television){
                sumaTelevisores+=arrayObjetos[i].precioFinal();
            }
            suma = sumaLavadoras+sumaTelevisores;
        }
        System.out.println("La suma de los precios de LAVADORAS  es "+sumaLavadoras);
        System.out.println("La suma de los precios TELEVISORES  es "+sumaTelevisores);
        System.out.println("La suma de los precios TOTALES  es "+suma);














        //Lavadora lav = new Lavadora();
        //lav.precioFinal();

        //System.out.println(lav.precioFinal());



        //lav.comprobarConsumoEnergetico('a');


        //System.out.println(lav.precioFinal());


        //Television tv = new Television();
        //tv.precioFinal();



    }











}
