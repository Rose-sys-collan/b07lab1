public class Polynomial {
    double[] coefficients;

    public Polynomial() {
        coefficients = new double[1];
        coefficients[0] = 0;
    }

    public Polynomial(double[] nums) {
        coefficients = new double [nums.length];
        for (int i=0; i<nums.length; i++)
        {
            coefficients[i] = nums[i];
        }
    }

    public Polynomial add(Polynomial poly) {
        int maxlen = Math.max(this.coefficients.length, poly.coefficients.length);
        double[] res = new double[maxlen];
        for (int i=0; i<this.coefficients.length; i++) {
            res[i] += this.coefficients[i];
        }
        for (int i=0; i<poly.coefficients.length; i++) {
            res[i] += poly.coefficients[i];
        }
        return new Polynomial(res);
    }

    public double evaluate(double x) {
        double res = 0;
        for (int i=0; i<this.coefficients.length; i++ )
        {
            res += coefficients[i] * Math.pow(x, i);
        }
        return res;
    }

    public boolean hasRoot(double x) {  
        return evaluate(x) == 0;
    }
}