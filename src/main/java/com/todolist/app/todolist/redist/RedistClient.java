package com.todolist.app.todolist.redist;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.Map;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */
public class RedistClient {

    JedisPool pool = new JedisPool("localhost", 6379);

        Jedis jedis = pool.getResource(); {
        // Store & Retrieve a simple string
        jedis.set("foo", "bar");
        System.out.println(jedis.get("foo")); // prints bar

        // Store & Retrieve a HashMap
        Map<String, String> hash = new HashMap<>();
        hash.put("name", "John");
        hash.put("surname", "Smith");
        hash.put("company", "Redis");
        hash.put("age", "29");
        jedis.hset("user-session:123", hash);
        System.out.println(jedis.hgetAll("user-session:123"));
        // Prints: {name=John, surname=Smith, company=Redis, age=29}
    }
}


