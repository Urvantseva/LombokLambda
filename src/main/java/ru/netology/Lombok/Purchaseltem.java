package ru.netology.Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchaseltem {
    private int itenId;
    private int itenPrice;
    private int count;

}
