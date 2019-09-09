/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.cweb.controller;

import java.util.List;
import javax.ejb.Local;
import ues.occ.edu.sv.ingenieria.prn335.centities.Asiento;

/**
 *
 * @author fernando
 */
@Local
public interface AsientoFacadeLocal {

    void create(Asiento asiento);

    void edit(Asiento asiento);

    void remove(Asiento asiento);

    Asiento find(Object id);

    List<Asiento> findAll();

    List<Asiento> findRange(int[] range);

    int count();
    
}
