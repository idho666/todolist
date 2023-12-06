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
public class Event {

    String product;
    Statistic stats;

    @Getter
    @Setter
    public class Statistic {
        private List<Double> price;
    }
}
