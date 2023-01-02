package org.example;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add() throws IOException {
        if (count < 0) {
            throw new IOException();
        }
        this.count++;

    }

    @Override
    public void close() {
        this.count = -1;
    }

    public boolean isClosed() {
        if (this.count == -1) {
            return true;
        }
        return false;
    }
}
