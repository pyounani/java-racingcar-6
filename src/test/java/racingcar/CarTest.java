package racingcar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_전진() {
        Car car = new Car("car1");
        car.go(5);
        assertEquals(1, car.getPosition());
    }

    @Test
    void 자동자_멈춤() {
        Car car = new Car("car2");
        car.go(2);
        assertEquals(0, car.getPosition());
    }

    @Test
    void 자동차_상태_문자열() {
        Car car= new Car("car1", 4);
        assertEquals("car1 : ----", car.getCarStatus());
    }

}