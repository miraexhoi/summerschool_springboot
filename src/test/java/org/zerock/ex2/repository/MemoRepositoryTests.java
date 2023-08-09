package org.zerock.ex2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2.entity.Memo;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    private MemoRepository memoRepository;
    @Test
    public void testInsertDummies(){
//        for (int i = 1; i <= 100; i++) {
//
//        };
        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder()
                    .memoText("Sample..."+i)
                    .build();
            memoRepository.save(memo);
        });
    }
    @Test
    public void testSelect(){
        // select * from tbl_memo
        // where mno=100;
        Long mno = 100L;
        Optional<Memo> result = memoRepository.findById(mno);
        if(result.isPresent()){
            Memo memo = result.get();
            System.out.println("===================");
            System.out.println(memo);
        }
        System.out.println("===================");
    }
    @Test
    public void testSelectAll(){
        List<Memo> list = memoRepository.findAll();
        list.forEach(memo ->{
            System.out.println("===================");
            System.out.println(memo);
        });
    }
    @Test
    public void testUpdate(){
        Memo memo = Memo.builder()
                .mno(100L)
                .memoText("Update Text")
                .build();
        System.out.println("===================");
        memoRepository.save(memo);
    }
    @Test
    public void testDelete(){
        Long mno = 100L;
        memoRepository.deleteById(mno);
    }
}
