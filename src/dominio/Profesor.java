package dominio;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Profesor implements Serializable{

    protected String nombre;
    protected ArrayList<Merito> meritos;
    //CONSTRUCTOR
    public Profesor(String nombre){
        meritos = new ArrayList<>();
        this.nombre = nombre;
    }

    public abstract double calcularValoracion();

    public Profesor annadirMerito(Merito m){
         meritos.add(m);
         return this;
    }

    public Merito getMerito(int i){
        return meritos.get(i);
    }

    public int size(){
        return meritos.size();
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
         this.nombre = nombre;
    }

    //ligadura estatica y dinamica
    //polimorfismo
    //metodo sobre cargado (todos tienen el mismo nombre 7 metodos con diferentes argumentos) y otro redifinido(defines mismo parametros pero con otro comportamiento)
    public boolean equals(Object obj){
        Profesor p = (Profesor) obj;
        return this.nombre.equalsIgnoreCase(p.nombre);
    }

    public void mostrarMeritos(){
        for (Merito m : meritos) {
            System.out.println(m);
        }
    }

    public String toString(){
        return "Nombre: "+ nombre +"\nMeritos: " + meritos;
    }


}