    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    public class Lenda_testTask2
    {
        public static void main(String[] args) throws IOException
        {
          System.out.print("������� ���:");  
          BufferedReader reader =
                       new BufferedReader(new InputStreamReader(System.in));
            String inpt = reader.readLine();
            if (inpt.equals("��������"))
            {
            System.out.print("������, ��������");
            }
            else {
            System.out.print("��� ������ �����");
            }
           }
    }    
