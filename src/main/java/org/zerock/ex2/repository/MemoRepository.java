package org.zerock.ex2.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.ex2.entity.Memo;


import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    @Query(value = " select * from tbl_memo where mno > 0 ",
            nativeQuery = true)
    List<Object[]> getNativeResult();
    // use mysql query

    @Transactional
    @Modifying
    // use jsql grammer
    @Query("update Memo m " +
            " set m.memoText = :memoText" +
            " where m.mno = :mno")
    int updateMemoText(
            @Param("mno") Long mno,
            @Param("memoText") String memoText
    );
    @Query("select m from Memo m " +
            " where m.mno = :mno " +
            " order by m.mno desc")
    List<Memo> getListDesc(@Param("mno") Long mno);

    List<Memo> findByMnoBetween(Long from, Long to, org.springframework.data.domain.Pageable pageable);

    List<Memo> findByMnoBetweenOrderByMnoDesc(long from, long to, Pageable pageable);

    Page<Memo> findByMnoBetween(long l, long l1, org.springframework.data.domain.Pageable pageable);
}
