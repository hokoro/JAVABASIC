public class Variable {
    public static void main(String[] args) {
        boolean TF = true;
        char c = 'a';
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;
        float f = 4;
        double d = 8;

        System.out.println("boolean 값: " +TF + " boolean 크기: " + Byte.SIZE);
        System.out.println("char 값: " +c + " char 크기: "+ Character.SIZE);
        System.out.println("byte 값: "+b + " byte 크기: "+Byte.SIZE);
        System.out.println("short 값: "+s + " short 크기: "+Short.SIZE);
        System.out.println("int 값: "+i + " int 크기: "+Integer.SIZE);
        System.out.println("long 값: "+l + " long 크기: "+Long.SIZE);
        System.out.println("float 값: "+f + " float 크기: "+Float.SIZE);
        System.out.println("Double 값: "+d + " Double 크기: "+Double.SIZE);
    }
}
