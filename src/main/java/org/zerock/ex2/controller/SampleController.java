package org.zerock.ex2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController // Rest + Controller , ResponseBody + Controller
@RequestMapping("/sample") // main route (sample/*)
// http://localhost:8080/sample
@Slf4j
public class SampleController {
    // GET(조회), POST(추가), PUT(수정), DELETE(삭제)
    // GET : http://localhost:8080/sample/ex01
    @GetMapping({"/ex01", "/ex02"})
    public String ex01(){
        return "ex01";
    }
    // localhost:8080/sample/ex03?name=kim&age=20
    @GetMapping("/ex03")
    public void ex03(
            @RequestParam(value = "name",
                    required = false,
                    defaultValue = "kim"
            ) String name,
            @RequestParam("age") int age){
        log.info("name : {}, age : {}", name, age);
    }
    // /sample/memo/1
//    @GetMapping("/memo/{mno}/{bno}")
//    public void ex04(
//            @PathVariable("mno") long mno,
//            @PathVariable("bno") long bno
//    ){
////        log.info("ex03...... mno : " + mno);
//        log.info("ex04...... mno : {}", mno);
//    }
    @GetMapping("/member/{id}/exist")
    public void ex04(@PathVariable("id") String id) {
        log.info("member id : {}", id);
    }

    // localhost:8080/ex05?
    @PostMapping("/ex05")
    public void ex05(){
        log.info("..........ex05");
    }

}
