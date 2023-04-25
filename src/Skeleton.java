public class Skeleton extends Boss {
    private int contStrel;

    public int getContStrel() {
        return contStrel;
    }

    public void setContStrel(int contStrel) {
        this.contStrel = contStrel;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + getContStrel();
    }
}
