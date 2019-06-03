package comparacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadArchives {

    public ReadArchives() {
        /*fileNumeros100000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/numeros_100000.txt");
        fileNumeros1000000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/numeros_1000000.txt");
        filePalavras100000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/palavras_100000.txt");
        filePalavras1000000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/palavras_1000000.txt");
        fileObjetos100000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/objetos_100000.txt");
        fileObjetos1000000 = new File("C:/Users/Gabriel/IdeaProjects/Ordenacao/src/arquivos/objetos_1000000.txt");*/
    }

    public Double[] getFileNumbers(String path, int size) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(file);
        Double[] doubles = new Double[size];

        int i = 0;
        while (input.hasNextLine()) {
            doubles[i] = Double.parseDouble(input.nextLine());
            i++;
        }
        input.close();

        return doubles;
    }

    public String[] getFileStrings(String path, int size) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(file);
        String[] strings = new String[size];

        int i = 0;
        while (input.hasNextLine()) {
            strings[i] = input.nextLine();
            i++;
        }
        input.close();

        return strings;
    }

    public LatLng[] getFileObject(String path, int size) throws FileNotFoundException {
        File file = new File(path);
        Scanner input = new Scanner(file);
        LatLng[] objetos = new LatLng[size];

        int i = 0;
        while (input.hasNextLine()) {
            String[] vetor = input.nextLine().split(" ");

            LatLng latLng = new LatLng();

            latLng.setLatitude(Double.parseDouble(vetor[0]));
            latLng.setLongitude(Double.parseDouble(vetor[1]));

            objetos[i] = latLng;
            i++;
        }
        input.close();

        return objetos;
    }
}
