package QQSM;

import java.io.*;
import java.util.*;

public class Questao_QQSM extends QQSM {

    public static void main(String[] args) throws IOException {

        //CREATE OBJECT
        Questao_QQSM newGame = new Questao_QQSM();

        //PLAYER REGISTRATION
        newGame.asknamePlayer();

        //READ FILE SPECIFIED
        newGame.readFile("/home/bruno/NetBeansProjects/P2/P2/src/QQSM/perguntas.txt");

        //RUN GAME
        newGame.counterLevel();

        //WRITE ON FILE SPECIFIED
        //newGame.writeFile("/home/bruno/NetBeansProjects/P2/P2/src/QQSM/teste.txt");
    }

}