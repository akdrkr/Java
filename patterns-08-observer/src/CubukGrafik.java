import java.util.ArrayList;

public class CubukGrafik implements Observer {
	private Veri kaynak;
	private ArrayList<Integer> veri; 
	
	public CubukGrafik(Veri k) {
		veri = new ArrayList<Integer>();
		kaynak = k;
		for(int i : kaynak.veriAl()) veri.add(i);
	}
	
	@Override
	public void Update() {
		veri.clear();
		for(int i : kaynak.veriAl()) veri.add(i);
		System.out.println("Çubuk grafik güncellendi.");
		System.out.println(veri);
	}

}
