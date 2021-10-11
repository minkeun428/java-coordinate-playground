package coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("좌표를 입력하세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        System.out.println("str = " + str);

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 24; i > 0; i--) {
            if(i % 2 == 0) {
                sb.append(i);
            }
            sb.append("|");
            sb.append("\n");
        }
        System.out.print(sb);
        sb2.append(" ");
        for (int i = 0; i < 24; i++) {
            sb2.append("ㅡ");
        }
        System.out.println(sb2);
        
    }
}
