/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goparking.estacionamento.controller;

import com.goparking.estacionamento.entity.Veiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FF
 */
@Stateless
public class VeiculoFacade extends AbstractFacade<Veiculo> {

    @PersistenceContext(unitName = "com.goparking_Estacionamento_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VeiculoFacade() {
        super(Veiculo.class);
    }
    
}
