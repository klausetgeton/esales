/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhafazenda.util;

import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author cleverton
 */
public class ForcedListSelectionModel extends DefaultListSelectionModel {

    public ForcedListSelectionModel () {
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public void clearSelection() {}

    @Override
    public void removeSelectionInterval(int index0, int index1) {}

}