public class Test {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("出错啦");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
