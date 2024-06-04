/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testhandsonsiete;

/**
 *
 * @author Michelle
 */
public class TestHandsOnSiete {

    public static void main(String[] args) {
        double[] ungroupedData = DataSet.ungroupedData;
        double[][] groupedData = DataSet.groupedData;

            System.out.println("========================== DATOS AGRUPADOS ==========================");
            System.out.println("Media: " + ProcesosAgrupadosNoAgrupados.meanGrouped(groupedData));
            System.out.println("Moda: " + ProcesosAgrupadosNoAgrupados.modeGrouped(groupedData));
            System.out.println("Mediana: " + ProcesosAgrupadosNoAgrupados.medianGrouped(groupedData) + "\n");

            System.out.println("========================== DATOS NO AGRUPADOS ==========================");
            System.out.println("Media: " + ProcesosAgrupadosNoAgrupados.meanUngrouped(ungroupedData));
            System.out.println("Moda: " + ProcesosAgrupadosNoAgrupados.modeUngrouped(ungroupedData));
            System.out.println("Mediana: " + ProcesosAgrupadosNoAgrupados.medianUngrouped(ungroupedData));
    }
    }
