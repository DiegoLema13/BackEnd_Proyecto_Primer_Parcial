package com.api.backendCrud.Repository;

import com.api.backendCrud.Model.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje,Long>  {
}
