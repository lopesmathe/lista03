package br.edu.up;

import java.util.Random;

public class Produtos {
    private float[] itens = new float[40]; 

    public Produtos() {
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            itens[i] = random.nextFloat() * 100;
        }
    }

    public float getItem(int index) {
        return itens[index];
    }
}
