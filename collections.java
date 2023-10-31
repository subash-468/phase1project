import java.util.ArrayList;
public class collections{
	 public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.add("cricket");
list.add("volleyball");
list.add("carrom");
String games = list.get(1);
for (String item : list) {
    System.out.println(item);
}
}
}