class Main {
  public static void main(String[] args) {

    Guitar guitar = new Guitar();
    guitar.sound();

    // 1. Make the drums, piano, and violin class. Create a new file for each one. All of these should extend the Instrument class.

    // 2.In their sound method make sure to print out "Keys clank" for piano, "Strings twang" for violin, and "Drums go boom" for the drums.

    // 3. Create an object of each new type of instrument that you created like we did with Guitar.
    Piano piano = new Piano();
    piano.sound();
    
    Violin violin = new Violin();
    violin.sound();

    Drums drums = new Drums();
    drums.sound();

    // 4. Call the sound() method on each of the objects.


    // Notice how each sound() method is different but all inherit from the same abstract class.
    
  }
}