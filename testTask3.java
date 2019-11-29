    import java.io.IOException;
   
    public class testTask3
    {
        public static void main(String[] args) throws IOException
        {
          int[] testArray = new int[20];
          //there should be methods, filling array with data
          //i'll fill my array manually 
         int b = testArray.length;
          for (int a=0; a < b; a++) {
            testArray[a] = a + 1; //Math.floor(Math.random() * 11); //fills array cell with random integer from "0" to "10". Received type mismatch
         }
          //now lets select and display cells filled with numbers multiple to 3
          for (int c=0; c < b; c++) {
            if (testArray[c] % 3 == 0) {
            System.out.print(testArray[c]);
            }
          }
            }
           }
        
