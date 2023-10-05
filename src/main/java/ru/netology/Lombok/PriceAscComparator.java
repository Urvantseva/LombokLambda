package ru.netology.Lombok;

import java.util.Comparator;

public class PriceAscComparator implements Comparator<Purchaseltem> {
    @Override
    public int compare(Purchaseltem o1, Purchaseltem o2) {
        return o1.getItenPrice() - o2.getItenPrice();
    }
}
