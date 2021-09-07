public class TestC {
        private int age;
        private String name;
        private int testint;

        public TestC(int age) {
            this.age = age;
        }

        public TestC(int age, String name) {
            this.age = age;
            this.name = name;
        }

        private TestC(String name) {
            this.name = name;
        }

        public TestC() {
        }
}
