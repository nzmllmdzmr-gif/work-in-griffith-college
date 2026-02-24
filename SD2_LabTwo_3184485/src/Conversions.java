/**
 Name: Zihan Wang
 Student Number: 3184485
 */
public class Conversions {

    public double euroToDollar(double euro) {
        return euro * 1.08;// Stubs
    }

    public double dollarToEuro(double dollar) {
        return dollar / 1.08;
    }

    public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }
    public String integerToString(int val) {
        return String.valueOf(val);
    }

    public String switchCase(String val) {
        char[] chars = val.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}