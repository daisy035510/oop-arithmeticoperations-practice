package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {

        // given
        User user = new User();

        // when
//        user.initPassword(new CorrectFixedPasswordGenerator());
        user.initPassword(() -> "123456789"); // CorrectFixedPasswordGenerator 가 functional interface 이기 때문에 람다로 간단히 구현 가능함

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않늦ㄴ다.")
    @Test
    void passwordTest2() {

        // given
        User user = new User();

        // when
//        user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(() -> "12"); // WrongFixedPasswordGenerator가 functional interface 이기 때문에 람다로 구현 가능함

        // then
        assertThat(user.getPassword()).isNull();
    }

}