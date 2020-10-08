package ru.klaw.moex;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.reactivex.Maybe;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import ru.klaw.moex.types.response1.Response1;

import javax.inject.Inject;

@MicronautTest
@Slf4j
public class MoexApiCommandTest {
    @Inject
    @Client("moex")
    MoexApi client;

    @Test
    public void example() {
        final Maybe<Response1> maybe = client.get1("SBER", 0);
        log.info(maybe.blockingGet().toString());
    }
}
