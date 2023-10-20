package HorarioDasAulas;
    
    public class HorarioDasAulas {

      public static void main(String[] args) {

        ArrayList<String> horarioInteligenciaArt = new ArrayList<String>();
          //Segunda 
          horarioInteligenciaArt.add("Fundamentos da Matemática das 07:00 as 08:00");
          horarioInteligenciaArt.add("Ética da IA das 09:00 as 10:00");
          horarioInteligenciaArt.add("Aprendizado de máquinas das 13:00 as 14:00");
          horarioInteligenciaArt.add("Processamento de linguagem natural das 16:00 as 17:00");
          //Quarta
          horarioInteligenciaArt.add("Visão Computacional 08:00 as 09:00");
             
          for (String horarios : horarioInteligenciaArt) {
            System.out.println(horarios);
  }
}       
