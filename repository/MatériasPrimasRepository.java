package com.projeto.gestãoMP.repository;

import  com.projeto.gestãoMP.model.MatériasPrimas ;
import  org.springframework.data.jpa.repository.JpaRepository ;

import  java.util.List ;
import  java.util.Optional ;

 interface  pública MatériasPrimasRepository extends  JpaRepository < MatériasPrimas , Long > {
    List < MatériasPrimas >  findAllByNomeContainingIgnoreCase ( String  nome );
    Optional < MatériasPrimas >  findById ( Long  Id );