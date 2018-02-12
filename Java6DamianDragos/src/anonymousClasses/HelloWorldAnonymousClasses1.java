
package anonymousClasses;

/**
 *
 * @author Dragos
 */
public class HelloWorldAnonymousClasses1 {
    
       interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
        
        // Class FrenchGreetings 
       class FrenchGreeting implements HelloWorld {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        }
         // create frenchGreeting object
        HelloWorld frenchGreeting = new FrenchGreeting();
        
        // Class SpanishGreetings  
        class SpanishGreeting implements HelloWorld {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        }
        // create spanishGreeting object
        HelloWorld spanishGreeting = new SpanishGreeting();
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses1 myApp =
            new HelloWorldAnonymousClasses1();
        myApp.sayHello();
    }   
    
    
    
    
    
    
}
