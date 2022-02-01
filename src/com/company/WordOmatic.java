package com.company;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class WordOmatic {


    private String[] paraules={"hola","adeu","escalada","musica","onomatopeia","caca","blabla"};

    public byte[] getParaula() {

        int v = (int)((Math.random() * paraules.length));
        byte[] paraula= paraules[v].getBytes(StandardCharsets.UTF_8);

        return paraula;
    }
}
