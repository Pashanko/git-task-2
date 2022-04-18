class Main {
    public static void main(String[] args) {
        AnyName myClass = new AnyName();
        System.out.println(myClass.add(1,2));
    }
    class AnyName {
        public int add(int a, int b){
            return a + b;
        }
        public int sub(int a, int b){
            return a - b;
        }
        public int div(int a, int b){
            return a / b;
        }
        public int mult(int a, int b){
            return a * b;
        }
        public int sqrt(int x){
            if (x == 0) return 0;
            double last = 0.0;
            double res = 1.0;
            while (res != last) {
                last = res;
                res = (res + x / res) / 2;
            }
            return res;
        }
    }
}
