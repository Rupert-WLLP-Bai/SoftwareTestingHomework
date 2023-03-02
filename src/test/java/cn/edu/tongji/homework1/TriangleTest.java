package cn.edu.tongji.homework1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    // 测试三角形的合法性
    // 1. 存在非法输入
    @Test
    void testIllegalInput() {
        assertFalse(new Triangle(0, 0, 0).isLegal());
        assertFalse(new Triangle(-1, 0, 1).isLegal());
    }

    // 2. 任意两边之和小于第三边
    @Test
    void testIllegalTriangle() {
        assertFalse(new Triangle(1, 1, 3).isLegal());
        assertFalse(new Triangle(1, 4, 2).isLegal());
    }

    // 3. 三角形合法
    @Test
    void testLegalTriangle() {
        assertTrue(new Triangle(1, 1, 1).isLegal());
        assertTrue(new Triangle(2, 3, 4).isLegal());
    }

    // 测试三角形的类型
    // 1. 等边三角形
    @Test
    void testEquilateralTriangle() {
        assertEquals("等边三角形", new Triangle(1, 1, 1).classify());
        assertEquals("等边三角形", new Triangle(2, 2, 2).classify());
    }

    // 2. 等腰三角形
    @Test
    void testIsoscelesTriangle() {
        assertEquals("等腰三角形", new Triangle(4, 4, 2).classify());
        assertEquals("等腰三角形", new Triangle(2, 3, 2).classify());
    }

    // 3. 直角三角形
    @Test
    void testRightTriangle() {
        assertEquals("直角三角形", new Triangle(3, 4, 5).classify());
        assertEquals("直角三角形", new Triangle(5, 12, 13).classify());
    }

    // 4. 锐角三角形
    @Test
    void testAcuteTriangle() {
        assertEquals("锐角三角形", new Triangle(3, 4, 3.5).classify());
        assertEquals("锐角三角形", new Triangle(5, 12, 11).classify());
    }

    // 5. 钝角三角形
    @Test
    void testObtuseTriangle() {
        assertEquals("钝角三角形", new Triangle(3, 4, 6).classify());
        assertEquals("钝角三角形", new Triangle(5, 12, 15).classify());
    }
}