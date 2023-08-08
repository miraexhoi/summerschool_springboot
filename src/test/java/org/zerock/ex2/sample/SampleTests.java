package org.zerock.ex2.sample;

import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleTests {

    @Autowired // DI
    private Restaurant restaurant;



//    @Test
//    public void test1() {
////        restaurant = new Restaurant();
//        System.out.println("================");
//        System.out.println(restaurant);
////        restaurant.test();
//        System.out.println("================");
//    }
//
//    public void test2(){
//        Member member1;
//        member1 = new Member("홍길동",20);
//        System.out.println(member1);
//        member1 = new Member("홍길동",22);
//        System.out.println(member1);
//    }

    @Test
    public void test3() {
        Member member1 = new Member();
        Member member2 = new Member("홍길동",20);
//        member.setName("홍길동");
//        member.setAge(20);
        System.out.println(member1);
        System.out.println(member2);
    }
}