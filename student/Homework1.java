package student;

public class Homework1 {

    public double shippingCalculator(int n){
        double charge = 0;
        if(n > 1){
            charge += 2.95 * (n - 1);
        }
        return charge + 10.95;
    }
    public boolean isValidTriangle(int a, int b, int c){
        if(a < (c + b) && a > Math.abs(b - c)){
            return true;
        } else if (b < (a + c) && b > Math.abs(a - c)) {
            return true;
        } else if (c < (b + a) && c > Math.abs(a - b)) {
            return true;
        }
        return false;
    }
    public boolean isPrime(int number){
        if (number == 1){
            return false;
        } else if (number == 2) {
            return true;
        }
        for (int i = 2;i < Math.sqrt(number);i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public  int hex2int(String hex) {
        Character.toLowerCase(hex.charAt(0));
        switch (hex){
            case "1" :
                return 1;
            case "2" :
                return 2;
            case "3" :
                return 3;
            case "4" :
                return 4;
            case "5" :
                return 5;
            case "6" :
                return 6;
            case "7" :
                return 7;
            case "8" :
                return 8;
            case "9" :
                return 9;
            case "a" :
                return 10;
            case "b" :
                return 11;
            case "c" :
                return 12;
            case "d" :
                return 13;
            case "e" :
                return 14;
            case "f" :
                return 15;
        }
        return -1;
    }
    public String int2hex(int value) {
        switch (value){
            case 1 :
                return "1";
            case 2 :
                return "2";
            case 3 :
                return "3";
            case 4 :
                return "4";
            case 5 :
                return "5";
            case 6 :
                return "6";
            case 7 :
                return "7";
            case 8 :
                return "8";
            case 9 :
                return "9";
            case 10 :
                return "A";
            case 11 :
                return "B";
            case 12 :
                return "C";
            case 13 :
                return "D";
            case 14 :
                return "E";
            case 15 :
                return "F";
        }
        return "-1";
    }


}
