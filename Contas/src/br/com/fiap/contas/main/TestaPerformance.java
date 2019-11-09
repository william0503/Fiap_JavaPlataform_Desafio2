package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        //Collection<Integer> teste = new ArrayList<>();
        //30.000 -> Total: 400 / Add: 5 / Contains: 396
        //50.000 -> Total: 1163 / Add: 5 / Contains: 1158
        //100.000 -> Total: 3891 / Add: 5 / Contains: 3884

        Collection<Integer> teste = new HashSet<>();
        //30.000 -> Total: 8 / Add: 5 / Contains: 3
        //50.000 -> Total: 13 / Add: 7 / Contains: 6
        //100.000 -> Total: 18 / Add: 13 / Contains: 5
        long inicio = System.currentTimeMillis();
        int total = 100000;

        long inicioAdd = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fimAdd = System.currentTimeMillis();
        long tempoAdd = fimAdd - inicioAdd;

        long inicioContains = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fimContains = System.currentTimeMillis();
        long tempoContains = fimContains - inicioContains;

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Tempo Add: " + tempoAdd);
        System.out.println("Tempo Contains: " + tempoContains);
    }
}
