import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        float operando1, operando2, res;
        String operador, Bandera;
        int otravez = 1;

        while (otravez == 1)
        {
        System.out.println("¿Que operacion desea hacer? (SUMA, RESTA, MULTIPLICACION, DIVISION) ");
        operador = dat.nextLine().toUpperCase();
            if (operador.equals("SUMA") || operador.equals("RESTA") || operador.equals("MULTIPLICACION") || operador.equals("DIVISION"))
            {
                System.out.println("Dame el operando 1: ");
                operando1 = dat.nextFloat();
                System.out.println("Dame el operando 2: ");
                operando2 = dat.nextFloat();
                switch(operador)
                {
                    case "SUMA" -> {
                        res = operando1 + operando2;
                        System.out.println(operando1 + "+" + operando2 + "= " + res);
                    }
                    case "RESTA" -> {
                        res = operando1 - operando2;
                        System.out.println(operando1 + "-" + operando2 + "= " + res);
                    }
                    case "MULTIPLICACION" -> {
                        res = operando1 * operando2;
                        System.out.println(operando1 + "*" + operando2 + "= " + res);
                    }
                    case "DIVISION" -> {
                        res = operando1 / operando2;
                        System.out.println(operando1 + "/" + operando2 + "= " + res);
                    }
                }
                dat.nextLine();
                System.out.println("Deseas hacer otra operacion? (SI/NO) ");
                Bandera = dat.nextLine().toUpperCase();
                if (Bandera.equals("SI"))
                    otravez = 1;
                else
                    if(Bandera.equals("NO"))
                    otravez = 0;
            }
        }
    }
}