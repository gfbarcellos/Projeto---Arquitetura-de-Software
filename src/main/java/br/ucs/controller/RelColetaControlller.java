/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucs.controller;

import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author Matheus
 */
public class RelColetaControlller {

    public static XYDataset createDataset() {

        DefaultXYDataset ds = new DefaultXYDataset();

        double[][] data = {{0.1, 0.2, 0.3}, {1, 2, 3}};

        ds.addSeries("series1", data);

        return ds;
    }

}
