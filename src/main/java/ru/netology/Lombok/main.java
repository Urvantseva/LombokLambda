package ru.netology.Lombok;

import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        CardtService service = new CardtService();
        service.add(new Purchaseltem(1, 1_000, 1));
        service.add(new Purchaseltem(2, 4_000, 4));
        service.add(new Purchaseltem(3, 6_000, 1));
        service.add(new Purchaseltem(4, 7_000, 9));
        service.add(new Purchaseltem(5, 9_000, 1));
        service.add(new Purchaseltem(6, 8_000, 10));


        //       System.out.println(service.sortedBy(
        //       new Comparator<Purchaseltem>() {
        //               @Override
        //               public int compare(Purchaseltem o1, Purchaseltem o2) {
        //                       return o1.getItenPrice() - o2.getItenPrice();
        //               }
        //       }
        //       ));

        //       System.out.println(service.sortedBy((Purchaseltem o1, Purchaseltem o2) -> {
        //           return o1.getItenPrice() - o2.getItenPrice();
        //       }));

        //       System.out.println(service.sortedBy((o1, o2) -> {
        //           return o1.getItenPrice() - o2.getItenPrice();
        //       }));

        System.out.println(service.sortedBy((o1, o2) -> o1.getItenPrice() - o2.getItenPrice()));

        //       System.out.println(service.sortedBy(Comparator.comparingInt(Purchaseltem::getItenPrice)));
    }
}
