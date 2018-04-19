public class Main {  

        public static void main(String[] args) {
            
            Box box = new Box();
            box.set("Text string");
            System.out.println(box.get());

            box.set(new LinkedListVsArrayList());
            System.out.println(box.get());


            BoxList<String> jk = new BoxList<>();
            jk.add("Claus");
            System.out.println(jk.get());

            BoxList<LinkedListVsArrayList> jkk = new BoxList<>();
            jkk.add(new LinkedListVsArrayList());
            System.out.println(jkk.get());

            ITestRepository<User> test = new TestRepository();
            test.create(new User());



        }
}