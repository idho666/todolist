package com.todolist.app.todolist.mapperapp;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */
@Getter
@Setter
public class EvenDto {


    String product;
    Statistic stats;

    @Getter
    @Setter
    public class Statistic {
        private List<MapHarga> price;
    }
    @Getter
    @Setter
    public class MapHarga{
        private int lowCost;
        private int heigestCost;
    }





}







