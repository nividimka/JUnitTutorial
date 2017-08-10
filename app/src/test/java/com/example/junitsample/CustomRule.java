package com.example.junitsample;

import android.util.Log;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by Tom on 10.08.2017.
 */

public class CustomRule implements TestRule {
    private Statement base;
    private final String TAG = CustomRule.class.getSimpleName();
    private Description description;

    @Override
    public Statement apply(Statement base, Description description) {
        this.base = base;
        this.description = description;
        return new LogStatement(base);
    }

    public class LogStatement extends Statement {
        private final Statement base;

        public LogStatement(Statement base) {
            this.base = base;
        }

        @Override
        public void evaluate() throws Throwable {
            System.out.println(TAG + " : " + description.getMethodName() + "Started");
            try {
                base.evaluate();
            } finally {
            System.out.println(TAG + " : " + description.getMethodName() + "Finished");
            }
        }
    }
}
