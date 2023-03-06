package com.yahya.parkingmanaging;

import com.yahya.parkingmanaging.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T,Long> {


}
