package cn.edu.tongji.homework1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/triangle.csv", numLinesToSkip = 1)
    void classify(int a, int b, int c, String expected) {
        // 输出三角形的三条边
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        // 创建三角形对象
        Triangle triangle = new Triangle(a, b, c);
        // 判断三角形的类型
        String actual = triangle.classify();
        // 断言
        assertEquals(expected, actual);
    }
}