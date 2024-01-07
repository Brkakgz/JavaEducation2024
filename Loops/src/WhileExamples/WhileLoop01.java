package WhileExamples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WhileLoop01 {
    public static void main(String[] args) {
        int start=0,finish=5;
        while(finish>=0){
            System.out.println("Start Değişkenimiz:"
                    +start+"\tFinish Değişkenimiz: "+finish);
            start++;
            finish--;
        }
    }
}