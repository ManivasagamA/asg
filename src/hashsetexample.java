import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h= new HashSet<String>();
h.add("Mani");
h.add("Mani1");
h.add("Mani2");

/*System.out.println(h);
h.remove("Mani");
System.out.println(h);
h.remove("Mani1");
System.out.println(h.isEmpty());*/
Iterator <String> is=h.iterator();

while (is.hasNext())
{
	System.out.println(is.next());
}
HashMap<Integer, String>  hm= new HashMap<Integer, String>();
hm.put(0, "Apple");
hm.put(1, "Banana");
hm.put(2, "Custard");
System.out.println(hm.get(2));
hm.remove(1);
Set se= hm.entrySet();
Iterator it =se.iterator();

while(it.hasNext())
{
	//System.out.println(it.next());
	Map.Entry mp =(Map.Entry)it.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
	}
	

	
	}
}
