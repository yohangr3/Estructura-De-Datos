package recursividad;

public class TorresHanoi {

    public void torresHanoi(int discos,int torre1,int torre2,int torre3){
        //Caso base
        if(discos == 1){
            System.out.println("Mover dicos de torre " + torre1 + " a torre " + torre3 );
        }else {
            torresHanoi(discos-1,torre1,torre2,torre3);
            System.out.println("Mover dicos de torre " + torre1 + " a torre "+ torre3);
            torresHanoi(discos-1,torre2,torre1,torre3);
        }
    }

    public static void main(String[] args) {
        TorresHanoi t1 = new TorresHanoi();
        t1.torresHanoi(3,1,2,3);

    }
}
