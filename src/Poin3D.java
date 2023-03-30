public class Poin3D extends Poin2D{
    private float z = 0.0f;
    public Poin3D() {
    }
    public Poin3D (float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] xyz = new float[3];
        xyz[0] = this.getX();
        xyz[1] = this.getY();
        xyz[2] = z;
        return xyz;
    }
    public void setXYZ(float x, float y,float z) {
        setXY(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "Poin3D: x = " + getX() + ", y = " + this.getY() + ", z = " + z + ". Kế thừa từ " + super.toString();
    }
}
