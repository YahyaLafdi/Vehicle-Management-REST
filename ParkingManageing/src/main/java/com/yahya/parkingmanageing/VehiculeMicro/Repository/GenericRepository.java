package com.yahya.parkingmanageing.VehiculeMicro.Repository;

import com.yahya.parkingmanageing.VehiculeMicro.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T,Long> {


}
