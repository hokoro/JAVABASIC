public class Literal_Java {
    public static void main(String[] args) {

        /*정수 리터럴*/
        int n = 15;
        int m = 015; // 8진수
        int k = 0x15; // 16진수
        int b = 0b0101; // 2진수

        long g = 24L; // long 타입

        System.out.println(n);
        System.out.println(m);
        System.out.println(k);
        System.out.println(b);
        System.out.println(g);

        /*실수 리터럴*/
        double d = 0.1234;
        double e = 1234E-4;
        float f = 0.1234f;
        double w  = .1234D;

        System.out.println(d); // 0.1234
        System.out.println(e); // 0.1234
        System.out.println(f); // 0.1234
        System.out.println(w); // .1234

        /*문자 리터럴*/
        char a = 'a';
        char c = '글';
        //char q = u0041;
        //char o = uae00;

        System.out.println(a);
        System.out.println(c);
        //System.out.println(q);
        //System.out.println(o);

        /*논리 리터럴*/
        boolean tt  = true;
        boolean ff = false;

        System.out.println(tt);
        System.out.println(ff);
        System.out.println(10>0); // Always True

    }
}
