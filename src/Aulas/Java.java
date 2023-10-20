package Aulas;
  public class Java {
    
     public static void main(String[] args) {
    
    ArrayList<String> listaDeAulas = new ArrayList<String>();

    listaDeAulas.add("Sintaxe básica de Java");
    listaDeAulas.add("Orientação a objetos");
    listaDeAulas.add("Coleções em Java");
    listaDeAulas.add("Tratamento de Exceções");
    listaDeAulas.add("Threads e Multithreading");
    listaDeAulas.add("Threads e Multithreading");
    listaDeAulas.add("Entrada e Saida (I/O)");
    listaDeAulas.add("Bibliotecas Padrão");
    listaDeAulas.add("Threads e Multithreading");
    listaDeAulas.add("JDBC Java Database Connectivity");
    listaDeAulas.add("Interfaces Gráficas de Usuário");
    listaDeAulas.add("Desenvolvimento Web em Java:");

    for (String aulas : listaDeAulas) {
        System.out.println(aulas);
    }
  }
}
