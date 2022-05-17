package explore_java_lang;

public class ProcessBuilderDemo {
    public static void main(String[] args){
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "testFile");
            processBuilder.start();
        }catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
