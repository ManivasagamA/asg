import java.util.ArrayList;

public class streamz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> s = new ArrayList<String>();
s.add("Mani");
s.add("hMani1");
s.add("Mani2");
s.add("hMani3");
s.add("Mani4");
/*
 * for(String d:s) { System.out.println(d); }
 */
 s.stream().sorted().forEach(m->System.out.println(m));
//System.out.println(num);

	}

}
