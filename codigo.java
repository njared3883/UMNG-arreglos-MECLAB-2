package matriz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class codigo {

    public boolean validaNumeros(String cedula, String edad, String estatura) {
        boolean resultado;
        try {
            Integer.parseInt(estatura);
            Integer.parseInt(cedula);
            Integer.parseInt(edad);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }

    public TableModel agregarPersona(TableModel entrada, String cedula, String nombre, String edad, String estatura) {
        DefaultTableModel salida = (DefaultTableModel) entrada;
        String[] dataTabla = new String[salida.getColumnCount()];
        dataTabla[0] = cedula;
        dataTabla[1] = nombre;
        dataTabla[2] = estatura;
        dataTabla[3] = edad;
        salida.addRow(dataTabla);
        return salida;
    }

    public TableModel ordenarPersona(TableModel entrada, int metodo, int parametro) {
        DefaultTableModel salida = (DefaultTableModel) entrada;
        persona arrayPersona[] = new persona[entrada.getRowCount()];
        int indexParametro = -1;
        if (parametro == 0) {
            indexParametro = 2;
        } else {
            indexParametro = 3;
        }
        for (int i = 0; i < entrada.getRowCount(); i++) {
            String nombre = entrada.getValueAt(i, 1).toString();
            String cedula = entrada.getValueAt(i, 0).toString();
            int estatura = Integer.parseInt(entrada.getValueAt(i, 2).toString());
            int edad = Integer.parseInt(entrada.getValueAt(i, 3).toString());
            arrayPersona[i] = new persona(nombre, cedula, estatura, edad);
        }
        if (metodo == 0) {
            long startTime = System.nanoTime();
            JOptionPane.showMessageDialog(null, "Iniciado MERGESORT");
            sort(arrayPersona, 0, (entrada.getRowCount()) - 1, indexParametro);
            long endTime = System.nanoTime() - startTime;
            JOptionPane.showMessageDialog(null, "Finalizado MERGESORT\nTiempo de ejecucion: " + endTime + " Nanosegundos.");
        } else {
            long startTime = System.nanoTime();
            JOptionPane.showMessageDialog(null, "Iniciado BURBUJA");
            burbuja(arrayPersona, indexParametro);
            long endTime = System.nanoTime() - startTime;
            JOptionPane.showMessageDialog(null, "Finalizado BURBUJA\nTiempo de ejecucion: " + endTime + " Nanosegundos.");
        }
        while (salida.getRowCount() > 0) {
            salida.removeRow(0);
        }
        for (int i = 0; i < arrayPersona.length; i++) {
            String row[] = new String[4];
            row[0] = arrayPersona[i].getCedula();
            row[1] = arrayPersona[i].getNombre();
            row[2] = String.valueOf(arrayPersona[i].getEstatura());
            row[3] = String.valueOf(arrayPersona[i].getEdad());
            salida.addRow(row);
        }
        return salida;
    }

    public void merge(persona arr[], int left, int middle, int right, int indexParametro) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        persona leftArray[] = new persona[n1];
        persona rightArray[] = new persona[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        int i = 0, j = 0;
        int k = left;
        if (indexParametro == 2) {
            while (i < n1 && j < n2) {
                if (leftArray[i].getEstatura() <= rightArray[j].getEstatura()) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }
        } else {
            while (i < n1 && j < n2) {
                if (leftArray[i].getEdad() <= rightArray[j].getEdad()) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void sort(persona arr[], int left, int right, int indexParametro) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle, indexParametro);
            sort(arr, middle + 1, right, indexParametro);
            merge(arr, left, middle, right, indexParametro);
        }
    }
    public void burbuja(persona[] arreglo, int indexParametro) {
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {

                persona elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                switch (indexParametro) {
                    case 2:
                        if (elementoActual.getEstatura() > elementoSiguiente.getEstatura()) {
                            arreglo[y] = elementoSiguiente;
                            arreglo[y + 1] = elementoActual;
                        }
                        break;
                    case 3:
                        if (elementoActual.getEdad() > elementoSiguiente.getEdad()) {
                            arreglo[y] = elementoSiguiente;
                            arreglo[y + 1] = elementoActual;
                        }
                        break;
                }

            }
        }
    }

}
