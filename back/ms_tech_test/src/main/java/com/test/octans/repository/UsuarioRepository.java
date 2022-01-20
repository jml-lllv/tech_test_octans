package com.test.octans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.octans.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}
