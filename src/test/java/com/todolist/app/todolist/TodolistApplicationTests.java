package com.todolist.app.todolist;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.todolist.app.todolist.mapperapp.EvenDto;
import com.todolist.app.todolist.mapperapp.Event;
import com.todolist.app.todolist.todolistapp.TodolistDto;
import com.todolist.app.todolist.todolistapp.model.TodoList;
import com.todolist.app.todolist.todolistapp.repository.TodolistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TodolistApplicationTests {


    @Autowired
    TodolistRepository todolistRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void gsonParse() {

        String jsonString = "{'event':{'stats':{'price':[{'lowCost':200,'heigestCost':22},{'lowCost':200,'heigestCost':99},{'lowCost':200,'heigestCost':300}]},'product':'Bluetooth Earphone'}}";
//        String jsonString = "{'event':{'stats':{'price':[424.78,3.5,4.1,666]},'product':'Bluetooth Earphone'}}";


//        String jsonString = "{'test1':'value1','test2':{'id':0,'name':'testName'}}";
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(jsonString);

        // Print the parsed JsonObject
//        System.out.println(jsonObject);


        Gson gson = new Gson();
        EvenDto event = gson.fromJson(String.valueOf(jsonObject.getAsJsonObject("event")), EvenDto.class);

        List<EvenDto.MapHarga> prices = event.getStats().getPrice();

//        for (:
//             ) {
//
//        }

        for (int order = 0; order < prices.size(); order++) {
//            System.out.println(prices.get(order));
            System.out.println(prices.get(0).getHeigestCost());
        }


//        String product = event.getProduct();
//        System.out.println(product);

    }

    @Test
    void createJson() {
        String jsonString = "{'event':{'stats':{'price':424.78},'product':'Bluetooth Earphone'}}";


//        String jsonString = "{'test1':'value1','test2':{'id':0,'name':'testName'}}";
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = (JsonObject) jsonParser.parse(jsonString);

        // Print the parsed JsonObject
        System.out.println(jsonObject);
    }


    @Test
    void batchInsert() {
        TodoList todolist = new TodoList();
        List<TodoList> todoLists = new ArrayList<>();
        for (int a = 0; a <= 6; a++) {
            todolist.setTodolist("sdfdsf"+a);
            todolist.setTittle("jahanam"+a);

            todoLists.add(todolist);
            todolistRepository.save(todolist);

        }

//        todoLists.add(todolist);
//        todolistRepository.saveAll(todoLists);
        System.out.println(todoLists);
    }


}
