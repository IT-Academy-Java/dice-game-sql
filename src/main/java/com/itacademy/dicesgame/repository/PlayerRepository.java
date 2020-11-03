package com.itacademy.dicesgame.repository;

import com.itacademy.dicesgame.dto.PlayerResponseDto;
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
public class PlayerRepository implements IPlayerRepository, JpaRepository<PlayerResponseDto, Long> {
    @Override
    public List<PlayerResponseDto> findAll() {
        return null;
    }

    @Override
    public List<PlayerResponseDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PlayerResponseDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PlayerResponseDto> findAllById(Iterable<Long> longs) {
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
    public void delete(PlayerResponseDto entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PlayerResponseDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PlayerResponseDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PlayerResponseDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PlayerResponseDto> findById(Long aLong) {
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
    public <S extends PlayerResponseDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PlayerResponseDto> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PlayerResponseDto getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends PlayerResponseDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PlayerResponseDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PlayerResponseDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PlayerResponseDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PlayerResponseDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PlayerResponseDto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public List<PlayerResponseDto> getPlayers() {
        System.out.println("cosha pasha estoy en getPlayers() from PlayerRepository");
        return null;
    }
}
