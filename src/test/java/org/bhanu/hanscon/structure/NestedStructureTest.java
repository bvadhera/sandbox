package org.bhanu.hanscon.structure;

import org.junit.Test;

/**
 * Created by ralmonte on 12/10/17.
 */
public class NestedStructureTest {

    @Test
    public void checkNestedStructure() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(".");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void printText(Integer size, Integer count, String text, Boolean incremented) {
        if (incremented) {
            for (int i = 0; i < count; i++) {
                System.out.print(text);
            }
        } else {
            final int limit = size - count;
            for (int i = 0; i < limit; i++) {
                System.out.print(text);
            }
        }
    }

    @Test
    public void checkNestedStructureWithStream() {
        final int size = 6;
        for (int i = 1; i <= size; i++) {
            printText(size, i, ".", false);
            printText(size, i, "" + i, true);
            System.out.println();
        }
    }
}
