package estruturaDeDados_Algoritmos.algoritmos_gulosos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Uma empresa quer implementar um novo sistema de backup no qual arquivos são quardados em fitas de dados
*
* O novo sistema deve seguir as duas seguintes regras:
* 1- Nunca colocar mais de dois arquivos na mesma fita.
* 2- Os arquivos não podem ser divididos entre múltiplas fitas.
*
* É garantido que todas as fitas tenham o mesmo tamanho e que elas semprem serão capazes de guardar o maior arquivo.
* Toda vez que este processo for executado nós já saberemos o tamanho de cada arquivo e a capacidade das fitas.
* O parâmetro de sua função será uma estrutura que conterá o tamanho dos arquivos e a capacidade das fitas.
* Você deve retornar a quantidade mínima de fitas requeridas para guardar os arquivos.
*
* exemplo:
* input: tape size = 100; files: 70,20,10
* output: 2
*
* fita 1: 70,20
* fita 2: 10
* */
public class BackupSystem {

    public interface Batch{
        int[] getFileSize();
        int getTapeSize();
    }

    public static class NewBatch implements Batch{
        @Override
        public int[] getFileSize() {
            return new int[] {70,10,20,40,50,60,50,100,100};
        }

        @Override
        public int getTapeSize() {
            return 100;
        }
    }

    public class Tape{
        private int stored;
        private int numberOffFiles;

        public Tape(int stored){
            this.stored = stored;
            this.numberOffFiles = 1;
        }

        public void addStorage(int storage){
            this.stored += storage;
        }
        public void addNumberOffFiles(){
            this.stored++;
        }

        public int getStored() {
            return stored;
        }

        public int getNumberOffFiles() {
            return numberOffFiles;
        }
    }

    public int getMinimumTapeCount(final Batch batch){
       int[] sizes = batch.getFileSize();
       Arrays.sort(sizes);

       int tapes = 0;
       List<Tape> list = new ArrayList<>();

        for (int i = sizes.length - 1; i > -1 ; i--) {
            boolean stored = false;

            for (Tape tape : list) {
                if ((tape.getStored() + sizes[i]) <= batch.getTapeSize() && (tape.getNumberOffFiles() < 2)){
                    tape.addStorage(sizes[i]);
                    tape.addNumberOffFiles();
                    stored = true;
                    break;
                }
            }

            if(!stored){
                tapes++;
                list.add(new Tape(sizes[i]));
            }

        }

        return tapes;
    }

    public static void main(String[] args) {
        BackupSystem backupSystem = new BackupSystem();
        Batch batch = new NewBatch();

        System.out.println(backupSystem.getMinimumTapeCount(batch));
    }
}
