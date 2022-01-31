package com.company;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class WordOmatic {


    private String[] paraules={"hola","adeu","escalada","musica","onomatopeia"};

    public byte[] getParaula() {

        int v = (int)((Math.random() * paraules.length)-1);
        byte[] paraula= paraules[v].getBytes(StandardCharsets.UTF_8);

        return paraula;
    }
}
