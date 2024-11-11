/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_json;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio.nava
 */
public class Main {
    
    public static void main(String[] args) {
        //1. Convertir un Objeto a JSON
        objectToJSON();
        //2. Convertir un JSON a Objeto
        jsonToObject();
        //3. Arreglos de objectos
        listToJSON();
        //4. Convertir un JSON Arreglo a Objecto
        jsonArregloToObject();
    }
    
    public static void jsonToObject() {
        String jsonValor = "{\"nombre\":\"Jose\",\"edad\":45,\"ciudad\":\"Barcelona\"}";
        Gson gson = new Gson();
        
        Ciudadano ciudadanoJose = gson.fromJson(jsonValor, Ciudadano.class);
        System.out.println("---------------------------------------");
        System.out.println("El objecto generado apartir de un JSON");
        System.out.println(ciudadanoJose.toString());
    } 
    
    public static void objectToJSON() {
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setNombre("Juan");
        ciudadano.setEdad(30);
        ciudadano.setCiudad("Madrid");
        
        Gson gson = new Gson();
        String valorJSON = gson.toJson(ciudadano);
        
        System.out.println("---------------------------------------");
        System.out.println("Valor del objeto en JSON");
        System.out.println(valorJSON);
    }
    
    public static void listToJSON() {
        List<Ciudadano> lista = new ArrayList();
        
        Ciudadano ciudadano1 = new Ciudadano();
        ciudadano1.setNombre("Juan");
        ciudadano1.setEdad(30);
        ciudadano1.setCiudad("Monterrey");
        lista.add(ciudadano1);
        
        Ciudadano ciudadano2 = new Ciudadano();
        ciudadano2.setNombre("Ana");
        ciudadano2.setEdad(25);
        ciudadano2.setCiudad("Monterrey");
        lista.add(ciudadano2);
        
        Gson gson = new Gson();
        String jsonValorArreglo = gson.toJson(lista);
        
        System.out.println("---------------------------------------");
        System.out.println("Valor de un arreglo de objecto en JSON");
        System.out.println(jsonValorArreglo);
    }
    
    public static void jsonArregloToObject() {
        String jsonValorFrutas = "[\"Mango\",\"Fresa\",\"Coco\",\"Uva\"]";
        Gson gson = new Gson();
        String[] arregloFrutas = gson.fromJson(jsonValorFrutas, String[].class);
        //List<String> arregloFrutas = gson.fromJson(jsonValorFrutas, List.class);
        
        System.out.println("---------------------------------------");
        System.out.println("Arreglo de frutas");
        for(String fruta : arregloFrutas) {
            System.out.println("- " + fruta);
        }
    }
        
}
