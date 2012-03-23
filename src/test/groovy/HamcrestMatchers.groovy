/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import spock.lang.Specification
import static org.hamcrest.CoreMatchers.equalTo
import static org.junit.Assert.assertThat
import static spock.util.matcher.HamcrestMatchers.closeTo

/**
 * Hamcrest matchers are deeply integrated with Spock's condition mechanism.
 * The syntax for using a matcher in a condition is simple:
 * {@code <expected-value> <matcher>}. If the condition fails, both the usual
 * condition output and the matcher's output will be shown.
 *
 * @author Peter Niederwiser
 * @since 0.5
 */
class HamcrestMatchers extends Specification {
    def "comparing two decimal numbers"() {
        def myPi = 3.14

        expect:
        myPi closeTo(Math.PI, 0.01)
    }

    def "should be the same dog"() {
        Dog me = new Dog(name: "Ralf")
        Dog theOther = new Dog(name: "Ralf")

        expect:
        me == theOther
    }

    def "should have fixed size numbers"() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        expect:
        assertThat(numbers.size() as Integer, is(equalTo(5)));
    }
}