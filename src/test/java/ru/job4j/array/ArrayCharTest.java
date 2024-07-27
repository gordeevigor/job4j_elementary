package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenWordShorterThanPrefixAndFirstCharSameThenFalse() {
        char[] word = {'H'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }

    @Test
    public void whenWordShorterThanPrefixAndFirstCharNotSameThenFalse() {
        char[] word = {'M'};
        char[] prefix = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, prefix);
        assertThat(result).isFalse();
    }
}