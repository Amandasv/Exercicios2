import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //1
        Amigos a = new Amigos("Joana");
        Amigos b = new Amigos("Pedro");
        Amigos c = new Amigos("Patricia");
        Amigos d = new Amigos("Ana");
        Amigos e = new Amigos("Felipe");


        ArrayList<Amigos> listaNome = new ArrayList<>();
        listaNome.add(a);
        listaNome.add(b);
        listaNome.add(c);
        listaNome.add(d);
        listaNome.add(e);

        //2
        listaNome.remove(c);
        System.out.println("Lista de contatos:" + listaNome);

        //3
        System.out.println(listaNome.contains(a));

        //4
        System.out.println(listaNome.size());

        //5
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(1);
        listaNumeros.add(20);
        listaNumeros.add(32);
        listaNumeros.add(15);
        listaNumeros.add(22);
        System.out.println(soma(listaNumeros));

        ArrayList<Integer> listaNumeros2 = new ArrayList<>();
        listaNumeros2.add(3);
        listaNumeros2.add(20);
        listaNumeros2.add(1);
        listaNumeros2.add(12);
        listaNumeros2.add(22);



        //6
        System.out.println(compara(listaNumeros,listaNumeros2));

        //7
        System.out.println(intersecao2(listaNumeros, listaNumeros2));

        //8
        System.out.println(uniao(listaNumeros, listaNumeros2));

        //9
        System.out.println(trocaMaior(listaNumeros));


    }
    //5
    public static int soma(ArrayList<Integer> listaDeInteiros) {
        int resultado = 0;
        for(int i = 0; i < listaDeInteiros.size(); i++) {
            resultado = resultado + listaDeInteiros.get(i);
        }
        return resultado;
    }

    public static ArrayList<Boolean> compara (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Boolean> C = new ArrayList<>();
        for (int i=0; i< a.size(); i++){
            if (a.get(i)== b.get(i)){
                C.add(true);
            }
            else {
                C.add(false);
            }
        }
        return C;
    }
    //7
    public static ArrayList<Integer> intersecao2(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<>();
        for (int i=0; i< a.size(); i++){
            for(int j =0;j<b.size();j++){
                if(a.get(i)==b.get(j)){
                    c.add(a.get(i));
                }
            }
        }
        return c;
    }

    //8
    public static ArrayList<Integer> uniao(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList c = (ArrayList) a.clone();
        for(int i = 0; i < b.size(); i++) {
            if(!a.contains(b.get(i))) {
                c.add(b.get(i));
            }
        }
        return c;
    }

    //9
    public static ArrayList<Integer> trocaMaior(ArrayList<Integer> a){
        ArrayList c = (ArrayList) a.clone();
        Integer maior = (Integer) Collections.max(c);
        Integer menor = (Integer) Collections.min(c);
        int posicaoMaior = c.indexOf(maior);
        int posicaoMenor = c.indexOf(menor);

        c.set(posicaoMaior, menor);
        c.set(posicaoMenor, maior);

        return c;
    }
}


