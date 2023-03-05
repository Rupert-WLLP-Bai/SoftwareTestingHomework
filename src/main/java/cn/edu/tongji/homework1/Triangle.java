package cn.edu.tongji.homework1;

/**
 * 三角形类
 */
public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * 判断三角形是否合法
     */
    public boolean isLegal() {
        // 如果输入参数中有小于等于0的数，那么三角形不合法
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        // 如果任意两边之和小于第三边，那么三角形不合法
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * 判断三角形的类型
     *
     * @return 三角形的类型，可能的值为：等边三角形、等腰直角三角形、等腰锐角三角形、等腰钝角三角形、直角三角形、锐角三角形、钝角三角形、无法构成三角形
     */
    public String classify() {
        // 首先判断三角形是否合法
        if (!isLegal()) {
            return "无法构成三角形";
        }
        if (a == b && b == c) {
            return "等边三角形";
        }
        if (a == b || b == c || a == c) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "等腰直角三角形";
            }
            if (a * a + b * b > c * c && a * a + c * c > b * b && b * b + c * c > a * a) {
                return "等腰锐角三角形";
            }
            return "等腰钝角三角形";
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "直角三角形";
        }
        if (a * a + b * b > c * c && a * a + c * c > b * b && b * b + c * c > a * a) {
            return "锐角三角形";
        }
        return "钝角三角形";
    }
}
