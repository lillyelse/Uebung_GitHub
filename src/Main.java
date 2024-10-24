public class Main {
    public static void main(String[] args) {

        System.out.println(istPotenz(27));
        System.out.println(anzahl(3));
        System.out.println(fibonacci(4));
        printFibonacci();
        }

        //ÜBUNG 1
        /*Die Methode verwendet rekursive Aufrufe, um zu überprüfen, ob die Eingabezahl eine Potenz von 3 ist.
        Wenn die Zahl immer weiter durch 3 teilbar ist, bis sie 1 erreicht,
        wird true zurückgegeben. Andernfalls wird false zurückgegeben.*/

        public static boolean istPotenz(int zahl) {
            if (zahl == 1){
                return true;
            }else if (zahl < 1 || zahl % 3 != 0){
                return false;
            }else{
                return istPotenz(zahl / 3);    //Rückgabe = erneuter Aufruf der Methode mit neuer Zahl
            }
        }


        //ÜBUNG 2
        public static int anzahl(int i) {
            if (i == 0){
                System.out.println(1);
            }
            if (i == 1 || i == 2){
                System.out.println(1);
            }
            return anzahl(i-1) + anzahl (i-2);
        }


        //ÜBUNG 3
        public static int fibonacci(int i) {
            if (i == 0){
                return 0;
            }
            if (i == 1){
                return 1;
            }
            return fibonacci(i-1) + fibonacci(i-2);
        }

        public static void printFibonacci() {
            int i = 0;
            int fib;

            while (true){
                fib = fibonacci(i);
                if (fib >= 100){
                    break;
                }
                System.out.println(fib);
                i++;
            }
        }



}

