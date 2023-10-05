package ru.netology.Lombok;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CardtService {
    public static CardtService service;
    private final List<Purchaseltem> items = new ArrayList<>();
    public void  add(Purchaseltem item) {
        items.add(item);
    }
    public List<Purchaseltem> sortedBy(Comparator<Purchaseltem> comparator) {
    List<Purchaseltem> result = new LinkedList<>(items);
    result.sort(comparator);
    return result;
    }
    public void removeByItemId(int ItemId) {
        items.removeIf(o -> o.getItenId() == ItemId);
    }

    public void changeCount(int itemId, int count) {
        throw new UnsupportedOperationException();
    }
}
