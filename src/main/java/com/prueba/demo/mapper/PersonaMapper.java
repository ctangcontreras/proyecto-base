package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Persona;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonaMapper {
  List<Persona>  getListaPersona();
 
  
}
