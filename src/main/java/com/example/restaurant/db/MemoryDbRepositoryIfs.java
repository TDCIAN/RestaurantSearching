package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {

    Optional<T> findById(int index); // 특정 인덱스(id) 자료 찾기
    T save(T entity); // 저장
    void deleteById(int index); // 삭제
    List<T> listAll(); // 전체를 저장


}
