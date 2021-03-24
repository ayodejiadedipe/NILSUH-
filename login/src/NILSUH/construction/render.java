/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction;

/**
 *
 * @author orley
 */
public class render {
    
    //params should be in feet
	
		//calculates the volume of sand and bags of cement required for the rough cast of a wall 
		public static String estRen(float l, float h) {
			
			//NEED TO ADD THE RETURN STATEMENTS FOR THE VARIOUS LINES 

			Double vol = ((l * h * 0.083333 * 2) * 1.5) / 4;
			String s = "";
			
			//calculates the number of bags of cement required for rough cast
			Double r_cement = Math.ceil(vol / 1.23);
			s += "Number of bags of cement for rough cast: " + r_cement + "\n";
			
			//calculates the volume of sand required for rough cast 
			Double r_sand = vol * 3;
			s += "Volume of sand for rough cast (cubic feet): " + r_sand + "\n";
			
			Double vol_1 = ((l * h * 2 * 0.041667) * 1.5) / 4;
			
			//calculates the number of cement for a granite wall 
			Double g_cement = Math.ceil(vol_1 / 1.23);
			s += "Number of bags of cement for granite wall: " + g_cement + "\n";
			
			//calculates the volume of sand for granite wall
			Double g_sand = vol_1 * 3;
			s += "Volume of sand for granite wall (cubic feet): " + g_sand + "\n";
			
			//calculates the total bags of cement for granite wall
			Double t_cement = r_cement + g_cement;
			s += "Total number of bags of cement for granite wall: " + t_cement + "\n";
			
			//Calculates the total volume of sand for granite wall 
			Double t_sand = r_sand + g_sand;
			s += "Total volume of sand required for granite wall: " + t_sand + "\n";
			
			return s;
		}
		
		

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			System.out.println(render.estRen(45,60));
		}
}
