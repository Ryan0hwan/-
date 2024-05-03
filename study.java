# 정수형 1개 선언, 변수에 저장, 변수 출력
import java.io.*;

public class Main{
  public static void main(String []args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    System.out.print(a);
  }
}

  
# 정수형 2개 선언, 변수에 저장, 변수 출력
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        System.out.print(a + " " + b);
    }
}


# 연.월.일. 입력받아, 연,월,일을 yyyy.mm.dd형식으로 출력
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String arr[] = a.split("\\.");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);

        System.out.format("%04d.%02d.%02d", A, B, C);
    }
}

# 1025. 정수 1개 입력받고, 나누어 출력하기. 
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split("");
        
        for(int i = 0; i <5 ; i++){
            int k = Integer.parseInt(arr[i]);
            System.out.println("[" +(int)(k*Math.pow(10,4-i))+ "]");
        }
    }
}

