/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NILSUH;

/**
 *
 * @author orley
 */
public class estWall {
    
    //calculates the estimate of materials for the construction of a wall given the length and width 
		public static String estQuan(float l, float h) {
			
			String e = "";

			//to determine the area of the wall
			float area = l*h;
			
			//calculates the number of blocks required for the job
			Double blocks = Math.ceil(area/1.0625);
			e += "Number of blocks: " + blocks + "\n";
			
			//calculates the volume of 1/2 inch steel required for the vertical construction in cubic meter
			Double vert = (((l * 12) / 16) + 1) * (h + 6) * 0.668;
			e += "Volume of vertical (1/2 inch) steel (cubic feet): " + vert + "\n";
			
			//calculates the volume of 3/8 inch steel required for the horizontal construction in cubic meter 
			Double horiz = ((h * 12) / 24) * l * 0.375;
			e += "Volume of horizontal (3/8 inch) steel (cubic feet): " + horiz + "\n";
			
			//calculates the volume of mortar required in cubic feet
			Double mortar = (l * h) * 0.04265;
			e += "Volume of mortar (cubic feet): " + mortar + "\n";
			
			//calculates the number of bags of cement required for the joints
			Double j_cement = Math.ceil((((1.5 * mortar) / 4) / 1.23));
			e += "Number of bags of cement for joints: " + j_cement + "\n";
			
			//calculates the volume of sand required for the joints 
			Double j_sand = (((1.5 * mortar) / 4) * 3);
			e += "Volume of sand in joint (cubic feet): " + j_sand + "\n";
			
			//calculates the volume of concrete required for the construction  
			Double p_concrete = Math.ceil(((l * h) * 0.23622));
			e += "Volume of concrete required (cubic feet): " + p_concrete + "\n";
			
			//general calculation for the pockets 
			Double p = (1.5 * p_concrete) / 10;
			
			//calculation of the number of bags of cement for the pockets of the blocks
			Double p_cement = Math.ceil(p / 1.23);
			e += "Number of bags of cement for pockets: " + p_cement + "\n";
			
			//calculates the volume of sand required for the block pockets 
			Double p_sand = p * 3;
			e += "Volume of sand in block pockets (cubic feet): " + p_sand + "\n";
			
			//calculates the volume of gravel required for the block pockets 
			Double p_gravel = p * 6;
			e += "Volume of gravel in pockets (cubic feet): " + p_gravel + "\n";
			
			//calculates the total bags of cement required for the construction
			Double t_cement = j_cement + p_cement;
			e += "Total bags of cement: " + t_cement + "\n";
			
			//calculates the total volume of sand required for the construction 
			Double t_sand = j_sand + p_sand;
			e += "Total volume of sand (cubic feet): " + t_sand + "\n";
			
			
			
			return e;
		}	
		
		
		/**
		 * @param args
		 */

		public static void main(String[] args) {
			System.out.println(estWall.estQuan(45,60));
			
			// TODO Auto-generated method stub

		}

}
