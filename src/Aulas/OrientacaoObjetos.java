package Aulas;
    
    public class OrientacaoObjetos {

      public static void main(String[] args) {

        ArrayList<String> listaDeAulas = new ArrayList<String>();

        listaDeAulas.add("Classes e Objetos");
        listaDeAulas.add("Encapsulamento");
        listaDeAulas.add("Herança");
        listaDeAulas.add("Polimorfismo");
        listaDeAulas.add("Abstração");
        listaDeAulas.add("Métodos e Propriedades");
        listaDeAulas.add("Construtores");
        listaDeAulas.add("Associação");

        for (String aulas : listaDeAulas) {
            System.out.println(aulas);
  }
}
