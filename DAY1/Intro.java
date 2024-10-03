package HASHMAPS;
public class Intro {
    public static void main(String[] args) {
        // it retrieves value in conatant time O(1)
        // there is no traversing
        // it has key value pairs

        // THEORY:
        // hashcode returns a number using some formula
        // we need all elements as positive number
        // hashcode can be v large so its size needs to be reduced 
        // this is called hashing

        // "Givo" ----> hash("givo") ----> 7

        String name = "Sanya";  
        int code = name.hashCode();
        System.out.println(code);

        Integer a = 23445;
        int code2 = a.hashCode();
        System.out.println(code2);
        // this is hashing

        // when we get multiple elements at the same index collision occours
        // chaining and open addresing can be used to resolve this

        // worst case: all elements at the same index

        // so we use simple uniform hashing
        // assumption ---> n= no.of keys
        // m = size of table
        // n/m expected keys per slot

        // hash functions:
        // 1) division method
        // h(k) = k%m
        // m = prime number 

        // 2) multiplication method
        // h(k) = [(a.k)%2]>>(w-r)
        // a= random number
        // w = number of bits in k
        // m = 2 power r

        // universal hashing
        // h(k) = [(ak+b)%p]%m
        // a and b are random numbers 
        // p is a large prime number

        

        




         





    }
}
