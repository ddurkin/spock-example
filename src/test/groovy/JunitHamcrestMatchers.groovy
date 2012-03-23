import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat
import org.junit.Test
import groovy.transform.EqualsAndHashCode
import static spock.util.matcher.HamcrestMatchers.closeTo;
/**
 * Created by IntelliJ IDEA.
 * User: ddurkin
 * Date: 3/22/12
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
class JunitHamcrestMatchers {

    @Test
    public void comparingTwoDecimalNumbers() {
        def myPi = 3.14
        assertThat(myPi, closeTo(Math.PI, 0.01))
    }

    @Test
    public void shouldBeTheSamePerson() {
        Dog me = new Dog(name: "Ralf");
        Dog theOther = new Dog(name: "Ralf");
        assertThat(me, is(theOther));
    }

    @Test
    public void shouldHaveFixedSizeNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(numbers.size(), is(equalTo(5)));
    }


}

@EqualsAndHashCode
class Dog {
    String name
}
