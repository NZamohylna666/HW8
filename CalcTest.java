package MyCalc;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    Calculator calc = new Calculator();
    @Test
    public void summ() {
        Assert.assertEquals(calc.summ(1, 2), 3);
        Assert.assertEquals(calc.summ(0, 2), 2);
        Assert.assertEquals(calc.summ(1, 0),1);
        Assert.assertEquals(calc.summ(0, 0), 0);
        Assert.assertEquals(calc.summ(0, -1), -1);
        Assert.assertEquals(calc.summ(-1, 0), -1);
        Assert.assertEquals(calc.summ(-1, -2), -3);
        Assert.assertEquals(calc.summ(-1, 2),1);
        Assert.assertEquals(calc.summ(1, -2), -1);
    }

        @Test
        public void sub(){
            Assert.assertEquals(calc.sub(2, 1), 1);
            Assert.assertEquals(calc.sub(1, 2),-1);
            Assert.assertEquals(calc.sub(1, 1), 0);
            Assert.assertEquals(calc.sub(1, 0), 1);
            Assert.assertEquals(calc.sub(0, 1), -1);
            Assert.assertEquals(calc.sub(0, 0), 0);
            Assert.assertEquals(calc.sub(-1, 0),-1);
            Assert.assertEquals(calc.sub(0, -1),1);
            Assert.assertEquals(calc.sub(-1, -1), 0);
            Assert.assertEquals(calc.sub(-1, -2), 1);
            Assert.assertEquals(calc.sub(-1, -1), 0);

    }
         @Test
        public void multi(){
        Assert.assertEquals(calc.multi(2, 2), 4);
        Assert.assertEquals(calc.multi(1, 2), 2);
        Assert.assertEquals(calc.multi(2, 1), 2);
        Assert.assertEquals(calc.multi(0, 2), 0);
        Assert.assertEquals(calc.multi(2, 0), 0);
        Assert.assertEquals(calc.multi(0, 0), 0);
        Assert.assertEquals(calc.multi(-2, 0),0);
        Assert.assertEquals(calc.multi(0, -2),0);
        Assert.assertEquals(calc.multi(-2, 2),-4);
        Assert.assertEquals(calc.multi(-2, 1),-2);
        Assert.assertEquals(calc.multi(2, -2),-4);
        Assert.assertEquals(calc.multi(2, -1),-2);
        Assert.assertEquals(calc.multi(-2, -1),2);
        Assert.assertEquals(calc.multi(-2, -2), 4);
    }
    @Test
    public void div(){
        Assert.assertEquals(calc.div(4, 2), 2);
        Assert.assertEquals(calc.div(2, 2), 1);
        Assert.assertEquals(calc.div(2, 1), 2);
        Assert.assertEquals(calc.div(0, 2), 0);
        Assert.assertEquals(calc.div(0, 1), 0);
        Assert.assertEquals(calc.div(0, -2), 0);
        Assert.assertEquals(calc.div(0, -1), 0);
        Assert.assertEquals(calc.div(-4, 2), -2);
        Assert.assertEquals(calc.div(4, -2), -2);
        Assert.assertEquals(calc.div(-2, 1), -2);
        Assert.assertEquals(calc.div(2, -1), -2);
        Assert.assertEquals(calc.div(-2, -1), 2);
        Assert.assertEquals(calc.div(-4, -2), 2);
        Assert.assertEquals(calc.div(-2, -2), 1);
    }

}



