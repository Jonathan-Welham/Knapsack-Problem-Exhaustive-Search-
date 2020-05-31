/*
 * HackerRank link:
 * Title: hw6_2.java
 * Abstract:
 * Author: Jonathan Welham
 * ID: 6781
 * Date: 03/13/2020
 */

import java.util.*;

public class hw6_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numElems = input.nextInt();
        input.nextLine();
        int capacity = input.nextInt();
        if (numElems == 0) {
            System.out.println("Items: ");
            System.out.println("Capacity: ");
            System.out.println("Values: ");
            System.exit(0);
        }

        double n = Math.pow(2, numElems);

        int[] holder = new int[numElems];
        HashMap<Integer, Integer> map = new HashMap<>();


        int maxWeight = 0;
        int maxValue = 0;
        for(int i = 0; i < numElems; i++){
            int weight = input.nextInt();
            map.put(weight, input.nextInt());
            holder[i] = weight;
            if(weight > maxWeight){
                maxWeight = weight;
            }
        }


//                //Iterate through the map
//        for(Map.Entry<Integer, Integer> m : map.entrySet()){
//            System.out.println("Key == " + m.getKey() + " | " + "Value == " + m.getValue());
//        }

        String s;



        for(int i = 0; i < n; i++){
            int wTemp = 0;
            int vTemp = 0;
            switch(numElems){
                case 1: s = String.format("%1s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);

                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 2: s = String.format("%2s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp) {
                        maxValue = vTemp;
                    }
                    if (maxWeight < wTemp) {
                        maxWeight = wTemp;
                    }
                    if(maxWeight <= capacity){
                        System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                    }
                    System.out.println("");
                    break;
                case 3: s = String.format("%3s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 4: s = String.format("%4s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 5: s = String.format("%5s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 6: s = String.format("%6s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 7: s = String.format("%7s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 8: s = String.format("%8s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 9: s = String.format("%9s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 10: s = String.format("%10s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 11: s = String.format("%11s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 12: s = String.format("%12s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 13: s = String.format("%13s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 14: s = String.format("%14s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
                case 15: s = String.format("%15s:", Integer.toBinaryString(i)).replace(' ', '0');
                    System.out.print(s);
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(j) == '1'){
                            System.out.print(map.get(holder[j]) + " "); //Get the value using the weight stored in holder as key for the map
                            wTemp += holder[j];
                            vTemp += map.get(holder[j]);
                        }
                    }
                    if (maxValue < vTemp && maxWeight < wTemp) {
                        maxValue = vTemp;
                        maxWeight = wTemp;
                        if(maxWeight <= capacity){
                            System.out.print("Weight: " + maxWeight + " MaxValue: " + maxValue);
                        }
                    }
                    System.out.println("");
                    break;
            }

        }
    }
}
