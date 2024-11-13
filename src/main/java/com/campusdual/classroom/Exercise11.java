package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {

        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");


        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();
        blackRemote.channelDown();

        if (blackRemote.channel == 0) {
            System.out.println("El canal ya está en 0");
        } else {
            blackRemote.channelDown();
        }

        redRemote.volumeUp();
        redRemote.volumeDown();
        while(redRemote.volume > 0){
            redRemote.volume--;
            if(redRemote.volume == 0){
                System.out.println("No se puede.");
            }
        }
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        redRemote.turnOff();
        blackRemote.turnOff();
        }
    }