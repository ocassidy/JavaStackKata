import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack testStack;

    @Before
    public void setup () {
        this.testStack = new Stack(10);
    }

    @Test
    public void addToStack () {
        testStack.push(1);
        Assert.assertEquals(1, testStack.size());
    }

    @Test
    public void removeFromStack () {
        testStack.push(1);
        testStack.pop();

        Assert.assertTrue(testStack.isEmpty());
    }

    @Test
    public void addMultipleToStack () {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        Assert.assertEquals(4, testStack.size());
    }

    @Test
    public void removeMultipleFromStack () {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        testStack.pop();
        testStack.pop();

        Assert.assertTrue(testStack.isEmpty());
    }

    @Test
    public void findTopElement () {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        Assert.assertEquals(3, testStack.top());
    }

    @Test
    public void isClear () {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.clear();

        Assert.assertTrue(testStack.isEmpty());
    }

    @Test
    public void getSize () {
        testStack.push(1);
        testStack.push(2);
        testStack.push(2);

        Assert.assertEquals(3, testStack.size());
    }

    @Test
    public void addMultipleStringToStack () {
        testStack.push("A");
        testStack.push("B");
        testStack.push("c");
        testStack.push("d");
        Assert.assertEquals(4, testStack.size());
    }

    @Test
    public void addMultipleTypeToStack () {
        testStack.push('A');
        testStack.push(2);
        testStack.push(8);
        testStack.push("d");

        Assert.assertEquals(4, testStack.size());
    }
}
