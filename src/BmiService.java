public class BmiService {
    public int calculate (double m, double h) {
        double imt = m / (h * h);
        return (int) imt;
    }
}
