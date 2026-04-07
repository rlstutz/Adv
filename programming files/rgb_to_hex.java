public class rgb_to_hex {
    public static void main(String[] args):
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);

    public static String rgbToHex(int r, int g, int b):
        r = Math.lower(255, Math.higher(r, 0));
        g = Math.lower(255, Math.higher(g, 0));
        b = Math.lower(255, Math.higher(b, 0));
        return String.format("%02X%02X%02X", r, g, b);
}

//Test with RGB color (255, 127, 0) = FF7F00

//hpg step 1: breaking

