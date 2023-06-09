public class ELIPSEE {

    float a;
    float b;
    float c;
    float x;
    float y;
    float foco;

    public ELIPSEE(float a, float b, float c, float x, float y, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.y = y;
        this.foco = 4;
    }
    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
    //UNO
    private float distanciaSemiejes() {
        return this.h = (this.a - this.b) / (this.a + this.b);
    }
    private double perimetroElipse () {
        return (float) (3.14 * ((1 + 3 * this.h) / (Math.pow((10 + (4 - 3 * this.h)), 0.5))));
    }
    public float area ( float a, float b ){//donde "a" y "b" son los semiejes mayor y menor
        float A = (float) ((3.14) * a * b);
        return A;
    }
    public void setPunto_central(float h) {
        this.foco = foco;
    }
    public float getFoco(){
        fococ();
        return foco;
    }
    public void fococ(){
        foco = (a*a) - (b*b);
    }
//final
}
