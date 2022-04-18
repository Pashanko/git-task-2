class Main {
    public static void main(String[] args) {
        AnyName myClass = new AnyName();
        System.out.println(myClass.add(1,2));
    }
    class AnyName {
        public int add(int a, int b){
            return a + b;
        }
    }
}
