package org.bhanu.hanscon.structure;

import org.junit.Test;

/**
 * Created by bvadhera on 12/11/17.
 * 1 control structure from nested for loops.
 */
public class NestedStructureTest {

    @Test
    /**
     * This control structure is nested for loops.
     * where dots (.) are decrementing but numbers are incrementing.
     */
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

    /**
     * Prints rhe text for both cases when dots are decrementing but numbers are incrementing.
     * @param arg1 size - variable size
     * @param arg2 count - the count for which we have to print.
     * @param arg3 text - the actual text
     * @param arg4 incremented - boolean value to decide if we are incrementing or decrementing
     *             the text
     */
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
    /**
     * Rewriting This control structure to only use 1 control structure
     * where dots (.) are decrementing but numbers are incrementing.
     */
    public void checkNestedStructureWithStream() {
        final int n = 6;
        for (int i = 1; i <= n; i++) {
            printText(n, i, ".", false);
            printText(n, i, "" + i, true);
            System.out.println();
        }
    }
}
