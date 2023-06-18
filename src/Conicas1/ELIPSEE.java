package Conicas1;

public class ELIPSEE {

    float a;
    float b;
    float c;
    float x;
    float y;
    float foco;

    public ELIPSEE(float a, float b, float c, float x, float y, float foco) {
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
        return foco;
    }

    public void setH(float h) {
        this.foco = h;
    }
    //UNO
    private float distanciaSemiejes() {
        float distancia = this.foco = (this.a - this.b) / (this.a + this.b);
        return distancia;
    }
    private double perimetroElipse () {
        float perimetro = (float) (3.14 * ((1 + 3 * this.foco) / (Math.pow((10 + (4 - 3 * this.foco)), 0.5))));
        return perimetro;
    }
    public float area (){//donde "a" y "b" son los semiejes mayor y menor
        float A = (float) ((3.14) * this.a * this.b);
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

    public void imprimir(){
        System.out.println("El area es: "+distanciaSemiejes());
        System.out.println("El perimetro es: "+perimetroElipse());
        System.out.println("El area es: "+area());
        System.out.println("El foco es "+getFoco());
    }
//final
}
