import java.util.ArrayList;

public class Amigos implements Comparable<Amigos> {
    ArrayList<Amigos> listaNome;
    String nome;

    public Amigos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Amigos(){
        listaNome = new ArrayList<>();
    }
    public void addAmigos(Amigos a){
        listaNome.add(a);
    }
    public void removeAmigos(Amigos a){
        listaNome.remove(a);
    }
    public void listaNome (){
        for (Amigos a: listaNome){
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Amigos o) {
        if(this.getNome().compareTo(o.getNome()) > 1){
            return 1;
        }else{
            return -1;
        }
    }
}



