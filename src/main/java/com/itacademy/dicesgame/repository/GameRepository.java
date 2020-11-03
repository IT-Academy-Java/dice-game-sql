package com.itacademy.dicesgame.repository;

import com.itacademy.dicesgame.dto.GameResponseDto;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class GameRepository implements JpaRepository<GameResponseDto,Long> {
    @Override
    public List<GameResponseDto> findAll() {
        return null;
    }

    @Override
    public List<GameResponseDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<GameResponseDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<GameResponseDto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(GameResponseDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends GameResponseDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends GameResponseDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends GameResponseDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<GameResponseDto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends GameResponseDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<GameResponseDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public GameResponseDto getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends GameResponseDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends GameResponseDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GameResponseDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends GameResponseDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GameResponseDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GameResponseDto> boolean exists(Example<S> example) {
        return false;
    }
}
