package com.example.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        lecturaArchivo (url="C:\\carpetaejemplo\\miArchivo.txt");;
    }


    
    public static void lecturaArchivo()throws IOException{ // excepcion usando java.IO
        try{
        Path file = Path.of(url); // ruta al fichero
        String content = Files.readString(file); // el contenido del fichero a String con el método readString
        System.out.println(content); // imprime el contenido 
        }catch(IOException e){
            System.out.println("El archivo no ha sido encontrado");
        }
    }

}


