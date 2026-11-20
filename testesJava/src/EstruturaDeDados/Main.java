package EstruturaDeDados;

public class Main {
    public static void main(String[] args){
        int a = 1;
        int b = a;

        String sa = new String("sa");
        String sb = new String(sa);

        System.out.println(a == b);


        System.out.println(sb.compareTo(sa));

        System.out.println(sa);
        System.out.println(sb);
    }
}
