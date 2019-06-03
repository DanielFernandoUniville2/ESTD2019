package comparacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        ReadArchives readArchives = new ReadArchives();
        Double[] doubles = readArchives.getFileNumbers("C:\\Users\\Will\\Desktop\\Faculdade\\Estrutura_de_Dados_ESTD\\Dados\numeros_1000000.txt", 100000);
        Double[] doubles1 = readArchives.getFileNumbers("C:\\Users\\Will\\Desktop\\Faculdade\\Estrutura_de_Dados_ESTD\\Dados\numeros_10000000.txt", 1000000);

        BubleSort bubbleSort = new BubleSort<Double>(doubles, new CompareNumeric());
        BubleSort bubbleSortDesc = new BubleSort<Double>(doubles, new CompareNumericDesc());

        long timeBubble = bubbleSort.imprimir();
        long timeBubbleDesc = bubbleSortDesc.imprimir();

        BubleSort bubleSort1 = new BubleSort<Double>(doubles1, new CompareNumeric());
        BubleSort bubleSortDesc1 = new BubleSort<Double>(doubles1, new CompareNumericDesc());
        long timeBuble1 = bubleSort1.imprimir();
        long timeBubleDesc1 = bubbleSortDesc1.imprimir();
        System.out.println("1: " + timeBuble);
        System.out.println("2: " + timeBubleDesc);
        System.out.println("3: " + timeBuble1);
        System.out.println("4: " + timeBubleDesc1);
        BubleSort bubleSortS = new BubleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        BubleSort bubleSortSDesc = new BubleSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());
        bubbleSortS.imprimir();
        bubbleSortSDesc.imprimir();
        LatLng latLng1 = new LatLng();
        latLng1.setLatitude(10.0);
        latLng1.setLongitude(20.0);
        LatLng latLng2 = new LatLng();
        latLng2.setLatitude(10.0);
        latLng2.setLongitude(1.0);
        BubleSort bubleSortO = new BubleSort<LatLng>(new LatLng[]{latLng1, latLng2}, new CompareObject());
        BubleSort bubleSortODesc = new BubleSort<LatLng>(new LatLng[]{latLng1, latLng2}, new CompareObjectDesc());
        bubleSortO.imprimir();
        bubleSortODesc.imprimir();
        SelectionSort selectionSort = new SelectionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        SelectionSort selectionSortDesc = new SelectionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());
        selectionSort.imprimir();
        selectionSortDesc.imprimir();
        SelectionSort selectionSortS = new SelectionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        SelectionSort selectionSortSDesc = new SelectionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());
        selectionSortS.imprimir();
        selectionSortSDesc.imprimir();
        InsertionSort insertionSort = new InsertionSort(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumeric());
        InsertionSort insertionSortDesc = new InsertionSort<Double>(new Double[]{23.0, 79.0, 78.0, 23.0, 434.0, -2.0}, new CompareNumericDesc());
        insertionSort.imprimir();
        insertionSortDesc.imprimir();
        InsertionSort insertionSortS = new InsertionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        InsertionSort insertionSortSDesc = new InsertionSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());
        insertionSortS.imprimir();
        insertionSortSDesc.imprimir();
        QuickSort quickSort = new QuickSort<Double>(doubles, new CompareNumeric());
        QuickSort quickSortDesc = new QuickSort<Double>(doubles, new CompareNumericDesc());
        quickSort.imprimir(false);
        quickSortDesc.imprimir(false);
        QuickSort quickSortS = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareString());
        QuickSort quickSortSDesc = new QuickSort<String>(new String[]{"C", "E", "F", "C", "I", "A"}, new CompareStringDesc());
        quickSortS.imprimir();
        quickSortSDesc.imprimir();
        MergeSort mergeSort = new MergeSort<Double>(doubles, new CompareNumeric());
        MergeSort mergeSortDesc = new MergeSort<Double>(doubles, new CompareNumericDesc());
        mergeSort.imprimir();
        mergeSortDesc.imprimir();

    }

}
