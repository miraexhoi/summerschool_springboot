package org.zerock.ex2.sample;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Chef chef;
    private Guest guest;

//    @Autowired
//    public Restaurant(Chef chef, Guest guest) {
//        this.chef = chef;
//        this.guest = guest;
//    }

//    @Override
//    public String toString() {
////        return super.toString();
//        return "Restaurant12";
//    }
}
