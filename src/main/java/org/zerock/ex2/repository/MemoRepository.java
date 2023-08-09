package org.zerock.ex2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2.entity.Memo;

import java.awt.print.Pageable;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
//    Between
//    findByStartDateBetween
//    … where x.startDate between ?1 and ?2
    List<Memo> findByMnoBetween(Long from, Long to, org.springframework.data.domain.Pageable pageable);

    List<Memo> findByMnoBetweenOrderByMnoDesc(long from, long to, Pageable pageable);

    Page<Memo> findByMnoBetween(long l, long l1, org.springframework.data.domain.Pageable pageable);
}
