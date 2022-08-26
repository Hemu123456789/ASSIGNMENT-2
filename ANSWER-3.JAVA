public class twinPrimeNo.

{ public static void main(String[] args)

{ int ct=0, n=0, i=1, j=1, db=0; int[]

array= new int[25]; // 1 between 100 there are 25 pieces

System.out.println("Twin primes paires:");
while(n<array.length) { j=1; ct=0;

while(j<=i) { if(i%j==0) { ct++; } j++; }

if(ct==2) { //System.out.println(i);

array[n]=i; //All prime numbers between 1-100 n++; } i++; }

for( int a=0; a<array.length-1;a++) { //You need array.length-1 because You won't able to array[26]-array[27] because array[27] doesn't exist //
System.out.println("PrimeNumbers:"+

array[a]); if(array[a]-array[a+1]==-2)

{ db++; System.out.println(array[a]+"\t|\t"+array[a+1]); } }

System.out.println("Number of TwinPrime: "+db); }

}
