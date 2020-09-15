class palindrone{
  public static void Ispallindrome(int n){
    int rev;
    rev=0;
    int temp = n;
    while(temp>0){
      int D = temp/10;
      int a = D * 10;
      int digit = temp - n;
      rev = rev * 10 + digit;
      temp = D;
    }
    System.out.println("OUTPUT");
    if(rev==a)
      System.out.println(n+" IS PALINDROME NUMBER ");
    else
      System.out.println(n+" IS NOT A PALINDROME NUMBER ");
  }
}

