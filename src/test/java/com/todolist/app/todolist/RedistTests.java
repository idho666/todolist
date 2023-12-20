package com.todolist.app.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Updated by Idho.
 * Date: 06.04.2023
 * Time: 9:11
 */

@SpringBootTest
public class RedistTests {


    @Test
    void setRedist(){
        JedisPool pool = new JedisPool("localhost", 6379);

        Jedis jedis = pool.getResource();

        jedis.set("nama","bara mahesa");

        jedis.set("rekapTransaksi", String.valueOf(303030400));


        Integer modulus =  Integer.parseInt(jedis.get("rekapTransaksi"));




        System.out.println("===================");
        System.out.println(modulus);
        System.out.println("===================");

        System.out.println(jedis.get("nama"));

    }
}
