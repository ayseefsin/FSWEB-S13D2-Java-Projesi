public class Main {

    public static void main(String[] args) {

    System.out.println("case1.1: " +isPolindrome(-1221));
    System.out.println("case1.2: " +isPolindrome(707));
    System.out.println("case1.3: " +isPolindrome(11212));
    System.out.println("case2.1perfect: " +isPerfect(6) );
    System.out.println("case2.2perfect: " +isPerfect(28) );
    System.out.println("case2.3perfect: " +isPerfect(5) );
    System.out.println("case2.4perfect: " +isPerfect(-1) );
    System.out.println("case3.1perfect: " +numbersToString(123) );
    System.out.println("case3.1perfect: " +numbersToString(1010) );
    System.out.println("case3.1perfect: " +numbersToString(-12) );

    }
    public static boolean isPolindrome(int number){
    number = Math.abs(number);
    char[] digits = String.valueOf(number).toCharArray();
    StringBuilder reversed= new StringBuilder();
    for(int i =  digits.length-1;i>=0;i-- ){
        reversed.append(digits[i]);
    }
    return reversed.toString().equals(String.valueOf(number));
    }
    public static boolean isPerfect(int number){
        if(number<=0){return false;}
        int sum=1;
        for(int i = number/2; i>1; i--){
            if(number % i == 0)sum+=i;
        }
        return sum == number;
    }
    public static String numbersToString(int number){
        if(number<0){
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String string = "";
        for(char digit:digits){
            switch (digit){
                case '0':
                    string+="zero ";
                    break;
                case '1':
                    string+="one ";
                    break;
                case '2':
                    string+="two ";
                    break;
                case '3':
                    string+="three ";
                    break;
                case '4' :
                    string+="four";
                    break;
                case '5' :
                    string+="five";
                    break;
                case '6':
                    string+="six";
                    break;
                case '7':
                    string+="seven";
                    break;
                case '8':
                    string+="eight";
                    break;
                case '9':
                    string+="nine";
            }
        }
        return string.trim();
    }
}