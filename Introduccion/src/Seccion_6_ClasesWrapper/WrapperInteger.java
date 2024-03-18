package Seccion_6_ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32767;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
    }
}
