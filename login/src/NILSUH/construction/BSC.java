package construction;

/**
 * 
 * @author orley
 *
 */

public class BSC {
	
	//to determine the materials required for beams, columns and slabs
	
		public static String estBSC(float strength, float length, float width, float height) {
			
			Double st = new Double(strength);
			Double l = new Double(length);
			Double w = new Double(width);
			Double h = new Double(height);
			Double vol = l * w * h * 1.5;
			Double cement, sand, gravel;
			Double vol_1 = vol / 4;
			Double vol_2 = vol / 5.5;
			String c = "Bags of cement: ";
			String s = "Volume of sand: ";
			String g = "Volume of gravel: ";
			
			if(st == 4000){
				cement = Math.ceil(vol_1 / 1.23);
				sand = vol_1 / 1;
				gravel = vol_1 * 2;
				c += cement + "\n";
				s += sand + "\n";
				g += gravel + "\n";
			}
			else if(st == 3000){
				cement = Math.ceil(vol_2 * 1.23);
				sand = vol_2 * 1.5;
				gravel = vol_2;
				c += cement + "\n";
				s += sand + "\n";
				g += gravel + "\n";
			}
			return c + s + g;
		}

		public static void main(String[] args) {
			System.out.println("test1");
			System.out.println(BSC.estBSC(4000,500,300,200));
			System.out.println("test2 \n");
			System.out.println(BSC.estBSC(4000, 1500, 1300, 7000));
			System.out.println("test3 \n");
			System.out.println(BSC.estBSC(3000, 700, 400, 900));
			System.out.println("test4 \n");
			System.out.println(BSC.estBSC(3000, 7000, 3000, 5000));
			// TODO Auto-generated method stub

		}


}
