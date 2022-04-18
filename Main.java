class Main {
    public static void main(String[] args) {
        AnyName myClass = new AnyName();
        System.out.println(myClass.add(1,2));
    }
    class AnyName {
        public int add(int a, int b){
            System.out.println("this is add method for 2 params");
            return a + b;
        }
        public int add(int a, int b, int c){
            System.out.println("this is add method for 3 params");
            return a + b + c;
        }
        public int add(int a, int b, int c, int d){
            System.out.println("this is add method for 4 params");
            return a + b + c + d;
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
