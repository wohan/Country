package com.company;

import Prototype.PrototypeArea;
import Prototype.PrototypeHouse;
import Prototype.PrototypeSity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<PrototypeHouse> houses = new ArrayList<>(40);
        List<PrototypeHouse> quarters = new ArrayList<>(20);
        List<PrototypeArea> areas = new ArrayList<>(10);
        List<PrototypeSity> sitys = new ArrayList<>(5);
        List<PrototypeSity> regions = new ArrayList<>(2);
        List<PrototypeSity> country = new ArrayList<>(1);

        PrototypeHouse house = new PrototypeHouse("house", 10);
        PrototypeHouse house2;
        Random rnd = new Random();
        for (int i = 0; i < 40; i++){
            try {
                house2 = house.clone();
                //int rnd = (new Random(500)).nextInt();
                house2.setPeoples(rnd.nextInt(500));
                System.out.println(rnd.nextInt(500));
                houses.add(i, house2);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                }
        }
        for (PrototypeHouse house3: houses) {
            System.out.println(house3.getName() + "  " + house3.getPeoples());
        }

    }
}


//    Request request = new Request("lordrp", 20, "coder");
//        while (true)//имитирую онлайн запросы
//                {
//                try {
//                Request userRequest = request.clone();
//                //изменение параметров
//                userRequest.setAge(30);
//                //тут мог бы осуществляться какой - нить поиск
//                //search(userRequest)
//                } catch (CloneNotSupportedException e) {
//                e.printStackTrace();//объект не поддерживает клонирование
//                }