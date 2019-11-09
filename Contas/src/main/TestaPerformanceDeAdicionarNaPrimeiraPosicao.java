package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        //List<Integer> teste = new ArrayList<>();
        //Tempo gasto: 0.046
        //Tempo leitura:0.003
        List<Integer> teste = new LinkedList<>();
        //Tempo gasto: 0.005
        //Tempo leitura:0.437
        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

        long inicioFor = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            Integer item = teste.get(i);
        }
        long fimFor = System.currentTimeMillis();
        tempo = (fimFor - inicioFor) / 1000.0;
        System.out.println("Tempo leitura:" + tempo);

    }
}
