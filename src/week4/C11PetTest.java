package week4;

public class C11PetTest {

    public static void main(String[] args) {
        
        C11Pet pc1 = new C11PetCat();
        C11Pet pd1 = new C11PetDog();
        
        System.out.println("The cat says " + pc1.speak());
        System.out.println("The dog says " + pd1.speak());
    }
    
}
