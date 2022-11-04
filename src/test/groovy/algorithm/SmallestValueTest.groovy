package algorithm

import spock.lang.Specification
import spock.lang.Subject


class SmallestValueTest extends Specification {
    static F_4 = 24
    static F_5 = 120
    static F_6 = 720
    static F_10 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10
    static F19 = 121_645_100_408_832_000
    static F20 = 2_432_902_008_176_640_000

    def "should find smallest value"() {

        given:
        @Subject def function = new SmallestValue()

        expect:
        function.applyAsInt(m) == n

        where:
        m             | n
        -1            | 0
        0             | 0
        1             | 2
        2             | 3
        23            | 4
        F_4           | 5
        100           | 5
        119           | 5
        120           | 6
        F_6           | 7
        F_10 - 1      | 10
        F_10          | 11
        F_10 + 1      | 11
        6_227_020_800 | 14
        F19 - 1       | 19
        F19           | 20
        F19 + 1       | 20
        F20 - 1       | 20
        F20           | 21
    }
}
