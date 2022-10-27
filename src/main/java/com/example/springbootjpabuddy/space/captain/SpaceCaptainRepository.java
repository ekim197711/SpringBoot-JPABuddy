package com.example.springbootjpabuddy.space.captain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.List;

public interface SpaceCaptainRepository extends JpaRepository<SpaceCaptain, Integer> {
    List<SpaceCaptain> findByNoOfCrashesLessThanEqual(@NonNull Integer noOfCrashes);

    @Query("select (count(s) > 0) from SpaceCaptain s where upper(s.name) like upper(concat('%', :name, '%'))")
    boolean doWeHaveACaptainWithName(@Param("name") @NonNull String name);





}