package org.example;

public class Test {
    private String host;
    private int port;

    private Test( DatabaseBuilder builder) {
        this.host = builder.host;
        this.port = builder.port;

    }

    public static class DatabaseBuilder {
        private String host;
        private int port;

        DatabaseBuilder setHost(String host) {
            this.host = host;
            return this;

        }
        DatabaseBuilder setPort(int port) {
            this.port = port;
            return this;

        }

        public Test build() {
            return new Test(this);
        }

    }
}


