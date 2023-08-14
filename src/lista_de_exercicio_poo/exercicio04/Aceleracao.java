package lista_de_exercicio_poo.exercicio04;

public class Aceleracao {
     double forca;
     double massa;

     public Aceleracao(double forca, double massa) {
          this.forca = forca;
          this.massa = massa;
     }

     public double calculaAceleracao(double forca, double massa){

          return forca/massa;

     }
}
