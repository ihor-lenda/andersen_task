    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    public class testTask2
    {
        public static void main(String[] args) throws IOException
        {
          System.out.print("Введите имя:");  
          BufferedReader reader =
                       new BufferedReader(new InputStreamReader(System.in));
            String inpt = reader.readLine();
            if (inpt.equals("Вячеслав"))
            {
            System.out.print("Привет, Вячеслав");
            }
            else {
            System.out.print("Нет такого имени");
            }
           }
    }    
