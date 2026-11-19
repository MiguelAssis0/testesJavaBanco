import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DesafioContadorProcessoSeletivo {
    public void main(String[] args){
        System.out.println("Processo seletivo");

        //analisarCandidato(2000);
        //selecaoCandidatos();
        //selecionados();
        //entrarEmContato();
        Contador();

    }

    static void Contador(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int param1 = sc.nextInt();
        int param2 = sc.nextInt();

        try {
            contar(param1, param2);
        }catch (ParametrosInvalidosException ex){

        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if(param1 > param2) throw new ParametrosInvalidosException();

        int contagem = param2 - param1;

        for (int i = 0; i < contagem; i++){
            System.out.println(i);
        }

    }

    public static class ParametrosInvalidosException extends Exception{

    }







    //-------------------------
    static void entrarEmContato(){
        int tentativasRealizadas = 1;
        boolean continuarTentanto = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentanto = !atendeu;

            if(continuarTentanto)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentanto && tentativasRealizadas < 3);
    }

    static void selecaoCandidatos(){
        String[] candidatos = { "Miguel", "Felipe", "Jorge", "Maria", "Gabriela", "Rafaela", "Mariana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatos.length >= candidatoAtual ){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void selecionados(){
        String[] candidatos = { "Miguel", "Felipe", "Jorge", "Maria", "Gabriela", "Rafaela", "Mariana"};

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("Candidato " + candidatos[i] + " foi selecionado");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidado");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidado com contra proposta");
        }else{
            System.out.println("Aguardando demais candidatos");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

}
