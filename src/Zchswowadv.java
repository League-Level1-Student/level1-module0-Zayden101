import javax.swing.JOptionPane;

/*
	 *    Copyright (c) The League of Amazing Programmers 2013-2019
	 *    Level 1
	 */


	public class Zchswowadv  {
		public static void main(String[] args) {
	
			
			
		String o1 = JOptionPane.showInputDialog("A: Explore   B: Get wood");

if (o1.equals("A")) {
	JOptionPane.showMessageDialog(null, "You explore a bit, and find a cave");
	String o2 = JOptionPane.showInputDialog("A: Explore cave   B: Continue exploring");
	
	if (o2.equals("B")) {
		JOptionPane.showMessageDialog(null, "You explore a bit more, come across a village");
		String o3 = JOptionPane.showInputDialog("A: Explore village   B: Continue exploring");
		
		//o3 B send =s back to o1
		
		if (o3.equals("A")) {
			JOptionPane.showMessageDialog(null, "You explore the village, and find a blacksmith house. In the chest, the is 8 obsidian, 2 diamonds, an iron pickaxe, and an iron chestplate");
			String o4 = JOptionPane.showInputDialog("A: Take the stuff   B: Leave it there");
			
			if (o4.equals("A")) {
				JOptionPane.showMessageDialog(null, "You take the stuff, and decide to continue exploring. You eventually come across a huge mine with many ores inside, and also many mobs inside");
				String o5 = JOptionPane.showInputDialog("A: Continue exploring   B: Explore cave");
				
				if (o5.equals("B")) {
					JOptionPane.showMessageDialog(null, "You explore the cave, you come across an ender man, and manage to obtain an ender pearl. You mine many ores with your pickaxe, while also using it to fight off mobs. Finally, you come across a lava pool.");
					String o6 = JOptionPane.showInputDialog("A: Smelt you iron   B: Leave it be");
					
					if (o6.equals("A")) {
						JOptionPane.showMessageDialog(null, "You start smelting your iron, and finally have enough for a bucket. Lucky for you, there is water nearby.");
						JOptionPane.showMessageDialog(null, "You grab the water and finish the portal. You get gravel to make a flint and steel and light the portal. Scared to die, you put all you stuff in a chest, and all you have in your inventory is 2 diamonds and a flint and steel");
						JOptionPane.showMessageDialog(null, "Not sure of your decision, you rethink this.");
						JOptionPane.showMessageDialog(null, "Do you want to go to the nether, or go explore the surface.");
						String o15 = JOptionPane.showInputDialog("A: Go to the nether   B: Go to the surface.");
						
						if (o15.equals("A")) {
						JOptionPane.showMessageDialog(null, "You enter the portal and start walking, but all of a sudden you are knocked of the cliff by a ghast.");
						String o7 = JOptionPane.showInputDialog("A: Accept your fate   B: (TIME DELAY) Use the ender pearl.");
						
						if (o7.equals("B")) {
							JOptionPane.showMessageDialog(null, "You use your quick thinking and throw the ender pearl, managing to save yourself.");
							JOptionPane.showMessageDialog(null, "But you didn't think fast enough, and accidently enderpearl right on top of a blaze spawner.");
							JOptionPane.showMessageDialog(null, "Suddenly multiple fireballs come flying towards you.");
							String o8 = JOptionPane.showInputDialog("A: Fight them off with your pickaxe   B: Run");
							
							if (o8.equals("B")) {
								JOptionPane.showMessageDialog(null, "You run for your life, trying to escape the fiery monsters.");
								JOptionPane.showMessageDialog(null, "Suddenly, an idea pops into your head. Immediately, you hide behind a zombified piglin.");
								JOptionPane.showMessageDialog(null, "The pig charges after the blaze in a rage after being hit by one of fireballs");
								JOptionPane.showMessageDialog(null, "The pig manages to kill many of the blazes before being taken out");
								JOptionPane.showMessageDialog(null, "You get ready to run, but notice that the pig left many blaze rods on the ground");
								String o9 = JOptionPane.showInputDialog("A: Go for the blaze rods   B: Leave then behind");
								
								if (o9.equals("A")) {
									JOptionPane.showMessageDialog(null, "You quickly run and grab the blaze rods, and then turn around run.");
									JOptionPane.showMessageDialog(null, "You find the portal, and start angling yourself towards it, but then realize that there is a bastion nearby.");
									JOptionPane.showMessageDialog(null, "You also notice a ghast nearby, that is about to launch its explosive flaming missile.");
									String o10 = JOptionPane.showInputDialog("A: Go for the portal   B: Go for the bastion");
									
									//if B, ghast shoots you while going to the bastion, and you end up dying
									
									if (o10.equals("A")) {
										JOptionPane.showMessageDialog(null, "You make a run for run portal, but right as you make it, the ghast shatters the portal.");
										String o11 = JOptionPane.showInputDialog("A: Go for the Bastion   B: Go for the bastion");
										
										if (o11.equals("A") || o11.equals("B")) {
											JOptionPane.showMessageDialog(null, "You make a run for the bastion, but as your are almost there, the ghast fireball hits a pile of gold blocks.");
											JOptionPane.showMessageDialog(null, "Gold rains from above onto the piglins, and you are thrown hundreds of different items.");
											JOptionPane.showMessageDialog(null, "After seeing a pile items containing obsidian and ender pearls, you run towards it.");
											JOptionPane.showMessageDialog(null, "Not only do you obtain enough ender pearls for the strong hold, but you now have enough obsidian to make a portal.");
											String o12 = JOptionPane.showInputDialog("A: Make a Nether portal and escape   B: Say and collect the rest of the loot");
											
							 				if (o12.equals("A")) {
												JOptionPane.showMessageDialog(null, "You build the Nether portal, and escape.");
												JOptionPane.showMessageDialog(null, "And then, you see the most amazing thing ever.");
												JOptionPane.showMessageDialog(null, "You spawned at the strong hold.");
												String o13 = JOptionPane.showInputDialog("A: Go get more materials   B: Go find the portal");
												
												if (o13.equals("B")) {
												JOptionPane.showMessageDialog(null, "While knowing that you don't have nearly enough materials the fight the Ender Dragon, you start looking for the portal room.");
												JOptionPane.showMessageDialog(null, "But then, an idea hits your head. You have enough diamonds to make a diamond sword.");
												JOptionPane.showMessageDialog(null, "Libraries in the stronghold contain cobweb.");
												JOptionPane.showMessageDialog(null, "Cobweb drops string.");
												JOptionPane.showMessageDialog(null, "String can be crafted into wool.");
												JOptionPane.showMessageDialog(null, "Wool can be crafted into beds.");
												JOptionPane.showMessageDialog(null, "And beds explode in the End.");
												JOptionPane.showMessageDialog(null, "You were wrong, you do have enough materials to beat the Ender Dragon.");
												String o14 = JOptionPane.showInputDialog("A: Get beds   B: Go into the portal with what you have now");
												
												if (o14.equals("A")) {
													JOptionPane.showMessageDialog(null, "You get beds, and are now ready to fight the Ender Dragon.");
													JOptionPane.showMessageDialog(null, "You jump into the End portal, and make your way to the center.");
													JOptionPane.showMessageDialog(null, "To win you have to time all four beds perfectly.");
													JOptionPane.showMessageDialog(null, "Only tap when the screen is green.");

													//stays showing a Video called explode the bed for 3 sec, goes to a video called explode the bed for 0.5 seconds while the screen is green, then goes back to a video called explode the bed for 3 seconds while the screen is normal color
													JOptionPane.showMessageDialog(null, "You Win");
															
													}
												}
							 				}
										}
									}
								}
							}
						}
					}	
				}	
					if (o6.equals("B")) {
						JOptionPane.showMessageDialog(null, "You leave the lava pool be, it's way too dangerous to stay.");
						JOptionPane.showMessageDialog(null, "You find a safe place to stay. You get your furnace out. You start smelting iron.");
						JOptionPane.showMessageDialog(null, "However, you get interupted by a creeper. Do you want to jump out of the way, or stay and save your iron");	
						String o20 = JOptionPane.showInputDialog("A: Save yourself   B: Save your iron");

						if (o20.equals("B")) {
							JOptionPane.showMessageDialog(null, "You try to save your iron. You successfully get all yor iron out, but the creeper explodes.");
							JOptionPane.showMessageDialog(null, "You are now on 2 hearts, and have to be cearful. You have 9 iron ingots, but dont know what to do with them.");
							JOptionPane.showMessageDialog(null, "Your iron pickaxe is low, and you dont have enough duriblity to make another furnace, and you only have 1 stick.");	
							String o21 = JOptionPane.showInputDialog("A: Iron sword/bucket   B: Iron boots,helmet   C: Save it");

							if (o21.equals("A")) {
								JOptionPane.showMessageDialog(null, "You decide to make a sword and a bucket, if your in a sticky siduation, you would rather fight it out.");
								JOptionPane.showMessageDialog(null, "And a bucket, just in case of emergency.");
								
								if (o21.equals("A")) {
									JOptionPane.showMessageDialog(null, "You decide to make a sword and a bucket, if your in a sticky siduation, you would rather fight it out.");
									JOptionPane.showMessageDialog(null, "And a bucket, just in case of emergency.");

							
							
							
					}
					
				}
				
			}	
			
			if (o4.equals("B")) {
				JOptionPane.showMessageDialog(null, "You decide to leave the stuff there... for some reason.");
				JOptionPane.showMessageDialog(null, "!!!continue!!!");
			}
		}	


	}	
	
		
	if (o2.equals("A")) {
		JOptionPane.showMessageDialog(null, "You decide to explore the cave, and after exploring, you find a ruined portal.");
		JOptionPane.showMessageDialog(null, "You also find 2 diamonds while exploring a mineshaft. You have enough materials, and go to the nether.");
		//sends you to o6 (edit o6 into 2 parts with another option to enter the portal and go back to the surface.)
	}

		
		
}
	
				

	
if (o1.equals("B")) {
	JOptionPane.showMessageDialog(null, "You decide to get wood. You go to a tree, get wood, turn it into planks.");
	JOptionPane.showMessageDialog(null, "do you want to make tools and a crafting table, or save your wood.");
	String o16 = JOptionPane.showInputDialog("A: Make tools   B: Save");
	
		if (o16.equals("A")) {
			JOptionPane.showMessageDialog(null, "You decide to make tools. You make a wooden sword and pickaxe.");
			JOptionPane.showMessageDialog(null, "You see a cave near by.");
			String o17 = JOptionPane.showInputDialog("A: Enter the cave   B: Get more wood");
						
				if (o17.equals("A")) {
				JOptionPane.showMessageDialog(null, "Because of the deep hole blocking your path, you bridge over.");
				JOptionPane.showMessageDialog(null, "You realize that you used all of your planks");
				JOptionPane.showMessageDialog(null, "You walk through the cave, realizing you have nothing else in your inventory.");
				JOptionPane.showMessageDialog(null, "But you start regretting your decision.");
				JOptionPane.showMessageDialog(null, "Do you want explore the outside world, or go back down the cave.");
				String o18 = JOptionPane.showInputDialog("A: Explore   B: Go back down the cave");
						
				//if o18 = A, goes to o1
				
				if (o17.equals("B")) {
				JOptionPane.showMessageDialog(null, "You get more wood. Now, you have enough for a full set of tools and a stack extra.");
				String o19 = JOptionPane.showInputDialog("A: Explore the cave   B: Explore the land around");

							
						if (o18.equals("B")) {
						JOptionPane.showMessageDialog(null, "You go back down the cave, and end up finding some diamonds.");
						JOptionPane.showMessageDialog(null, "You walk twords them, and start hearing a strange noise");
						JOptionPane.showMessageDialog(null, "You turm around to see a creeper blow you up, and kill you.");

							///===DEATH===///
					}
				}
			}
		}
	}
		

}
	
		
		
		
		
		
		

	
	
	}
	
	
//o1 B	If you save your wood, you go into the cave and use it all to bridge to the entrance. You choose either to explore, which sends you to o2, or you can go down the cave, and find a lava pool, and a creeper explodes and you fall into the lava and it kills you.

//o2 A	You decide to explore the cave, and after exploring, you find a ruined portal. You also find 2 diamonds while exploring a mineshaft. You have enough materials, and go to the nether. Which sends you to o6 (edit o6 into 2 parts with another option to enter the portal and go back to the surface.)


//o3 B	You decide to keep exploring, waiting until you find something good. Eventually, you find somewhere that looks vaguely familiar. You think for a little, and then realize where you are, you make it back to spawn. Sends you to o1




	/*
	if (o.equals("")) {
JOptionPane.showMessageDialog(null, ".");
String o = JOptionPane.showInputDialog("A:    B: ");
		
}
*/





