public class Math{
  public static void main(String args[]){
    int num = 1234;
    int rev = 0;
    int lastNum = num % 10;
    rev = lastNum * 1000;
    num = num/10;
    int thirdNum = num % 10;
    num = num/10;
    rev =lastNum * 1000 + thirdNum * 100;
    int secondNum = num % 10;
    num = num/10;
    rev = secondNum * 10 +lastNum * 1000 + thirdNum * 100;
      int firstNum  = num % 10;
    num = num/10;
    rev = secondNum * 10 +lastNum * 1000 + thirdNum * 100 + firstNum;
    System.out.println(rev);
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;  
    int i2 = 18;
    double pi = 57.2 * (i1/i2) + 1;
    System.out.println(pi);
    double pe = 57.2 * ((double)i1/i2) + 1;
    System.out.println(pe);
    double pr = 15 - i1 * (d1 * 3) + 4;
    System.out.println(pr);
    double pt = 15 - i1 * ((int)d1 * 3) + 4;
     System.out.println(pt);
     double py = 15 - i1 *(int)(d1 * 3) + 4;
     System.out.println(py);

Scanner camel = new Scanner(System.in);
System.out.println(“Input a word up to 5 letters”);
String word = camel.nextLine();
String ptT = word.substring();
String ptO =word.substring(0);
String ptT =word.substring(1);
String ptR =word.substring(2);
String ptF =word.substring(3);
String ptV =word.substring(4);
    if (ptT = 4)&&(ptO=ptV) && (ptT=ptF){
System.out.println(“Palindrome”);
}else{
    if (ptT = 3)&&(ptO=ptF) && (ptT=ptR){
System.out.println(“Palindrome”);
}else{
    if (ptT = 2)&&(ptO=ptR){
System.out.println(“Palindrome”);

  }
}