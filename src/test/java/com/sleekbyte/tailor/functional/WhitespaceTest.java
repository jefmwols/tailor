package com.sleekbyte.tailor.functional;

import com.sleekbyte.tailor.common.Messages;
import com.sleekbyte.tailor.common.Severity;
import com.sleekbyte.tailor.output.Printer;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WhitespaceTest extends RuleTest {

    @Override
    protected void addAllExpectedMsgs() {
        // Operator declarations
        addExpectedMsg(3, 18, Messages.OPERATOR + Messages.SPACE_BEFORE);
        addExpectedMsg(5, 17, Messages.OPERATOR + Messages.SPACE_AFTER);
        addExpectedMsg(7, 18, Messages.OPERATOR + Messages.SPACE_AFTER);
        addExpectedMsg(7, 18, Messages.OPERATOR + Messages.SPACE_BEFORE);
        addExpectedMsg(9, 19, Messages.OPERATOR + Messages.SPACE_BEFORE);
        addExpectedMsg(11, 16, Messages.OPERATOR + Messages.SPACE_AFTER);
        addExpectedMsg(18, 16, Messages.OPERATOR + Messages.SPACE_BEFORE);
        addExpectedMsg(21, 1, Messages.OPERATOR + Messages.SPACE_AFTER);
        addExpectedMsg(26, 5, Messages.OPERATOR + Messages.SPACE_AFTER);

        // Colons in type annotations
        int start = 35;
        addExpectedMsg(start, 7, Messages.COLON + Messages.AT_COLUMN + 7 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 1, 6, Messages.COLON + Messages.AT_COLUMN + 6 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 4, 11, Messages.COLON + Messages.AT_COLUMN + 11 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 5, 17, Messages.COLON + Messages.AT_COLUMN + 17 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 8, 13, Messages.COLON + Messages.AT_COLUMN + 13 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 9, 14, Messages.COLON + Messages.AT_COLUMN + 14 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 12, 44, Messages.COLON + Messages.AT_COLUMN + 44 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 12, 44, Messages.COLON + Messages.AT_COLUMN + 44 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 13, 17, Messages.COLON + Messages.AT_COLUMN + 17 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 16, 13, Messages.COLON + Messages.AT_COLUMN + 13 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 16, 13, Messages.COLON + Messages.AT_COLUMN + 13 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 16, 37, Messages.COLON + Messages.AT_COLUMN + 37 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 20, 33, Messages.COLON + Messages.AT_COLUMN + 33 + " " + Messages.NO_SPACE_BEFORE);

        // Colons in dictionaries
        start = 58;
        addExpectedMsg(start, 41, Messages.COLON + Messages.AT_COLUMN + 41 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 1, 25, Messages.COLON + Messages.AT_COLUMN + 25 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 3, 26, Messages.COLON + Messages.AT_COLUMN + 26 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 4, 19, Messages.COLON + Messages.AT_COLUMN + 19 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 5, 41, Messages.COLON + Messages.AT_COLUMN + 41 + " " + Messages.NO_SPACE_BEFORE);

        // Switch case colons
        start = 66;
        addExpectedMsg(start + 1, 17, Messages.COLON + Messages.AT_COLUMN + 17 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 2, 16, Messages.COLON + Messages.AT_COLUMN + 16 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 4, 9, Messages.COLON + Messages.AT_COLUMN + 9 + " " + Messages.NO_SPACE_BEFORE);
        addExpectedMsg(start + 9, 34, Messages.COLON + Messages.AT_COLUMN + 34 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 10, 8, Messages.COLON + Messages.AT_COLUMN +  8 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 20, 11, Messages.COLON + Messages.AT_COLUMN + 11 + " " + Messages.SPACE_AFTER);
        addExpectedMsg(start + 22, 10, Messages.COLON + Messages.AT_COLUMN + 10 + " " + Messages.SPACE_AFTER);
    }

    private void addExpectedMsg(int line, int column, String msg) {
        this.expectedMessages.add(Printer.genOutputStringForTest(inputFile.getName(), line, column, Severity.WARNING,
            msg));
    }
}