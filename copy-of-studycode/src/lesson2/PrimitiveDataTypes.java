package lesson2;

public class PrimitiveDataTypes {
        public static void main(String [] args){
                byte num0b = 0b1100;
                byte num1b = 014;
                byte num2b = 12;
                byte num3b = 0xC;
                System.out.printf("num0 = %d\nnum1 = %d\nnum2 = %d\nnum3 = %d\n\n", num0b, num1b, num2b, num3b);
                short num0s = -0b0101_0001_0100;
                short num1s = -02424;
                short num2s = -1300;
                short num3s = -0x514;
                System.out.printf("num0 = %d\nnum1 = %d\nnum2 = %d\nnum3 = %d\n\n", num0s, num1s, num2s, num3s);
                int num0i = 0;
                int num1i = 0;
                int num2i = 0;
                int num3i = 0;
                System.out.printf("num0 = %d\nnum1 = %d\nnum2 = %d\nnum3 = %d\n\n", num0i, num1i, num2i, num3i);
                long num0l = 0b0111010110111100110100010101;
                long num1l = 0726746425;
                long num2l = 123456789;
                long num3l = 0x7_5B_CD_15;
                System.out.printf("num0 = %d\nnum1 = %d\nnum2 = %d\nnum3 = %d\n\n", num0l, num1l, num2l, num3l);
                double var1d = 2342.12385;
                double var2d = 232.4324242342434d;
                float var1f = 434.342f;
                float var2f = 424.113f;
                String strdouble = String.format("%.1f", 1.9829);
                System.out.println(strdouble);
                System.out.printf("num0double = %f\nnum1double = %f\nnum2float = %f\nnum3float = %f\n\n", var1d, var2d, var1f, var2f);

                char symbol = 'a';
                char symbol_unicode = 300;
                char symbol_unicode_16 = '\u012c';
                System.out.printf("without_unicode = %s,unicode1 = %s, unicode2 = %s", symbol, symbol_unicode, symbol_unicode_16 );


        }
}