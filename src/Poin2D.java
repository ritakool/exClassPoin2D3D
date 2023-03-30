public class Poin2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Poin2D() {
    }
    public Poin2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] xy = new float[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setXY(float x, float y){
    x = this.x;
    y = this.y;
    }
    @Override
    public String toString() {
        return "Poin2D : " + "x = " + x + " y = " + y;
    }
}
